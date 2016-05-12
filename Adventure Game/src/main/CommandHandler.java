package main;

import bio.Skill;

public class CommandHandler {
	
	private static Character target;
	
	public static void parseInput(String input) {
		String[] words = input.split(" ");
		switch (words[0]) {
		case "listen":
			makeSkillCheck(Skill.PERCEPTION);
			break;
		}
	}
	
	public static void updateTarget(Character newTarget) {
		target = newTarget;
	}
	
	private static void makeSkillCheck(Skill skill) {
		// must know character(s), skill, and DC
	}

}
