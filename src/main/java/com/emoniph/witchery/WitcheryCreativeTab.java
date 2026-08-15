/*
 * Decompiled with CFR 0.152.
 */
package com.emoniph.witchery;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WitcheryCreativeTab extends CreativeTabs {
    public WitcheryCreativeTab(int id, String label) {
        super(id, label);
    }

    public Item getTabIconItem() {
        return WitcheryItems.WitcheryBrew;
    }
}
