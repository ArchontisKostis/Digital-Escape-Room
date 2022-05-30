/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscapeRoom;

/**
 *
 * @author 30694
 */
import java.awt.Image;
import java.util.*;
public class Row {
    
    private String order;
    private ArrayList<Image> Images = new ArrayList<Image>();

    public void Row(String order , Image images[]){
        
        this.order = order;
        
        for(int i=0 ; i<12 ; i++){
            Images.add(images[i]);
        }
    }
    
    public String getOrder() {
        return order;
    }
}
    
