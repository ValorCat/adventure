package world;

import java.util.ArrayList;
import java.util.List;

public class Region {
	
	private String descriptor;
	private List<RegionExit> exits;

	public Region(String descriptor) {
		this.descriptor = descriptor;
		this.exits = new ArrayList<RegionExit>();
	}

	public String getBaseDescriptor() {
		return descriptor;
	}

	public String getDescriptorOnEntrance(int exitID) {
		String enterText = exits.get(exitID).getEnterText();
		String otherExitText = "";
		for (int i = 0; i < exits.size(); i++) {
			if (i != exitID) {
				otherExitText += " " + exits.get(i).getDescriptor();
			}
		}
		return enterText + " " + descriptor + otherExitText;
	}
	
	public RegionExit getExit(int exitID) {
		return exits.get(exitID);
	}
	
	public void addExit(RegionExit exit) {
		exits.add(exit);
	}
	
}
