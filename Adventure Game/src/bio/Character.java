package bio;

import item.EquipmentSet;
import item.Inventory;
import util.AttributeSet;
import util.Score;

public class Character {
	
	private String name;
	private AttributeSet stats;
	private Score health;
	private EquipmentSet gear;
	private Inventory items;
	
	public Character(String name, int health) {
		this.name = name;
		this.stats = new AttributeSet();
		this.health = new Score(health);
		this.gear = new EquipmentSet(EquipmentSet.SetType.HUMANOID);
		this.items = new Inventory();
	}
	
	public String getName() {
		return name;
	}
	
	public AttributeSet getAttributes() {
		return stats;
	}
	
	public Score getHealth() {
		return health;
	}
	
	public EquipmentSet getGear() {
		return gear;
	}
	
	public Inventory getItems() {
		return items;
	}

}
