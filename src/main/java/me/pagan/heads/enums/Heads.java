/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.pagan.heads.enums;

import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author Luis Santos
 */
public enum Heads {
    NUTELLA("Nutella", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    JAM("Geléia", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    STRAWBERRY_JAM("Geléia de morango", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BREAD("Pão", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CHEESE("Queijo", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PANCAKES("Panquecas", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CAKE("Bolo", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CAN_OF_SOUP("Lata de sopa", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CUP_OF_MILK("Copo de leite", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CHOCOLATE_MUFFIN("Muffin de chocolate", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MUFFIN("Muffin", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    OREO("Oreo", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    COOKIE("Cookie", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CANDY_CANE("Bengala doce", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CHOCOLATE_BAR("Barra de chocolate", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    WHITE_CHOCOLATE_BAR("Barra de chocolate branco", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CHERRY("Cereja", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    WATERMELON("Melancia", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    HALLOWEEN_PUMPKIN("Abóbora de Halloween", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PUMPKIN("Abóbora", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    STRAWBERRY("Morango", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    COCONUT("Coco", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CARROT("Cenoura", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SUGAR_CANE("Cana de açúcar", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    HOT_CHOCOLATE("Chocolate quente", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CUP_OF_TEA("Copo de chá", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    TACO("Taco", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BAKED_POTATO("Batata assada", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BACON("Bacon", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    FRIES("Batata frita", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    HAMBURGUER("Hamburger", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    POPCORN("Pipoca", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    GLASS_OF_COCA_COLA("Copo de Coca-Cola", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    NIGIRI("Nigiri de salmão", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SUSHI("Sushi", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    RICE_BALL("Bola de arroz (Oniguiri)", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CORN("Milho", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    HAM_AND_CHEESE_SANDWICH("Sanduiche misto (Presunto e Queijo)", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BEER("Cerveja", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MEDIEVAL_BEER("Cerveja medieval", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    HAM("Presunto", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MUSHROOM_STEW("Sopa de cogumelos", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    ICE_CREAM("Sorvete", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    LEMON("Limão", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PLUM("Ameixa", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SALAD("Salada", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    WHITE_DONUT("Donut branco", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PINK_DONUT("Donut rosa", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CHOCOLATE_DONUT("Donut de chocolate", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    TURKEY("Perú", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MARSHMELLOW("Marshmellow", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BOWL_OF_RICE("Tigela de Arroz", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BOWL_OF_SPAGHETTI("Tigela de espaguete", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BOWL_OF_NOODLES("Tijela de miojo", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    TOMATO("Tomate", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    ORANGE("Laranja", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    GREEN_APPLE("Maça verde", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    LETTUCE("Alface", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PURPLE_GRAPES("Uvas roxas", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    GREEN_GRAPES("Uvas verdes", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SANDWICH("Sanduiche", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CHERRY_PIE("Torta de cereja", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PIE("Torta", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CHOCOLATE_CAKE("Bolo de chocolate", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PEPSI("Pepsi", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    COCA_COLA("Coca-Cola", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SPRITE("Sprite", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    FANTA("Fanta", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MOUNTAIN_DEW("Mountain Dew", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    RASPBERRY("Framboesa", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    APPLE("Maçã", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PLASTIC_CUP("Copo plástico", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    DR_ZOIDBERG("Dr. ZoidBerg", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    EWOK("Ewok", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    FREDDY_FAZBEAR("Freddy Fazbear", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BONNIE("Bonnie", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    FOXY("Foxy", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MARIONETTE("Marionette", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    ZELDA("Zelda", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    LINK("Link", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    STITCH("Stitch", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    GROOT("Groot", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    STARLORD("Star Lord", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BOBAFETT("Boba Fett", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    STORMTROOPER("Stormtrooper", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CLONE_TROOPER("Clone trooper", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    R2D2("R2D2", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    DARTH_VADER("Darth Vader", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PATRICK("Patrick", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BOB_ESPONJA("Bob Esponja", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    REI_DO_GELO("Rei do Gelo", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    JAKE("Jake", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    FINN("Finn", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SONIC("Sonic", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    META_KNIGHT("Meta Knight", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    NESS("Ness", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    WARIO("Wario", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    FOX_MCCLOUD("Fox McCloud", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PRINCESA_PEACH("Princesa Peach", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BOWSER("Bowser", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MARIO("Mario", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    LUIGI("Luigi", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    YOSHI("Yoshi", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    GOMBAA("Gombaa", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    ASH_KETCHUM("Ash Ketchum", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SAMUS("Samus", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    GANONDORF("Ganondorf", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    TOY_BONNIE("Toy Bonnie", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    TOY_FREDDY("Toy Freddy", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    TOY_CHICA("Toy Chica", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    TOY_MANGLE("Toy Mangle", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MENINO_BALAO("Menino balão", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    VEGETTA("Vegetta", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MASTER_CHIEF("Master Chief (Halo)", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BENDER("Bender", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    WHEATLEY("Wheatley", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    WILSON("Wilson", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BATMAN("Batman", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    JOKER("Coringa", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CAPTAIN_AMERICA("Capitão América", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    DEADPOOL("Deadpool", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    DOGE("Doge", HeadCategory.CHARACTERS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BLAZE("Blaze", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CAVE_SPIDER("Aranha das cavernas", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    GHAST("Ghast", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PIG_ZOMBIE("Porco zumbi", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    ENDERMAN("Enderman", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MAGMA_CUBE("Cubo de magma", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SLIME("Slime", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SPIDER("Aranha", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CHICKEN("Galinha", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PIG("Porco", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SHEEP("Ovelha", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    COW("Vaca", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    VILLAGER("Villager", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    GOLEM("Golem", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    HEROBRINE("Herobrine", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MUSHROOM_COW("Vaca de cogumelo", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    OCELOT("Ocelot", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    HORSE("Cavalo", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    GUARDIAN("Guardian", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MONKEY("Macaco", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    POLAR_BEAR("Urso Polar", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PENGUIN("Pinguin", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    TIGER("Tigre", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PANDA("Panda", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CAT("Gato", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    RABBIT("Coelho", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    KOALA("Koala", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CHINESE_DRAGON("Dragão chinês", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    DEAD_VILLAGER("Villager morto", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    WITHER("Wither", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SNOWMAN("Boneco de Neve", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BIRD("Pássaro", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BEE("Abelha", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    ENDER_DRAGON("Dragão do Ender", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    FISH("Peixe", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SALMON("Salmão", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    TURTLE("Tartaruga", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    ELEPHANT("Elefante", HeadCategory.MOBS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BEACH_BALL("Bola de praia", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SOCCER_BALL("Bola de futebol", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BASKET_BALL("Bola de basquete", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BOWLING_BALL("Bola de boliche", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CHESS_TABLE("Tabuleiro de xadrez", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    WHITE_DICE("Dado branco", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    RED_DICE("Dado vermelho", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BLACK_DICE("Dado preto", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    ILLUSION_BLOCK("Bloco de ilusão", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SKY_BLUE("Azul céu", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    LIGHT_SKY_BLUE("Azul céu claro", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BABY_BLUE("Azul bebê", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    LIGHT_GREEN("Verde claro", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    GREEN("Verde", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    GRASS_GREEN("Verde grama", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MEDIUM_GREEN("Verde médio", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    DARK_GREEN("Verde escuro", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    DARK_YELLOW("Amarelo escuro", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    YELLOW("Amarelo", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    LIGHT_ORANGE("Laranja claro", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    ORANGE_COLOR("Laranja", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    LIGHT_RED("Vermelho claro", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    RED("Vermelho", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    DARK_RED("Vermelho escuro", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    LIGHT_BLUE("Azul claro", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CYAN("Azul Ciano", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    DARKISH_BLUE("Azul pouco escuro", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BLUE("Azul", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    DARK_CIAN("Azul ciano escuro", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    DARK_BLUE("Azul escuro", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PURPLE("Roxo", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PINK("Rosa", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MAGENTA("Magenta", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CREAM("Creme", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BROWN("Marrom", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    WHITE("Branco", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    LIGHT_GREY("Cinza claro", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    GREY("Cinza", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BLACK("Preto", HeadCategory.COLORS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CAMERA("Câmera", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SPEAKER("Caixa de som", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    HEADLIGHT("Lanterna", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MICROWAVE("Micro-ondas", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    COMPUTER("Computador", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MONITOR("Monitor", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    TELEPHONE("Telefone", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    OLD_CAMERA("Câmera antiga", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    LANTERN_ON("Lamparina (ON)", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    LANTERN_OFF("Lamparina (OFF)", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    AQUARIUM("Aquário", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    INSTAGRAM("Instragam", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    RED_SIREN("Sirene vermelha", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BLUE_SIREN("Sirene azul", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BROKEN_TV("TV quebrada", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    POLICE_SIREN("Sirene de polícia", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    C4("C4", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    TOASTER("Torradeira", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    KEYPAD("Kaypad", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BLENDER("Liquidificador", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    GOLD_POT("Pote de ouro", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    LAVA_BUCKET("Balde de lava", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MILK_BUCKET("Balde de leite", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    EMPTY_BUCKET("Balde vazio", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    WATER_BUCKET("Balde de água", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MAILBOX("Caixa de Correio", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SPACE_HELMET("Capacete de astronauta", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    FOOTBALL_HELMET("Capacete de futebol americano", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    EYE("Olho", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    PINE("Pinha", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CANNONBALL("Bola de Chão", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    TARGET("Alvo", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CACTUS("Cacto", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    FACEBOOK("Facebook", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    TWITTER("Twitter", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    YOUTUBE("Youtube", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    FIREBALL("Bola de Fogo", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    GRILL("Grill", HeadCategory.BLOCKS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SKULL("Caveira", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MISSING_TEXTURE("???", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    REDDIT("Reddit", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    DIAMOND_HEAD("Cabeça de diamante", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    GOLD_HEAD("Cabeça de ouro", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    EMERALD_HEAD("Cabeça de Esmeralda", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    COCOA_BEAN("Semente de cacau", HeadCategory.FOOD, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SKYPE("Skype", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SCARED("Emote - Assustado", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    ANGEL("Emote - Anjo", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    EMBARASSED("Emote - Envergonhado", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    KISS("Emote - Beijinho", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SAD("Emote - Triste", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    COOL("Emote - Legal", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SUPRISED("Emote - Surpreso", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    DEAD("Emote - Morto", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CRYING("Emote - Chorando", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BIG_GRIN("Emote - Grande Sorriso", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    WINK("Emote - Piscadela", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    DERP("Emote - Derp", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MUSTACHE("Emote - Bigode", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BIG_SMILE("Emote - Grande Sorriso (Lingua)", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SMILE("Emote - Sorriso", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    NETHERLANDS("País - Holanda", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    NORWAY("País - Noruega", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SWEDEN("País - Suécia", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    EGYPT("País - Egito", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CHILE("País - Chile", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    MONACO("País - Mónaco", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    CANADA("País - Canadá", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    USA("País - Estados Unidos da América", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    BELGIUM("País - Bélgica", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    ITALY("País - Itália", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    ENGLAND("País - Inglaterra", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    ROMANIA("País - Roménia", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    GERMANY("País - Alemanha", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    SINGAPORE("País - Cingapura", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    NORTH_KOREA("País - Coreia do Norte", HeadCategory.MISC, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null),
    FRANCE("País - França", HeadCategory.SPECIALS, "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", null, null);
    
    private final String name;
    private final String texture;
    private GameProfile profile;
    private ItemStack head;
    private final HeadCategory category;

    private Heads(String name, HeadCategory category, String texture, GameProfile profile, ItemStack head) {
        this.name = name;
        this.texture = texture;
        this.profile = profile;
        this.head = head;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getTexture() {
        return texture;
    }

    public GameProfile getGameProfile() {
        return profile;
    }

    public ItemStack getHead() {
        return new ItemStack(head);
    }

    public HeadCategory getCategory() {
        return category;
    }
    
    public void setGameProfile(GameProfile profile) {
        this.profile = profile;
    }

    public void setHead(ItemStack head) {
        this.head = head;
    }

    public static List<Heads> getHeadByCategory(HeadCategory category) {
        List<Heads> heads = new ArrayList();
        for (Heads head : values()) {
            if (head.getCategory()== category) {
                heads.add(head);
            }
        }
        return heads;
    }

    public static Heads getRandomHead() {
        List<Heads> heads = Arrays.asList(values());
        Random random = new Random();
        int index = random.nextInt(heads.size());
        return heads.get(index);
    }

    public static Heads getRandomHeadFromCategory(HeadCategory category) {
        List<Heads> heads = getHeadByCategory(category);
        Random random = new Random();
        int index = random.nextInt(heads.size());
        return heads.get(index);
    }

    public static Heads getHeadByDisplayName(String displayName) {
        displayName = ChatColor.stripColor(displayName);
        for (Heads head : values()) {
            if (head.getName().equalsIgnoreCase(displayName)) {
                return head;
            }
        }
        return null;
    }
}
