package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bio.Character;

public class Party {
	
	private List<Character> party;
	
	public Party(Character... chars) {
		party = new ArrayList<Character>();
		for (Character c : chars) {
			party.add(c);
		}
	}
	
	public Iterator<Character> getParty() {
		return party.iterator();
	}
	
	public void addPartyMember(Character member) {
		party.add(member);
	}

}
