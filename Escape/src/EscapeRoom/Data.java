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
import java.awt.Image;

public class Data {
    
    private int riddleId;
    
    public void Data(int riddleId){
        this.riddleId = riddleId;
    }

    public int getRiddleId() {
        return riddleId;
    }
    
    //Greek mythology
    //1 ID:0011
    private int[] orderGr1 = new int[]{7,2,1,8,4,10,5,3,11,9,6,12};
    private Image[] imagesGr1 = new Image[12];          //θα γίνει κανονική αρχικοποίηση του πίνακα αντί για τη δήλωση μεγέθους
    private Row rowGr = new Row(orderGr1 , imagesGr1 , 12);

    public int[] getOrderGr1() {
        return orderGr1;
    }

    public Image[] getImagesGr1() {
        return imagesGr1;
    }

    public Row getRowGr() {
        return rowGr;
    }
    
    //2 ID:0012
    private int[] orderGr2 = new int[]{2,3,1};
    private String[] choices1 = new String[]{"Άτλας","Προμηθέας","Σίσυφος"};
    private Image[] imagesGr2 = new Image[3];          //θα γίνει κανονική αρχικοποίηση του πίνακα αντί για τη δήλωση μεγέθους
    private ImageText imageTextGr = new ImageText(choices1 , imagesGr2 , orderGr2 , 3);

    public int[] getOrderGr2() {
        return orderGr2;
    }

    public String[] getChoices1() {
        return choices1;
    }

    public Image[] getImagesGr2() {
        return imagesGr2;
    }

    public ImageText getImageTextGr() {
        return imageTextGr;
    }
    
    //3 ID:0013
    private Question question1 = new Question("Κάποτε ήμουν ένα όμορφο κορίτσι.Έκανα το λάθος να εξοργίσω την Αθηνά και τώρα είμαι ένα άσχημο τέρας. Ποιά είμαι;",3,"Πανδώρα","Δήμητρα","Μέδουσα","Αίγινα");

    public Question getQuestion1() {
        return question1;
    }
    
    //4 ID:0014
    private String[] textGr1 = new String[]{"Ο Μύθος της Καλλιστώς: Ο Δίας ερωτεύεται την πανέμορφη Καλλιστώ, κόρη του βασιλιά της Αρκαδίας Λυκάονα, και αποκτά μαζί της έναν γιο, τον Αρκάδα. Θυμωμένη η Ήρα τη μεταμορφώνει σε αρκούδα, την οποία μετά από χρόνια συναντά ο γιός της στο δάσος. Προσπαθεί εκείνη να τον αγκαλιάσει και τρομαγμένος ο Αρκάδας ετοιμάζεται να τη σκοτώσει. Επεμβαίνει ο Δίας και την καταστερίζει -την ανεβάζει στον ουρανό- ως τον αστερισμό της Μεγάλης Άρκτου, καθώς επίσης και τον γιό της να την ακολουθεί ως Μικρή Άρκτος",
            "Ωρίων"};

    public String[] getTextGr1() {
        return textGr1;
    }
    
    //5 ID:0015
    private String[] textGr2 = new String[]{"Ποιο είναι το ον που όταν γεννιέται έχει τέσσερα πόδια, στη συνέχεια γίνεται δίποδο και όταν γερνά αποκτά και τρίτο πόδι;","Σφίγγα"};

    public String[] getTextGr2() {
        return textGr2;
    }
    
    //Egyptian mythology
    //1 ID:0021
    private int[] orderEg1 = new int[]{2,4,3,1};
    private String[] choices2 = new String[]{"Σύμβολο ζωής","Σύμβολο προστασίας","Σύμβολο της βασιλείας","Σύμβολο της μεταμόρφωσης","Σύμβολο του ήλιου"};
    private Image[] imageEg1 = new Image[5];          //θα γίνει κανονική αρχικοποίηση του πίνακα αντί για τη δήλωση μεγέθους
    private ImageText imageTextEg = new ImageText(choices2 , imageEg1 , orderEg1 , 5);

    public int[] getOrderEg1() {
        return orderEg1;
    }

    public String[] getChoices2() {
        return choices2;
    }

    public Image[] getImageEg1() {
        return imageEg1;
    }

    public ImageText getImageTextEg() {
        return imageTextEg;
    }
    
    //2 ID:0022
    private Question question2 = new Question("Ποιός είναι ο θεός του χάους και της καταστροφής;",3,"Apophis","Seth","Sekhmet","");

    public Question getQuestion2() {
        return question2;
    }
    
    //3 ID:0023
    //CROSSWORD PUZZLE
    
    //4 ID:0024
    private String[] textEg1 = new String[]{"","3534"};

    public String[] getTextEg1() {
        return textEg1;
    }
    
    //Scandinavian mythology
    //1 ID:0031
    private int[] orderSc1 = new int[]{2,4,3,1};
    private Image[] imagesSc1 = new Image[4];          //θα γίνει κανονική αρχικοποίηση του πίνακα αντί για τη δήλωση μεγέθους
    private Row rowSc = new Row(orderSc1 , imagesSc1 , 4);

    public int[] getOrderSc1() {
        return orderSc1;
    }

    public Image[] getImagesSc1() {
        return imagesSc1;
    }

    public Row getRowSc() {
        return rowSc;
    }
    
    //2 ID:0032
    private int[] orderSc2 = new int[]{2,3,1};
    private String[] textSc1 = new String[]{"Βασίλειο Midgard","Βασίλειο Asgard","Βασίλειο Hell"};
    private String[] textSc2 = new String[]{"Κόσμος των ανθρώπων","Κόσμος των Θεών","Κόσμος των νεκρών"};
    private TextToText textToText = new TextToText(orderSc2 , textSc1 , textSc2);

    public int[] getOrderSc2() {
        return orderSc2;
    }

    public String[] getTextSc1() {
        return textSc1;
    }

    public String[] getTextSc2() {
        return textSc2;
    }

    public TextToText getTextToText() {
        return textToText;
    }
    
    //3 ID:0033
    private Question question3 = new Question("Σε ποιόν θεό/θεά προσεύχονταν για να έχουν καλή σοδιά;",1,"Frey","Odin","Balder","Freyja");
    private Question question4 = new Question("Ποιός ήταν ο θεός του πολέμου σύμφωνα με την σκανδιναβική μυθολογία;",3,"Thor","Balder","Tyr","Odin");
    private Question question5 = new Question("Που πάνε οι νεκροί στην αρχαία σκανδιναβική μυθολογία;",1,"Vahalla & Hall of Hell","Δεν υπάρχουν αναφορές","Παράδεισος","Κόλαση");
    private Question question6 = new Question("Ποιός είναι ο σκοπός της αίθουσας Vahalla στην σκανδιναβική μυθολογία;",1,"Συλλογή στρατού για το Ragnarök","Τιμωρία προς τους ασεβείς ανθρώπους","Παρομοιάζεται με τον παράδεισο","Μέρος για να γιορτάζουν οι Θεοί");

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
