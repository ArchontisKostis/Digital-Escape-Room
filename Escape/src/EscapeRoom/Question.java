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
    
    public Question(String question , int rightAnswear, String choice1 , String choice2 , String choice3 , String choice4 ){
        this.question = question;
        this.rightAnswear = rightAnswear;
        answear.add(choice1);
        answear.add(choice2);
        answear.add(choice3);
        answear.add(choice4);
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
