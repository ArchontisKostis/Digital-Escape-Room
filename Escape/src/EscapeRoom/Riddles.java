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
        
        boolean solved = false;
        ArrayList<Question> question = new ArrayList<Question>();
        
        if(riddleId == 1){
            Question question1 = new Question("Κάποτε ήμουν ένα όμορφο κορίτσι.Έκανα το λάθος να εξοργίσω την Αθηνά και τώρα είμαι ένα άσχημο τέρας. Ποιά είμαι;",3);
            question1.addAnswears("Πανδώρα");
            question1.addAnswears("Δήμητρα");
            question1.addAnswears("Μέδουσα");
            question1.addAnswears("Αίγινα");
            
            solved = position == question1.getRightAnswear();
                    
        }
        else if (riddleId == 2){
            Question question2 = new Question("Ποιός είναι ο θεός του χάους και της καταστροφής;",3);
            question2.addAnswears("Apophis");
            question2.addAnswears("Seth");
            question2.addAnswears("Sekhmet");
            
            solved = position == question2.getRightAnswear();
        }
        else{
            Question question3 = new Question("Σε ποιόν θεό/θεά προσεύχονταν για να έχουν καλή σοδιά;",1);
            question3.addAnswears("Frey");
            question3.addAnswears("Odin");
            question3.addAnswears("Balder");
            question3.addAnswears("Freyja");
            
            Question question4 = new Question("Ποιός ήταν ο θεός του πολέμου σύμφωνα με την σκανδιναβική μυθολογία;",3);
            question4.addAnswears("Thor");
            question4.addAnswears("Balder");
            question4.addAnswears("Tyr");
            question4.addAnswears("Odin");
            
            Question question5 = new Question("Που πάνε οι νεκροί στην αρχαία σκανδιναβική μυθολογία;",1);
            question5.addAnswears("Vahalla & Hall of Hell");
            question5.addAnswears("Δεν υπάρχουν αναφορές");
            question5.addAnswears("Παράδεισος");
            question5.addAnswears("Κόλαση");
            
            Question question6 = new Question("Ποιός είναι ο σκοπός της αίθουσας Vahalla στην σκανδιναβική μυθολογία;",1);
            question6.addAnswears("Συλλογή στρατού για το Ragnarök");
            question6.addAnswears("Τιμωρία προς τους ασεβείς ανθρώπους");
            question6.addAnswears("Παρομοιάζεται με τον παράδεισο");
            question6.addAnswears("Μέρος για να γιορτάζουν οι Θεοί");
            
            solved = (position == question3.getRightAnswear()) && (pos4 == question4.getRightAnswear()) && (pos5 == question5.getRightAnswear()) && (pos6 == question6.getRightAnswear());
        }
        
        return solved;
    }
    
    /*
    public boolean type_the_answear(String Question){
        boolean solved = false;
        return solved;
    }
    */
    
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
