/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscapeRoom.georgeclasses;

/**
 *
 * @author giorg
 */
import java.util.ArrayList;

public class Room {
	private String roomName;
	private int SolvedRiddles;

public void Room(String roomName, int SolvedRiddles){
    this.roomName = roomName;
    this.SolvedRiddles = SolvedRiddles;
}


public String getroomName() {
	return roomName;
}

public void setRoomName(String roomName) {
	this.roomName = roomName;
}

public int getSolvedRiddles() {
	return SolvedRiddles;
}

public void setSolvedRiddles(int solvedRiddles) {
	SolvedRiddles = solvedRiddles;
}
}
