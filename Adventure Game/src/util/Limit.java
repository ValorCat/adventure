package util;

public class Limit {
	
	private float value = 0;
	private float max;
	
	public Limit(float maxValue) {
		this.max = maxValue;
	}
	
	public Limit(float value, float maxValue) {
		this(maxValue);
		this.value = value;
	}
	
	public float getValue() {
		return value;
	}
	
	public float getMaximum() {
		return max;
	}
	
	public float getPercent() {
		return value / max;
	}
	
	public float getAmountUntilFull() {
		return max - value;
	}
	
	public boolean isOverflowed() {
		return value > max;
	}
	
	public void update(int amount) {
		value += amount;
		if (value > max)
			value = max;
	}
	
	public void updateNoLimit(float amount) {
		value += amount;
	}
	
	public void reset(float newValue) {
		value = newValue;
		if (value > max)
			value = max;
	}
	
	public void updateMax(float amount) {
		max += amount;
	}
	
	public void resetMax(float newMax) {
		value = newMax;
	}
	
	public void refill() {
		value = max;
	}

}
