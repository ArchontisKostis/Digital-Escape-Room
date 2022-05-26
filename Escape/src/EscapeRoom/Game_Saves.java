/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscapeRoom;
import java.io.Serializable;
/**
 *
 * @author Christos
 */
public class Game_Saves implements Serializable{
    
    private Player aplayer;
    private Room: aroom;
    
    public Game_Saves(Player aplayer,Room aroom){
        this.aplayer = aplayer;
        this.aroom = aroom;
    }
    
}
