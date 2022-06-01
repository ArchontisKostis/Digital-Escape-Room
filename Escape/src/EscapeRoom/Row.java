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
    
    private int[] order = new int[]{};
    private ArrayList<Image> Images = new ArrayList<Image>();
    private int numberOfImages;

    public Row(int order[] , Image images[] , int numberOfImages){
        for(int i=0 ; i<numberOfImages ; i++){
            this.order[i]=order[i];
            Images.add(images[i]);
        }
    }

    public int[] getOrder() {
        return order;
    }

    public ArrayList<Image> getImages() {
        return Images;
    }

    public int getNumberOfImages() {
        return numberOfImages;
    }
}
    
