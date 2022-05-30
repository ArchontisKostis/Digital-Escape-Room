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

public class Riddles {
    private Storyteller storyteller;
    private int riddleId;
    private ArrayList<Image> riddleImages = new ArrayList<Image>();
    
    public Riddles(int riddleId){
        this.riddleId = riddleId;
    }
    
    /*
    public boolean pictures_in_a_row(ArrayList<Image> images){
        boolean solved = false;
        return solved;
    }
    */
    
    /*
    public boolean match_image_to_text(ArrayList<Image> images , ArrayList<String> text){
        boolean solved = false;
        return solved;
    }
    */
    public boolean multiple_choice(int position , int riddleId , int pos4 , int pos5 , int pos6){
        
        boolean solved;
        Data question = new Data();
        
        if(riddleId == 1){            
            solved = position == (question.getQuestion1()).getRightAnswear();
        }
        else if (riddleId == 2){
            solved = position == (question.getQuestion2()).getRightAnswear();
        }
        else{
            solved = (position == ((question.getQuestion3()).getRightAnswear())) && (pos4 == (question.getQuestion4()).getRightAnswear()) && (pos5 == (question.getQuestion5()).getRightAnswear()) && (pos6 == (question.getQuestion6()).getRightAnswear());
        }
        
        return solved;
    }
    
    public boolean type_the_answear(String answear , int riddleId){
        String rightAnswear;
        Data text = new Data();
        
        if(riddleId == 1){
            rightAnswear = (text.getText1())[1];
        }
        else if(riddleId == 2){
            rightAnswear = (text.getText2())[1];
        }
        else{
            rightAnswear = text.getText3();
        }
        
        return rightAnswear.equals(answear);
    }
    
    /*
    public boolean crossword_puzzle(ArrayList<String> clues){
        boolean solved = false;
        return solved;
    }
    */
    
    /*
    public boolean puzzle(){
        boolean solved = false;
        return solved;
    }
    */
    
}
