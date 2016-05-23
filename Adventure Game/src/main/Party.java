package main;

import java.util.ArrayList;
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
	
	public Iterable<Character> getParty() {
		return party;
	}
	
	public void addPartyMember(Character member) {
		party.add(member);
	}

}
