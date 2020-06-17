
package com.mse.tjcmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.mse.tjcmod.item.EspressoItem;
import com.mse.tjcmod.MseTjcmodModElements;

@MseTjcmodModElements.ModElement.Tag
public class TjcItemGroup extends MseTjcmodModElements.ModElement {
	public TjcItemGroup(MseTjcmodModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtjc") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(EspressoItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
