package item;

public class Wealth implements Item {

	public enum CoinType {
		
		COPPER(1), SILVER(10), GOLD(100), PLATINUM(1000);
		
		private int value;
		
		CoinType(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
		
	}
	
	private int amount;
	private CoinType type;
	
	public Wealth(int amount, CoinType type) {
		this.amount = amount;
		this.type = type;
	}

	public String getName() {
		return String.format("%d %s", amount, type.name().toLowerCase());
	}

	public int getValue() {
		return amount * type.getValue();
	}

	public float getWeight() {
		return amount * 0.02f;
	}

}
