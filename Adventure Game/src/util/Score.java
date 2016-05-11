package util;

public class Score {
	
	private int value = 0;
	private int max;
	
	public Score(int maxValue) {
		this.max = maxValue;
	}
	
	public Score(int value, int maxValue) {
		this(maxValue);
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public int getMaximum() {
		return max;
	}
	
	public float getPercent() {
		return value / max;
	}
	
	public int getAmountUntilFull() {
		return max - value;
	}
	
	public void update(int amount) {
		value += amount;
		if (value > max)
			value = max;
	}
	
	public void reset(int newValue) {
		value = newValue;
		if (value > max)
			value = max;
	}
	
	public void updateMax(int amount) {
		max += amount;
	}
	
	public void resetMax(int newMax) {
		value = newMax;
	}
	
	public void refill() {
		value = max;
	}

}
