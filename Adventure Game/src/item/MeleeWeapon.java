package item;

import util.Range;

public class MeleeWeapon implements Weapon {

	private String name;
	private int hitBonus;
	private Range damage;
	private boolean finesse;
	private boolean throwable;
	private ItemSize size;
	private int value;
	private float weight;
	
	public MeleeWeapon(String name, int hitBonus, int minDamage, int maxDamage, boolean finesse,
			boolean throwable, ItemSize size, int value, float weight) {
		this.name = name;
		this.hitBonus = hitBonus;
		this.damage = new Range(minDamage, maxDamage);
		this.finesse = finesse;
		this.throwable = throwable;
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
	
	public boolean isFinesse() {
		return finesse;
	}
	
	public boolean isThrowable() {
		return throwable;
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
