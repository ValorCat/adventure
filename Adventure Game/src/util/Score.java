package util;

public class Score {
	
	private int value;
	private int max;
	
	public Score(int maxValue) {
		this.value = maxValue;
		this.max = maxValue;
	}
	
	public Score(int value, int maxValue) {
		this.value = value;
		this.max = maxValue;
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
	
	public boolean isEmpty() {
		return value == 0;
	}
	
	public boolean isFull() {
		return value >= max;
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
