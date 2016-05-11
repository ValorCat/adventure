package item;

import java.util.HashMap;
import java.util.Map;

public class EquipmentSet {

	private Map<String, Item> gear;
	
	public static enum SetType {
		HUMANOID(new String[] {"drawn", "offhand", "head"});
		
		private String[] slots;
		
		SetType(String[] slotNames) {
			this.slots = slotNames;
		}
		
		public String[] getSlotNames() {
			return slots;
		}
	}
	
	public EquipmentSet() {
		gear = new HashMap<String, Item>();
	}
	
	public EquipmentSet(SetType type) {
		this();
		for (String slotName : type.getSlotNames()) {
			gear.put(slotName, null);
		}
	}
	
	public Item getItemInSlot(String slotName) {
		return gear.get(slotName);
	}

	public void placeItemInSlot(String slotName, Item item) {
		gear.replace(slotName, item);
	}

	public void switchItems(String slotName1, String slotName2) {
		Item temp = gear.replace(slotName1, gear.get(slotName2));
		gear.replace(slotName2, temp);
	}

	public void addGearSlot(String slotName) {
		gear.put(slotName, null);
	}

}
