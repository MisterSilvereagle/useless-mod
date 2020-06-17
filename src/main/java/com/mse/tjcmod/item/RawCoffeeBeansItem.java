
package com.mse.tjcmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.mse.tjcmod.itemgroup.TjcItemGroup;
import com.mse.tjcmod.MseTjcmodModElements;

@MseTjcmodModElements.ModElement.Tag
public class RawCoffeeBeansItem extends MseTjcmodModElements.ModElement {
	@ObjectHolder("mse_tjcmod:raw_coffee_beans")
	public static final Item block = null;
	public RawCoffeeBeansItem(MseTjcmodModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(TjcItemGroup.tab).maxStackSize(64));
			setRegistryName("raw_coffee_beans");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
