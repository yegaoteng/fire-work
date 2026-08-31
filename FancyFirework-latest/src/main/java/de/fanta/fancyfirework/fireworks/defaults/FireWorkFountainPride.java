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

public class FireWorkFountainPride extends FireWorkFountain {

    private static final FancyFirework plugin = FancyFirework.getPlugin();

    public FireWorkFountainPride() {
        super(new NamespacedKey(FancyFirework.getPlugin(), "fountain_pride"));
    }

    @Override
    protected ItemStack createItemStack() {
        ItemStack itemStack = CustomFireworkHeads.getCustomTextureHead(UUID.fromString("92da8066-af3c-408e-a7c1-ffe11a0de82a"), "Candle (rainbow)",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTNhYmM4MjM3MWZlN2U3Njc5YzBlODhkMWUzZjc1MGRlYjUwYmQwZjVmMzE3N2Y1N2I4NWMyNzg5MzllNDc0MiJ9fX0=");
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.of("#eb000c") + "六" + ChatColor.of("#f24206") + "色" + ChatColor.of("#fa8500") + "多" + ChatColor.of("#f7ac00") + "彩" + ChatColor.of("#f5d400") + "缤" + ChatColor.of("#7ae920") + "纷" + ChatColor.of("#00ff40") + "喷" + ChatColor.of("#00aa9f") + "花" + ChatColor.of("#0055ff") + "绚" + ChatColor.of("#a600ff") + "丽");
        meta.setLore(FancyFirework.getPlugin().getConfig().getStringList("itemlore"));
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    @Override
    public Color randomColor() {
        return ColorUtils.getColor(plugin.getTime(), 2);
    }

}



