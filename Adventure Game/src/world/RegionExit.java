package world;

public class RegionExit {
	
	private String name;
	private String descriptor;
	private String enterText;
	private int destinationID;
	
	public RegionExit(String name, int destinationID, String descriptor, String enterText) {
		this.name = name;
		this.destinationID = destinationID;
		this.descriptor = descriptor;
		this.enterText = enterText;
	}

	public String getName() {
		return name;
	}

	public String getDescriptor() {
		return descriptor;
	}

	public String getEnterText() {
		return enterText;
	}
	
	public int getDestinationID() {
		return destinationID;
	}

}
