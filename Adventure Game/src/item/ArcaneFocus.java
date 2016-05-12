package item;

import util.Range;

public class ArcaneFocus implements Weapon {

	private String name;
	private int spellBonus;
	private int hitBonus;
	private Range damage;
	private ItemSize size;
	private int value;
	private float weight;
	
	public ArcaneFocus(String name, int spellBonus, int hitBonus, int minDamage, int maxDamage,
			ItemSize size, int value, float weight) {
		this.name = name;
		this.spellBonus = spellBonus;
		this.hitBonus = hitBonus;
		this.damage = new Range(minDamage, maxDamage);
		this.size = size;
		this.value = value;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getSpellBonus() {
		return spellBonus;
	}
	
	public int getHitBonus() {
		return hitBonus;
	}
	
	public Range getDamage() {
		return damage;
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
	
}
