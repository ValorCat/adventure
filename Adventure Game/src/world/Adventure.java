package world;

import java.util.ArrayList;
import java.util.List;

public class Adventure {
	
	private List<Region> regions;
	
	public Adventure() {
		regions = new ArrayList<Region>();
	}
	
	public Region getRegion(int regionID) {
		return regions.get(regionID);
	}
	
	public void addRegion(Region region) {
		regions.add(region);
	}

}
