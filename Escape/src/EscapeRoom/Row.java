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
import javax.swing.ImageIcon;
public class Row {
    
    private int[] order = new int[]{};
    private ArrayList<ImageIcon> Images = new ArrayList<ImageIcon>();
    private int numberOfImages;

    public Row(int order[] , ArrayList<ImageIcon> images , int numberOfImages){
        for(int i=0 ; i<numberOfImages ; i++){
            this.order[i]=order[i];
            Images.add(images.get(i));
        }
    }

    public int[] getOrder() {
        return order;
    }

    public ArrayList<ImageIcon> getImages() {
        return Images;
    }

    public int getNumberOfImages() {
        return numberOfImages;
    }
}
    
