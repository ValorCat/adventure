package bio;

import item.EquipmentSet;
import item.Inventory;
import util.PronounSet;
import util.Score;

public class Character {
	
	private String name;
	private PronounSet pronouns;
	private AttributeSet stats;
	private SkillSet skills;
	private Score health;
	private EquipmentSet gear;
	private Inventory items;
	
	public Character(String name, String sexPreset, int health) {
		this.name = name;
		this.pronouns = new PronounSet(sexPreset);
		this.stats = new AttributeSet();
		this.skills = new SkillSet();
		this.health = new Score(health);
		this.gear = new EquipmentSet(EquipmentSet.SetType.HUMANOID);
		this.items = new Inventory();
	}
	
	public String getName() {
		return name;
	}
	
	public PronounSet getPronouns() {
		return pronouns;
	}
	
	public AttributeSet getAttributes() {
		return stats;
	}
	
	public SkillSet getSkills() {
		return skills;
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
