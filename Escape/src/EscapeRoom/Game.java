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
    private ArrayList saveList; // TO-DO: <GameSaves>
    
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
    
    public void setRoomList(ArrayList<Room> aList){
        this.roomList = aList;
    }
    
    /*
    Αυτη η μεθοδος επιστρεφει ένα δωματιο απο την λίστα με βάση την θέση του στην λιστα
    Μπορει να φανει χρήσιμη
    */
    public Room getRoomByIndex(int index){
        return this.roomList.get(index);
    }
    
    
    // Saves List
    public void setSavesList(ArrayList<Game_Saves> aSaveList){
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
    
    public void fillRoomList(){
        this.roomList = new ArrayList<Room>();
        Room room1 = new Room("Room1", 0);
        this.roomList.add(room1);
        
        Room room2 = new Room("Room2", 0);
        this.roomList.add(room2);
        
        Room room3 = new Room("Room3", 0);
        this.roomList.add(room3);
    }
    
    public void startNewGame(Player player,  ArrayList rooms){
      
    }
    
    public void loadGame(ArrayList<Game_Saves> saves){  
        
    }
    
    // USED FOR TESTING
    public String toString() {
        String text = "Player:" + this.player.toString() + roomList.size() + this.saveList.size();
        return text;
    }
}

   
