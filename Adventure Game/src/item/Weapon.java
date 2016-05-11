package item;

import util.Range;

public interface Weapon extends Item {
	
	int getHitBonus();
	Range getDamage();

}
