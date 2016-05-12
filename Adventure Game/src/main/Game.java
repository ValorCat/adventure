package main;

import java.util.Iterator;

import bio.Character;
import item.ArcaneFocus;
import item.Item;
import item.ItemSize;
import item.MeleeWeapon;
import util.Display;
import world.Adventure;
import world.Region;
import world.RegionExit;

public class Game {

	public static Party party;
	public static Adventure quest;
	
	public static void main(String[] args) {
		setup();
		Display.write(quest.getRegion(0).getDescriptorOnEntrance(0));
		Display.space();
		displayDrawnItems();
		Display.space();
		try {
			while (isPartyAlive()) {
				String input = Display.input("[PARTY]");
				System.out.println("!!!! " + input);
				if (input.equals("x")) {
					throw new RuntimeException();
				}
				Display.space();
			}
		} catch (Exception e) {
			throw e;
		} finally {
			Display.closeInput();
		}
		Display.write("\nFarewell.");
	}
	
	public static void displayDrawnItems() {
		Iterator<Character> iter = party.getParty();
		while (iter.hasNext()) {
			Character player = iter.next();
			Item drawnItem = player.getGear().getItemInSlot("drawn");
			Item offhandItem = player.getGear().getItemInSlot("offhand");
			if (drawnItem != null) {
				Display.write("%s holds %s %s. ", player.getName(), player.getPronouns().getPossessive(), drawnItem.getName());
			} else if (offhandItem != null) {
				Display.write("%s holds only %s %s. ", player.getName(), player.getPronouns().getPossessive(), offhandItem.getName());
			} else {
				Display.write("%s is unarmed. ", player.getName());
			}
		}
		Display.space();
	}
	
	public static boolean isPartyAlive() {
		Iterator<Character> iter = party.getParty();
		while (iter.hasNext()) {
			if (!iter.next().getHealth().isEmpty()) {
				return true;
			}
		}
		return false;
	}
	
	public static void setup() {
		party = new Party();
		
		Character talion = new Character("Talion", "male", 10);
		talion.getGear().placeItemInSlot("drawn", new MeleeWeapon("dagger", 1, 1, 4, true, true, ItemSize.LIGHT, 2, 0.5f));
		party.addPartyMember(talion);
		
		Character lorath = new Character("Lorath", "male", 6);
		lorath.getGear().placeItemInSlot("drawn", new ArcaneFocus("wand", 1, 0, 1, 2, ItemSize.LIGHT, 25, 0.2f));
		party.addPartyMember(lorath);
		
		Character jozan = new Character("Jozan", "male", 8);
		jozan.getGear().placeItemInSlot("drawn", new MeleeWeapon("mace", 2, 1, 4, false, false, ItemSize.STANDARD, 3, 3));
		party.addPartyMember(jozan);
		
		quest = new Adventure();
		
		Region caveEnter = new Region("Several large boulders stand in the center of the chamber.");
		caveEnter.addExit(new RegionExit("entrance", -1,
				"Daylight streams through the cave entrance in the far wall.",
				"The cave widens into a small cavern."));
		caveEnter.addExit(new RegionExit("passage", 1,
				"A dark passage in the far wall leads onwards.",
				"The passage opens into a small cavern."));
		
		Region cratesRoom = new Region("Several wooden crates lie in a corner.");
		cratesRoom.addExit(new RegionExit("passage", 0,
				"A dark passage opens in the far wall.",
				"The dark passage opens into a small chamber lit by torchlight."));
		cratesRoom.addExit(new RegionExit("door", 2,
				"An aging wooden door stands in one wall.",
				"<!>"));
		
		quest.addRegion(caveEnter);
		quest.addRegion(cratesRoom);
	}
	
}
