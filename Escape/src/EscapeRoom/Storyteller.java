/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscapeRoom;

import java.util.ArrayList;

/**
 *
 * @author 30694
 */
public class Storyteller {
    private String riddleHelp;
    private String riddleStory;
    
    /*Ερωτήσεις για τους ελληνικους γρίφους*/
    private String Gmsg1 = "Πρέπει να βάλεις με τη σειρά τις εικόνες των άθλων του Ηρακλή.";
    private String Gmsg2 = "Πρέπει να αντιστοιχήσεις τους ανθρώπους με τις τιμωρίες τους";
    private String Gmsg3 = "Πρέπει να απαντήσει στην εξής ερώτηση πολλαπλής επιλογής";
    private String Gmsg4 = "Πρέπει να γράψεις τη λέξη που βγάζουν τα έντονα γράμματα του κειμένου";
    private String Gmsg5 = "Ποιο είναι το ον που όταν γεννιέται έχει τέσσερα πόδια, στη συνέχεια γίνεται δίποδο και όταν γερνά αποκτά και τρίτο πόδι;";
    
    /*Ερωτήσεις για τους Αιγυπτιακόυς γρίφους*/
    private String Emsg1 = "Να βρείς και να πατήσεις με τη σωστή σειρά πανω στα εξεις σύμβολα";
    private String Emsg2 = "Ποιός είναι ο θεός της καταστροφής;";
    private String Emsg3 = "Πρέπει να λύσεις το σταυρόλεξο για να βρείς τον κωδικό του γρίφου";
    private String Emsg4 = "Πρέπει να μετρήσεις το πλήθος των εικόνων που υπάρχουν στην παρακάτω φοτογραφία";
    
    /*Ερωτήσεις για τους Σκανδιναβικούς γρίφους*/
    private String Smsg1 = "Πρέπει να βάλεις τις εικόνες στη σωστή σειρά";
    private String Smsg2 = "Απάντησε στις ερωτήσεις πολλαπλής επιλογής";
    private String Smsg3 = "Πρεπει να σχεδιάσεις την διαδρομή που θα ακολουθήσει ο Thor για να νικήσει το φίδη. Υπάρχουν δύο περιορισμοί: \n"
            + "Η διαδρομή πρέπει να διατρέχει ολόκληρο το σώμα του φιδιού \n"
            + "Δεν μπορείς να ξαναπεράσεις απο το ίδιο σημείο δ΄υο φορές. Μπορείς όμως να ξαναπεράσεις απο τους κόμβους";
            
    public Storyteller(String riddleHelp , String riddleStory){
        this.riddleHelp = riddleHelp;
        this.riddleStory = riddleStory;
    }
    
    public String ShowGreekMsg1(){
        return Gmsg1;
    }
    
    public String ShowGreekMsg2(){
        return Gmsg2;
    }
        
    public String ShowGreekMsg3(){
        return Gmsg3;
    }
            
    public String ShowGreekMsg4(){
        return Gmsg4;
    }
    
        public String ShowEgyMsg1(){
        return Emsg1;
    }
    
    public String ShowEgyMsg2(){
        return Emsg2;
    }
        
    public String ShowEgyMsg3(){
        return Emsg3;
    }
            
    public String ShowEgyMsg4(){
        return Emsg4;
    }
    
    public String ShowScanMsg1(){
        return Smsg1;
    }
    
    public String ShowScanMsg2(){
        return Smsg2;
    }
    
    public String ShowScanMsg3(){
        return Smsg3;
    }
 
    /*
    public void Give_Help(Storyteller storyteller){
        
    }
    */
}
