/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscapeRoom;

/**
 *
 * @author 30694
 */
import java.util.*;
import java.awt.Image;

public class ImageText {
    private int[] order = new int[12];
    private ArrayList<Image> Images = new ArrayList<Image>();
    private ArrayList<String> Text = new ArrayList<String>();
    private int numberOfQuestions;
    
    public ImageText(String text[] , Image images[] , int order[] , int numberOfQuestions){
        this.numberOfQuestions = numberOfQuestions;
        for(int i=0 ; i<numberOfQuestions ; i++){
            this.order[i]=order[i];
            Images.add(images[i]);
            Text.add(text[i]);
        }
    }

    public int[] getOrder() {
        return order;
    }

    public ArrayList<Image> getImages() {
        return Images;
    }

    public ArrayList<String> getText() {
        return Text;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }
    
}
 