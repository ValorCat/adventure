package item;

public class InventoryOverflowException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private float currentWeight, maxWeight;
	
	public InventoryOverflowException(float currentWeight, float maxWeight) {
		this.currentWeight = currentWeight;
		this.maxWeight = maxWeight;
	}

	public float getCurrentWeight() {
		return currentWeight;
	}

	public float getMaxWeight() {
		return maxWeight;
	}
	
}
