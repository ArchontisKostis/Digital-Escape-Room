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
    
    Question question1 = new Question("Κάποτε ήμουν ένα όμορφο κορίτσι.Έκανα το λάθος να εξοργίσω την Αθηνά και τώρα είμαι ένα άσχημο τέρας. Ποιά είμαι;",3,"Πανδώρα","Δήμητρα","Μέδουσα","Αίγινα");
    Question question2 = new Question("Ποιός είναι ο θεός του χάους και της καταστροφής;",3,"Apophis","Seth","Sekhmet","");
    Question question3 = new Question("Σε ποιόν θεό/θεά προσεύχονταν για να έχουν καλή σοδιά;",1,"Frey","Odin","Balder","Freyja");
    Question question4 = new Question("Ποιός ήταν ο θεός του πολέμου σύμφωνα με την σκανδιναβική μυθολογία;",3,"Thor","Balder","Tyr","Odin");
    Question question5 = new Question("Που πάνε οι νεκροί στην αρχαία σκανδιναβική μυθολογία;",1,"Vahalla & Hall of Hell","Δεν υπάρχουν αναφορές","Παράδεισος","Κόλαση");
    Question question6 = new Question("Ποιός είναι ο σκοπός της αίθουσας Vahalla στην σκανδιναβική μυθολογία;",1,"Συλλογή στρατού για το Ragnarök","Τιμωρία προς τους ασεβείς ανθρώπους","Παρομοιάζεται με τον παράδεισο","Μέρος για να γιορτάζουν οι Θεοί");

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

    

}
