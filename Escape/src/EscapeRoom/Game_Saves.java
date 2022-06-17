/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscapeRoom;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 *
 * @author Christos
 */
public class Game_Saves implements Serializable{
    private Player aplayer;
    private Room aroom;
    
    // Getters
    public Player getPlayer(){
        return this.aplayer;
    }
    
    public Room getRoom() {
        return this.aroom;
    }
    
    // Setters
    public void setPlayer(Player player){
        this.aplayer = player;
    }
    
    public void setRoom(Room room) {
        this.aroom = room;
    }
    
    public void saveToFile(String aFileName) throws FileNotFoundException, IOException{
        File file = new File("savegames.txt");
        
        FileOutputStream fileOutStream = new FileOutputStream(file);
        ObjectOutputStream objOutStream = new ObjectOutputStream(fileOutStream);
        
        try{
            objOutStream.writeObject(this.aplayer);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            objOutStream.close();
        }
    }
    
    
}
