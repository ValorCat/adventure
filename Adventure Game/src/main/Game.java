package main;

import java.util.Iterator;

import bio.Character;
import item.Item;
import item.ItemSize;
import item.MeleeWeapon;
import util.Output;
import world.Adventure;
import world.Region;
import world.RegionExit;

public class Game {

	private static Party party;
	private static Adventure adv;
	
	public static void main(String[] args) {
		setup();
		Output.display(adv.getRegion(0).getDescriptorOnEntrance(0));
		Output.separate();
		displayDrawnItems();
	}
	
	public static void displayDrawnItems() {
		Iterator<Character> iter = party.getParty();
		while (iter.hasNext()) {
			Character player = iter.next();
			Item drawnItem = player.getGear().getItemInSlot("drawn");
			Item offhandItem = player.getGear().getItemInSlot("offhand");
			if (drawnItem != null) {
				Output.display("%s holds %s %s. ", player.getName(), player.getPronouns().getPossessive(), drawnItem.getName());
			} else if (offhandItem != null) {
				Output.display("%s holds only %s %s. ", player.getName(), player.getPronouns().getPossessive(), offhandItem.getName());
			} else {
				Output.display("%s is unarmed. ", player.getName());
			}
		}
	}
	
	public static void setup() {
		party = new Party();
		
		Character talion = new Character("Talion", "male", 10);
		talion.getGear().placeItemInSlot("drawn", new MeleeWeapon("dagger", 1, 1, 4, true, true, ItemSize.LIGHT, 2, 0.5f));
		party.addPartyMember(talion);
		
		Character lorath = new Character("Lorath", "male", 6);
		lorath.getGear().placeItemInSlot("drawn", new MeleeWeapon("dagger", 1, 1, 4, true, true, ItemSize.LIGHT, 2, 0.5f));
		party.addPartyMember(lorath);
		
		party.addPartyMember(new Character("Jozan", "male", 8));
		
		adv = new Adventure();
		
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
		
		adv.addRegion(caveEnter);
		adv.addRegion(cratesRoom);
	}

}
