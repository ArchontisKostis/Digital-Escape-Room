/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
