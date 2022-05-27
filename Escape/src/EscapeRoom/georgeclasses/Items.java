/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscapeRoom.georgeclasses;

/**
 *
 * @author giorg
 */
import java.awt.Image;

public class Items {
    
    private String itemName;
    private int itemId;
    private Image itemImage;
    private Image itemImageHovered;


 public void Items(String itemName, int itemId,Image itemImage,Image itemImageHovered){
     this.itemName = itemName;
     this.itemId  = itemId;
     this.itemImage = itemImage;
     this.itemImageHovered = itemImageHovered;
 }
//help with images

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