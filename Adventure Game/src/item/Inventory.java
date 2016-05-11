package item;

import java.util.Iterator;
import java.util.List;

import util.Limit;

public class Inventory {
	
	private List<Item> items;
	private Limit weight;
	
	public Iterator<Item> getItems() {
		return items.iterator();
	}
	
	public int getItemCount() {
		return items.size();
	}
	
	public float getTotalWeight() {
		return weight.getValue();
	}
	
	public float getMaxWeight() {
		return weight.getMaximum();
	}
	
	public void addItem(Item item) {
		if (item.getWeight() > weight.getAmountUntilFull())
			throw new InventoryOverflowException(weight.getValue(), weight.getMaximum());
		forceAddItem(item);
	}
	
	public boolean forceAddItem(Item item) {
		items.add(item);
		weight.updateNoLimit(item.getWeight());
		return weight.isOverflowed();
	}

}
