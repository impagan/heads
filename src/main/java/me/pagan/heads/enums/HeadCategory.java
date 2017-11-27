package me.pagan.heads.enums;

import org.bukkit.ChatColor;

/**
 *
 * @author Maicon (MrPagan)
 */
public enum HeadCategory {

    ALPHABET("Alfabeto"),
    BLOCKS("Blocos e Objetos"),
    FOOD("Comida e Bebidas"),
    COLORS("Cores"),
    SPECIALS("Especiais"),
    MOBS("Mobs"),
    CHARACTERS("Personagens e Jogos"),
    MISC("Diversos");
    private final String name;

    private HeadCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public static HeadCategory getHeadCategoryByDisplayName(String displayName) {
        displayName = ChatColor.stripColor(displayName);
        for (final HeadCategory category : values()) {
            if (category.getName().equalsIgnoreCase(displayName)) {
                return category;
            }
        }
        return null;
    }
}
