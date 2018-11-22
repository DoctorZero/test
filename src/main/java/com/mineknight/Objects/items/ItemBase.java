package com.mineknight.Objects.items;

import com.mineknight.Init.ItemInit;
import com.mineknight.Main;
import com.mineknight.Util.IHasModel;
import com.mineknight.proxy.ClientProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0,"inventory");
    }
}
