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
        boolean solved = false;
        String question , rightAnswear;
        
        if(riddleId == 1){
            question = "Ο Μύθος της Καλλιστώς: Ο Δίας ερωτεύεται την πανέμορφη Καλλιστώ, κόρη του βασιλιά της Αρκαδίας Λυκάονα, και αποκτά μαζί της έναν γιο, τον Αρκάδα. Θυμωμένη η Ήρα τη μεταμορφώνει σε αρκούδα, την οποία μετά από χρόνια συναντά ο γιός της στο δάσος. Προσπαθεί εκείνη να τον αγκαλιάσει και τρομαγμένος ο Αρκάδας ετοιμάζεται να τη σκοτώσει. Επεμβαίνει ο Δίας και την καταστερίζει -την ανεβάζει στον ουρανό- ως τον αστερισμό της Μεγάλης Άρκτου, καθώς επίσης και τον γιό της να την ακολουθεί ως Μικρή Άρκτος";
            rightAnswear = "Ωρίων";
        }
        else if(riddleId == 2){
            question = "Ποιο είναι το ον που όταν γεννιέται έχει τέσσερα πόδια, στη συνέχεια γίνεται δίποδο και όταν γερνά αποκτά και τρίτο πόδι;";
            rightAnswear = "Σφίγγα";
        }
        else{
            
        }
        
        solved = rightAnswear.equals(answear);
        return solved;
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
