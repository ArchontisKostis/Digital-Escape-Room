
package EscapeRoom;



/*
@author Christos
 */
public class Player{
    // Variable Declaration
    private String playerName;
    private int saveLevel;
    private int lives;
    private String message;

    private Storyteller aStoryteller;

    
    // Constructor
    public Player(String Name, int saveLevel, int lives){
        this.playerName = Name;
        this.lives = lives;
    }
    
    /* GETTERS AND SETTERS */
    // Player Name
    public String getPlayerName(){
        return this.playerName;
    }
    
    public void setPlayerName(String name){
        this.playerName = name;
    } 
    
    // Save Level
    public int getSaveLevel(){
        return saveLevel;
    }

    public void setSaveLevel(int level){
        this.saveLevel = level;
    }
    
    // Lives
    public int getLives(){
        return lives;
    }

    public void setLives(int livesNum){
        this.lives = livesNum;
    }

    /*
    ΤΟ DO:
    
    public void searchClue(Items anItem){
        
    }
    
    public Sring Get_help(Storyteller aStoryteller){
        return message;
    }
    */
    /* 
    public Sring Get_help(Storyteller aStoryteller){
        return message;
    }
    */
    
}
