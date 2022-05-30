/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscapeRoom;

/**
 *
 * @author 30694
 */
import java.util.ArrayList;

public class Data {
    
    private int riddleId;
    
    public void Data(int riddleId){
        this.riddleId = riddleId;
    }
    
    //3rd type [Multiple choice]
    private Question question1 = new Question("Κάποτε ήμουν ένα όμορφο κορίτσι.Έκανα το λάθος να εξοργίσω την Αθηνά και τώρα είμαι ένα άσχημο τέρας. Ποιά είμαι;",3,"Πανδώρα","Δήμητρα","Μέδουσα","Αίγινα");
    private Question question2 = new Question("Ποιός είναι ο θεός του χάους και της καταστροφής;",3,"Apophis","Seth","Sekhmet","");
    private Question question3 = new Question("Σε ποιόν θεό/θεά προσεύχονταν για να έχουν καλή σοδιά;",1,"Frey","Odin","Balder","Freyja");
    private Question question4 = new Question("Ποιός ήταν ο θεός του πολέμου σύμφωνα με την σκανδιναβική μυθολογία;",3,"Thor","Balder","Tyr","Odin");
    private Question question5 = new Question("Που πάνε οι νεκροί στην αρχαία σκανδιναβική μυθολογία;",1,"Vahalla & Hall of Hell","Δεν υπάρχουν αναφορές","Παράδεισος","Κόλαση");
    private Question question6 = new Question("Ποιός είναι ο σκοπός της αίθουσας Vahalla στην σκανδιναβική μυθολογία;",1,"Συλλογή στρατού για το Ragnarök","Τιμωρία προς τους ασεβείς ανθρώπους","Παρομοιάζεται με τον παράδεισο","Μέρος για να γιορτάζουν οι Θεοί");

    public Question getQuestion1() {
        return question1;
    }

    public Question getQuestion2() {
        return question2;
    }

    public Question getQuestion3() {
        return question3;
    }

    public Question getQuestion4() {
        return question4;
    }

    public Question getQuestion5() {
        return question5;
    }

    public Question getQuestion6() {
        return question6;
    }

    //4th type [typing the answears]
    private String[] text1 = new String[]{"Ο Μύθος της Καλλιστώς: Ο Δίας ερωτεύεται την πανέμορφη Καλλιστώ, κόρη του βασιλιά της Αρκαδίας Λυκάονα, και αποκτά μαζί της έναν γιο, τον Αρκάδα. Θυμωμένη η Ήρα τη μεταμορφώνει σε αρκούδα, την οποία μετά από χρόνια συναντά ο γιός της στο δάσος. Προσπαθεί εκείνη να τον αγκαλιάσει και τρομαγμένος ο Αρκάδας ετοιμάζεται να τη σκοτώσει. Επεμβαίνει ο Δίας και την καταστερίζει -την ανεβάζει στον ουρανό- ως τον αστερισμό της Μεγάλης Άρκτου, καθώς επίσης και τον γιό της να την ακολουθεί ως Μικρή Άρκτος",
            "Ωρίων"};
    
    private String[] text2 = new String[]{"Ποιο είναι το ον που όταν γεννιέται έχει τέσσερα πόδια, στη συνέχεια γίνεται δίποδο και όταν γερνά αποκτά και τρίτο πόδι;","Σφίγγα"};
    
    private String[] text3 = new String[]{"","3534"};

    public String[] getText1() {
        return text1;
    }

    public String[] getText2() {
        return text2;
    }

    public String getText3() {
        return text3[1];
    }
    
}
