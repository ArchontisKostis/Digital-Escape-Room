package EscapeRoom;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author giorg
 */
import java.util.ArrayList;

public class room {
	private String roomName;
	private int SolvedRiddles;


public room(String roomName, int solvedRiddles) {
		super();
		this.roomName = roomName;
		SolvedRiddles = solvedRiddles;
}

public String getRoomName() {
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
