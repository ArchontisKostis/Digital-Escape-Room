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
import java.awt.*;
import javax.swing.ImageIcon;

public class Data {
    
    private int riddleId;
    private ArrayList<ImageIcon> imagesGr1 = new ArrayList<ImageIcon>();
    private ArrayList<ImageIcon> imagesGr2 = new ArrayList<ImageIcon>();
    private ArrayList<ImageIcon> imageEg1 = new ArrayList<ImageIcon>();
    private ArrayList<ImageIcon> imagesSc1 = new ArrayList<ImageIcon>(); 
    
    public void Data(){
        imagesGr1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/hercules1.jpg")));
        imagesGr1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/hercules2.jpg")));
        imagesGr1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/hercules3.jpg")));
        imagesGr1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/hercules4.jpg")));
        imagesGr1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/hercules5.jpg")));
        imagesGr1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/hercules6.jpg")));
        imagesGr1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/hercules7.jpg")));
        imagesGr1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/hercules8.jpg")));
        imagesGr1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/hercules9.jpg")));
        imagesGr1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/hercules10.jpg")));
        imagesGr1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/hercules11.jpg")));
        imagesGr1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/hercules12.jpg")));
        
        imagesGr2.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/atlas.jpg")));
        imagesGr2.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/prometheus.jpg")));
        imagesGr2.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/sisyphus.jpg")));
        
        imageEg1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/symbol1.jpg")));
        imageEg1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/symbol2.jpg")));
        imageEg1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/symbol3.jpg")));
        imageEg1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/symbol4.jpg")));
        imageEg1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/symbol5.jpg")));
        
        imagesSc1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/image1.jpg")));
        imagesSc1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/image2.jpg")));
        imagesSc1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/image3.jpg")));
        imagesSc1.add(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/image4.jpg")));
    }

    public int getRiddleId() {
        return riddleId;
    }
    
    //Greek mythology
    //1 ID:0011
    private int[] orderGr1 = new int[]{7,2,1,8,4,10,5,3,11,9,6,12};
    private Row rowGr = new Row(orderGr1 , imagesGr1 , 12);

    public Row getRowGr() {
        return rowGr;
    }
    
    //2 ID:0012
    private int[] orderGr2 = new int[]{2,3,1};
    private String[] choices1 = new String[]{"Άτλας","Προμηθέας","Σίσυφος"};
    private ImageText imageTextGr = new ImageText(choices1 , imagesGr2 , orderGr2 , 3);

    public ImageText getImageTextGr() {
        return imageTextGr;
    }
    
    //3 ID:0013
    private String[] wordsGr1 = new String[]{"Πανδώρα","Δήμητρα","Μέδουσα","Αίγινα"};
    private Question question1 = new Question("Κάποτε ήμουν ένα όμορφο κορίτσι.Έκανα το λάθος να εξοργίσω την Αθηνά και τώρα είμαι ένα άσχημο τέρας. Ποιά είμαι;",3,wordsGr1,4);

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
    private int[] orderEg1 = new int[]{2,4,3,1,5};
    private String[] choices2 = new String[]{"Σύμβολο ζωής","Σύμβολο προστασίας","Σύμβολο της βασιλείας","Σύμβολο της μεταμόρφωσης","Σύμβολο του ήλιου"};
    
    private ImageText imageTextEg = new ImageText(choices2 , imageEg1 , orderEg1 , 5);

    public ImageText getImageTextEg() {
        return imageTextEg;
    }
    
    //2 ID:0022
    private String[] wordsEg1 = new String[]{"Apophis","Seth","Sekhmet"};
    private Question question2 = new Question("Ποιός είναι ο θεός του χάους και της καταστροφής;",3,wordsEg1,3);

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
    private Row rowSc = new Row(orderSc1 , imagesSc1 , 4);

    public Row getRowSc() {
        return rowSc;
    }
    
    //2 ID:0032
    private int[] orderSc2 = new int[]{2,3,1};
    private String[] textSc1 = new String[]{"Βασίλειο Midgard","Βασίλειο Asgard","Βασίλειο Hell"};
    private String[] textSc2 = new String[]{"Κόσμος των ανθρώπων","Κόσμος των Θεών","Κόσμος των νεκρών"};
    private TextToText textToText = new TextToText(orderSc2 , textSc1 , textSc2);

    public String[] getTextSc2() {
        return textSc2;
    }

    public TextToText getTextToText() {
        return textToText;
    }
    
    //3 ID:0033
    private String[] wordsSc1 = new String[]{"Frey","Odin","Balder","Freyja"};
    private Question question3 = new Question("Σε ποιόν θεό/θεά προσεύχονταν για να έχουν καλή σοδιά;",1,wordsSc1,4);
    private String[] wordsSc2 = new String[]{"Thor","Balder","Tyr","Odin"};
    private Question question4 = new Question("Ποιός ήταν ο θεός του πολέμου σύμφωνα με την σκανδιναβική μυθολογία;",3,wordsSc2,4);
    private String[] wordsSc3 = new String[]{"Vahalla & Hall of Hell","Δεν υπάρχουν αναφορές","Παράδεισος","Κόλαση"};
    private Question question5 = new Question("Που πάνε οι νεκροί στην αρχαία σκανδιναβική μυθολογία;",1,wordsSc3,3);
    private String[] wordsSc4 = new String[]{"Συλλογή στρατού για το Ragnarök","Τιμωρία προς τους ασεβείς ανθρώπους","Παρομοιάζεται με τον παράδεισο","Μέρος για να γιορτάζουν οι Θεοί"};
    private Question question6 = new Question("Ποιός είναι ο σκοπός της αίθουσας Vahalla στην σκανδιναβική μυθολογία;",1,wordsSc4,4);

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
    
    //4 ID:0034
    private String question7 = "1. Θεος του Ήλιου.";
    private String question8 = "2. Θεός/θεά της βαλσάμωσης και προστάτης των νεκρών.";
    private String question9 = "3. Θεός του θανάτου και της ανάστασης, βασιλιάς του Κάτω Κόσμου και αυτός που καθιστά δυνατή τη βλάστηση, θεός ήλιος και των θεός των ψυχών των νεκρών.";
    private String question10 = "4. Σύζυγος και αδελφή του Όσιρι και μητέρα του Ώρου, συνδέεται με τα ταφικά τελετουργικά, τη μητρότητα, την προστασία και τη μαγεία";
    private String question11 = "5. Θεός που χαρακτηρίζεται από βία, χάος και ισχύ, συνδέεται με την έρημο. Δολοφόνος του Όσιρι και εχθρός του Ώρου, αλλά επίσης υποστηριχτής του (εκάστοτε) βασιλιά.";

    public String getQuestion7() {
        return question7;
    }

    public String getQuestion8() {
        return question8;
    }

    public String getQuestion9() {
        return question9;
    }

    public String getQuestion10() {
        return question10;
    }

    public String getQuestion11() {
        return question11;
    }
    
}
