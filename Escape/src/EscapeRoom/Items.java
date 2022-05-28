package EscapeRoom;

/**
 *
 * @author giorg
 */
import java.awt.Image;

public abstract class Items {
    
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