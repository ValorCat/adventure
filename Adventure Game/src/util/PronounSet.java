package util;

public class PronounSet {
	
	private String subj, obj, poss;

	public PronounSet(String preset) {
		switch (preset) {
		case "male":
			this.subj = "he";
			this.obj = "him";
			this.poss = "his";
			break;
		case "female":
			this.subj = "she";
			this.obj = "her";
			this.poss = "her";
			break;
		}
	}
	
	public PronounSet(String subj, String obj, String poss) {
		this.subj = subj;
		this.obj = obj;
		this.poss = poss;
	}

	public String getSubject() {
		return subj;
	}

	public String getObject() {
		return obj;
	}

	public String getPossessive() {
		return poss;
	}
	
	public String getReflexive() {
		return obj + "self";
	}

}
