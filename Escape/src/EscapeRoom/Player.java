/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscapeRoom;

/**
 *
 * @author Christos
 */
public class Player {
    
    private String playerName;
    private int saveLevel;
    private int lives;
    
    public Player(String playerName, int saveLevel, int lives){
        this.playerName = playerName;
        this.saveLevel = saveLevel;
        this.lives = lives;
    }
    
    public String getplayerName(){
        return playerName;
    }
    
     public void setsaveLevel(String p){
        playerName = p;
    } 
    

    public int getsaveLevel(){
        return saveLevel;
    }
      
    public void setsaveLevel(int s){
        saveLevel = s;
    }
    
    public int getlives(){
        return lives;
    }
      
    public void setlives(int l){
        lives = l;
    } 
    
    public void searchClue(Items anItem){
        
    }
    
    public void Get_help(Storyteller aStoryteller){
    }
    
}
