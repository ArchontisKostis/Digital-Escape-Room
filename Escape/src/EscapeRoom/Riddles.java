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
    
    private int riddleId;
    private ArrayList<Image> riddleImages = new ArrayList<Image>();

    public Riddles(int riddleId){
        this.riddleId = riddleId;
    }

    public boolean pictures_in_order(int Order[]){
        boolean solved = true;
        Data row = new Data();
        if(riddleId == 0011)
            for(int i=0 ; i<row.getRowGr().getNumberOfImages(); i++){
                if(Order[i]!=row.getRowGr().getOrder()[i]){
                    solved = false;
                    break;
                }
            }
        else if(riddleId == 0012)
            for(int i=0 ; i<row.getImageTextGr().getNumberOfQuestions() ; i++){
                if(Order[i]!=row.getImageTextGr().getOrder()[i]){
                    solved = false;
                    break;
                }
            }
        else if(riddleId == 0021)
            for(int i=0 ; i<row.getImageTextEg().getNumberOfQuestions() ; i++){
                if(Order[i]!=row.getImageTextEg().getOrder()[i]){
                    solved = false;
                    break;
                }
            }
        else if(riddleId == 0031)
            for(int i=0 ; i<row.getRowSc().getNumberOfImages() ; i++){
                if(Order[i]!=row.getRowSc().getOrder()[i]){
                    solved = false;
                    break;
                }
            }
        else
            for(int i=0 ; i<3 ; i++){
                if(Order[i]!=row.getTextToText().getOrder()[i]){
                    solved = false;
                    break;
                }
            }
            
        return solved;
    }
    
    public boolean multiple_choice(int position , int pos4 , int pos5 , int pos6){
        boolean solved;
        Data question = new Data();

        if(riddleId == 0013){
            solved = position == (question.getQuestion1()).getRightAnswear();
        }
        else if (riddleId == 0022){
            solved = position == (question.getQuestion2()).getRightAnswear();
        }
        else{
            solved = (position == ((question.getQuestion3()).getRightAnswear())) && (pos4 == (question.getQuestion4()).getRightAnswear()) && (pos5 == (question.getQuestion5()).getRightAnswear()) && (pos6 == (question.getQuestion6()).getRightAnswear());
        }

        return solved;
    }
    

    public boolean type_the_answear(String answear){
        String rightAnswear;
        Data text = new Data();
        
        if(riddleId == 0014){
            rightAnswear = text.getTextGr1()[1];
        }
        else if(riddleId == 0015){
            rightAnswear = text.getTextGr2()[1];
        }
        else{
            rightAnswear = text.getTextEg1()[1];
        }
        return rightAnswear.equals(answear);
    }
    

    
    public boolean crossword_puzzle(int numOfquestion,String answear){
        boolean correct;
        if(numOfquestion == 1)
            correct = "RA".equals(answear);
        else if(numOfquestion == 2)
            correct = "Anubis".equals(answear);
        else if(numOfquestion == 3)
            correct = "Osiris".equals(answear);
        else if(numOfquestion == 4)
            correct = "Isis".equals(answear);
        else
            correct = "Seth".equals(answear);
        return correct;
    }
    
    public boolean crossword_check(int numOfCorrectAns){
        return numOfCorrectAns == 5;
    }
}
