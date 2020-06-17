
package com.mse.tjcmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import com.mse.tjcmod.itemgroup.TjcItemGroup;
import com.mse.tjcmod.MseTjcmodModElements;

@MseTjcmodModElements.ModElement.Tag
public class MilkBottleItem extends MseTjcmodModElements.ModElement {
	@ObjectHolder("mse_tjcmod:milk_bottle")
	public static final Item block = null;
	public MilkBottleItem(MseTjcmodModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(TjcItemGroup.tab).maxStackSize(1).food((new Food.Builder()).hunger(2).saturation(0.3f).build()));
			setRegistryName("milk_bottle");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.DRINK;
		}
	}
}
