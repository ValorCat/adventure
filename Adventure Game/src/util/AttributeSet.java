package util;

public class AttributeSet {
	
	private int cha, cun, dex, str, vit, wil;

	public AttributeSet() {
		this(0, 0, 0, 0, 0, 0);
	}
	
	public AttributeSet(int cha, int cun, int dex, int str, int vit, int wil) {
		this.cha = cha;
		this.cun = cun;
		this.dex = dex;
		this.str = str;
		this.vit = vit;
		this.wil = wil;
	}

	public int getCha() {
		return cha;
	}

	public void setCha(int cha) {
		this.cha = cha;
	}

	public int getCun() {
		return cun;
	}

	public void setCun(int cun) {
		this.cun = cun;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	public int getWil() {
		return wil;
	}

	public void setWil(int wil) {
		this.wil = wil;
	}
	
	
	
	// cha, cun, dex, str, vit, wil

}
