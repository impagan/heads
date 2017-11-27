package me.pagan.heads.manager;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.sun.xml.internal.messaging.saaj.util.Base64;
import java.lang.reflect.Field;
import java.util.UUID;
import me.matgsan.heads.enums.Heads;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

/**
 *
 * @author Maicon (MrPagan)
 */
public class HeadsManager {

    public static void downloadHeadsAndApply() {
        for (Heads enumHead : Heads.values()) {
            ItemStack head = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
            GameProfile profile = new GameProfile(UUID.randomUUID(), null);
            byte[] encodedURL = Base64.encode(String.format("{textures:{SKIN:{url:\"http://textures.minecraft.net/texture/%s\"}}}", enumHead.getTexture()).getBytes());
            profile.getProperties().put("textures", new Property("textures", new String(encodedURL)) {
            });
            enumHead.setGameProfile(profile);
            SkullMeta headMeta = (SkullMeta) head.getItemMeta();
            Field profileField = null;
            try {
                profileField = headMeta.getClass().getDeclaredField("profile");
                profileField.setAccessible(true);
                profileField.set(headMeta, enumHead.getGameProfile());
            } catch (NoSuchFieldException | IllegalArgumentException | IllegalAccessException e1) {
                e1.printStackTrace();
            }
            headMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6" + enumHead.getName()));
            head.setItemMeta(headMeta);
        }
    }
    
}
