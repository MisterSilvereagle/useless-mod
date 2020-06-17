package com.mse.tjcmod.procedures;

import net.minecraft.util.Hand;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import com.mse.tjcmod.potion.CoffeePotion;
import com.mse.tjcmod.item.EmptyMugItem;
import com.mse.tjcmod.MseTjcmodModElements;

@MseTjcmodModElements.ModElement.Tag
public class EspressoDrunkenProcedure extends MseTjcmodModElements.ModElement {
	public EspressoDrunkenProcedure(MseTjcmodModElements instance) {
		super(instance, 17);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EspressoDrunken!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(CoffeePotion.potion, (int) 1200, (int) 1));
		if (entity instanceof LivingEntity) {
			ItemStack _setstack = new ItemStack(EmptyMugItem.block, (int) (1));
			_setstack.setCount((int) 1);
			((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}
	}
}
