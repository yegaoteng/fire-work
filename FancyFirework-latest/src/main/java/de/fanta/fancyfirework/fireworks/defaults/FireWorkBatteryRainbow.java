package de.fanta.fancyfirework.fireworks.defaults;

import de.fanta.fancyfirework.FancyFirework;
import de.fanta.fancyfirework.utils.ColorUtils;
import de.fanta.fancyfirework.utils.CustomFireworkHeads;
import java.util.UUID;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Color;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;

public class FireWorkBatteryRainbow extends FireWorkBattery {

    private static final FancyFirework plugin = FancyFirework.getPlugin();

    public FireWorkBatteryRainbow() {
        super(new NamespacedKey(FancyFirework.getPlugin(), "battery_rainbow"));
    }

    @Override
    protected ItemStack createItemStack() {
        ItemStack itemStack = CustomFireworkHeads.getCustomTextureHead(UUID.fromString("a4873b7d-e892-4502-b435-a6090b3d5210"), "Firework Rocket Rainbow",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjU1ZWE0M2U1OTI3ODVkMDE2YWNkZWVhOWE0YTZmOWNmMjJjMjc1M2U2OTU0MDVlOGM4M2QyZTA5ZWJjZjY0NyJ9fX0=");
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.of("#f26970") + "七" + ChatColor.of("#f88e66") + "彩" + ChatColor.of("#ffb35c") + "缤" + ChatColor.of("#fbcb60") + "纷" + ChatColor.of("#f7e364") + "彩" + ChatColor.of("#b4f07c") + "虹" + ChatColor.of("#71fe94") + "烟" + ChatColor.of("#73d0c9") + "花" + ChatColor.of("#75a3ff") + "绚" + ChatColor.of("#cd70ff") + "丽");
        meta.setLore(FancyFirework.getPlugin().getConfig().getStringList("itemlore"));
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    @Override
    public Color randomColor() {
        return ColorUtils.getColor(plugin.getTime(), 0.1);
    }
}


