package EscapeRoom;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author giorg
 */
import java.awt.Image;

public class Items {
	private String itemName;
	private int itemId;
	private Image itemImage;
	private Image itemImageHvered;


//help with images


        
   public Items(String itemName, int itemId) {
	super();
	this.itemName = itemName;
	this.itemId = itemId;
   }     
        
        
        
        
        public String getItemName() {
	return itemName;
}



public void setItemName(String itemName) {
	this.itemName = itemName;
}



public int getItemId() {
	return itemId;
}



public void setItemId(int itemId) {
	this.itemId = itemId;
}

}