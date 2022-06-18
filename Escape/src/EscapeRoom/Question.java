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

public class Question {
    
    private String question;
    private int rightAnswear;
    private ArrayList<String> answear = new ArrayList<String>();
    
    public Question(String question , int rightAnswear, String words[] , int numberOfWords){
        this.question = question;
        this.rightAnswear = rightAnswear;
        for(int i=0 ; i<numberOfWords ; i++){
            answear.add(words[i]);
        }
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getAnswear() {
        return answear;
    }
    
    public int getRightAnswear() {
        return rightAnswear;
    }
}
