package EscapeRoom;

/**
 *
 * @author giorg
 */
public class Triggers extends Items{
        private int itemRiddle;
        
        public Triggers(String itemName, int itemId, int itemRiddle) {
            super(itemName, itemId);
            this.itemRiddle = itemRiddle;        
	}

	
	public int getItemRiddle() {
		return itemRiddle;
	}

	public void setItemRiddle(int itemRiddle) {
		this.itemRiddle = itemRiddle;
	}


}
