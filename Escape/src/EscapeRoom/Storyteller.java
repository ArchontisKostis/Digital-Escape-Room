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
    private String Gmsg2 = "Πρέπει να αντιστοιχήσεις τους χαρακτήρες με τις τιμωρίες τους";
    private String Gmsg3 = "Πρέπει να απαντήσει στην εξής ερώτηση πολλαπλής επιλογής";
    private String Gmsg4 = "Πρέπει να γράψεις τη λέξη που βγάζουν τα έντονα γράμματα του κειμένου";
    private String Gmsg5 = "Ποιο είναι το ον που όταν γεννιέται έχει τέσσερα πόδια, στη συνέχεια γίνεται δίποδο και όταν γερνά αποκτά και τρίτο πόδι;";
    
    /*Ερωτήσεις για τους Αιγυπτιακόυς γρίφους*/
    private String Emsg1 = "Να βρείς και να πατήσεις με τη σωστή σειρά πανω στα εξεις σύμβολα";
    private String Emsg2 = "Ποιός είναι ο θεός της καταστροφής;";
    private String Emsg3 = "Πρέπει να λύσεις το σταυρόλεξο για να βρείς τον κωδικό του γρίφου";
    private String Emsg4 = "Λύσε τον γρίφο για να βγείς απο το δωμάτιο";
    
    /*Ερωτήσεις για τους Σκανδιναβικούς γρίφους*/
    private String Smsg1 = "Πρέπει να βάλεις τις εικόνες στη σωστή σειρά";
    private String Smsg2 = "Απάντησε στις ερωτήσεις πολλαπλής επιλογής";
    private String Smsg3 = "Πρεπει να σχεδιάσεις την διαδρομή που θα ακολουθήσει ο Thor για να νικήσει το φίδη. Υπάρχουν δύο περιορισμοί: \n"
            + "Η διαδρομή πρέπει να διατρέχει ολόκληρο το σώμα του φιδιού \n"
            + "Δεν μπορείς να ξαναπεράσεις απο το ίδιο σημείο δ΄υο φορές. Μπορείς όμως να ξαναπεράσεις απο τους κόμβους";
    
    /*Βοήθεια για τους Ελληνικούς γρίφους*/
    private String GHelp1 = "Κοίτα προσεκτικά τις εικόνες. Μπορείς να ψάξεις και στο διαδίκτυο αν δεν θυμάσαι τους άθλους του Ηρακλή";
    private String GHelp2 = "Του Προμηθέα είναι η χειρότερη";
    private String GHelp3 = "Έαν την κοιτάξεις πετρώνεις";
    private String GHelp4 = "Όνομα ενός διάσημου κυνηγού";
    private String GHelp5 = "Το συναντάς καθημερινά";
    
    /*Βοήθεια για τους Αιγυπτιακούς γρίφους*/
    private String ΕHelpMsg1 = "Μπορείς να ψάξεις και στο διαδίκτυο αν σου φαίνονται ορνιθοσκαλίσματα";
    private String EHelpMsg2 = "Απεικονίζεται ως φίδι";
    private String EHelpMsg3 = "Το διαδίκτυο είναι ο φίλος σου";
    private String EHelpMsg4 = "Συνέδεσε το πλήθος των εικόνων με τα ονόματα των θεών στον προηγούμενο γρίφο";
     
     /*Βοήθεια για τους Σκανδιναβικούς γρίφους*/
    private String SHelpMsg1 = "Κοίτα προσεκτικά τις εικόνες. Μπορείς να ψάξεις και στο διαδίκτυο αν δεν γνωρίζεις την Σκανδιναβική μυθολογία"; 
    private String SHelpMsg2 = "Κάποιος δεν είδε την σειρά Vikings";
    private String SHelpMsg3 = "Οι γραμμές είναι το «σώμα» του φιδιού και οι κουκίδες οι κόμβοι";
            
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
    
    public String ShowGreekMsg5(){
        return Gmsg5;
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
    
    public String GiveGreekHelp1(){
        return GHelp1;
    }
    
    public String GiveGreekHelp2(){
        return GHelp2;
    }
        
    public String GiveGreekHelp3(){
        return GHelp3;
    }
            
    public String GiveGreekHelp4(){
        return GHelp4;
    }
                
    public String GiveGreekHelp5(){
        return GHelp5;
    }
    
    public String GiveEgyHelp1(){
        return ΕHelpMsg1;
    }
    
    public String GiveEgyHelp2(){
        return EHelpMsg2;
    }
    
    public String GiveEgyHelp3(){
        return EHelpMsg3;
    }
    
    public String GiveEgyHelp4(){
        return EHelpMsg4;
    }
    
    public String GiveScanHelp1(){
        return SHelpMsg1;
    }
    
    public String GiveScanHelp2(){
        return SHelpMsg2;
    }
    
    public String GiveScanHelp3(){
        return SHelpMsg3;
    }
 
    /*
    public void Give_Help(Storyteller storyteller){
        
    }
    */
}
