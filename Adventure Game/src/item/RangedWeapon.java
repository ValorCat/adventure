package item;

import util.Range;

public class RangedWeapon implements Weapon {

	private String name;
	private int hitBonus;
	private Range damage;
	private Class<Item> ammoType;
	private ItemSize size;
	private int value;
	private float weight;
	
	public RangedWeapon(String name, int hitBonus, int minDamage, int maxDamage, Class<Item> ammoType,
			ItemSize size, int value, float weight) {
		this.name = name;
		this.hitBonus = hitBonus;
		this.damage = new Range(minDamage, maxDamage);
		this.ammoType = ammoType;
		this.size = size;
		this.value = value;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getHitBonus() {
		return hitBonus;
	}
	
	public Range getDamage() {
		return damage;
	}
	
	public Class<Item> getAmmoType() {
		return ammoType;
	}
	
	public ItemSize getSize() {
		return size;
	}
	
	public int getValue() {
		return value;
	}

	public float getWeight() {
		return weight;
	}
	
	public static void main(String[] args) {
		RangedWeapon bow = new RangedWeapon("longbow", 0, 1, 8, Item.class, ItemSize.HEAVY, 80, 6);
	}
	
}
