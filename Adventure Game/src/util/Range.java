package util;

public class Range {
	
	private int min, max;
	
	public Range(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	public int getMin() {
		return min;
	}
	
	public int getMax() {
		return max;
	}
	
	public int getRandom() {
		return (int) (Math.random() * (max - min) + min + 1);
	}

}
