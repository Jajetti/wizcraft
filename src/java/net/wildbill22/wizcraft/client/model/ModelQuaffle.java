package net.wildbill22.wizcraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelQuaffle extends ModelBase {
	// fields
	ModelRenderer Shape1;

	public ModelQuaffle() {
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 6, 6, 6);
		Shape1.setRotationPoint(-3F, -6F, -3F);
		setRotation(Shape1, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		//super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Shape1.render(f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
