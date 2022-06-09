/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EscapeRoom;
import java.util.ArrayList;
/**
 *
 * @author Archontis
 */
public class Game {
    // Properties Declaration
    private Player player;
    private ArrayList<Room> roomList;    // TO-DO: <Room>
    private ArrayList saveList;    // TO-DO: <GameSaves>
    private boolean musicOn;
    private boolean soundOn;
    
    // Constructor
    public Game(){
        
    }

    
    /* GETTERS AND SETTERS */
    // Player
    public void setPlayer(Player aPlayer){
        this.player = aPlayer;
    }
    
    public Player getPlayer(){
        return this.player;
    }
    
    // Rooms
    public ArrayList getRoomList(){
        return this.roomList;
    }
    
    public Room getRoomByIndex(int index){
        return roomList.get(index);
    }
    
    /*
    Αυτη η μεθοδος επιστρεφει ένα δωματιο απο την λίστα με βάση την θέση του στην λιστα
    Μπορει να φανει χρήσιμη
    
    public Room getRoomByIndex(int index){
        return this.roomList.get(index);
    }
    */
    
    // Saves List
    public void setSavesList(ArrayList aSaveList){
        this.saveList = aSaveList;
    }
    
    public ArrayList getSaveList(){
        return this.saveList;
    }
    
    /*
     Αυτη η μεθοδος επιστρεφει ένα Save απο την λίστα με βάση την θέση του στην λιστα
     Θα χρειαστει για να φορτώνουμε ενα συγκεκριμενο save (λογικά)
    public GameSave getSavegameByIndex(int index){
        return this.saveList.get(index);
    }
    */
    
    public void startNewGame(Player player,  ArrayList rooms){
      
    }
    
    public void loadGame(ArrayList<Game_Saves> saves){  
        
    }
}

   
