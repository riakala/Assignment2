/* Room.java
 * Purpose: write what this class does
 * Last edited: October 30th, 2022
 */

package assignment2;
import java.util.Scanner;

public class Room {
	final static String ANSI_RESET = "\u001B[0m";
    final static String ANSI_YELLOW = "\u001B[33m";
	Scanner myObj = new Scanner(System.in);
	protected int exitNorth;
	protected int exitEast;
	protected int exitSouth;
	protected int exitWest;
	protected int x;
	protected int y;
	
	
	public boolean checkBossRoom() {
		if ((this.y == 6) && (this.x == 5)) {
			return true;
		} 
		return false;
	}
	
	Room (int exitNorth, int exitEast, int exitSouth, int exitWest, int x, int y) {
		this.exitNorth = exitNorth;
		this.exitEast = exitEast;
		this.exitSouth = exitSouth;
		this.exitWest = exitWest;
		this.x = x;
		this.y = y;
	}	
	
	
	public void drawRoom() {
		/* rooms else/if ladder
		   true == 1, false == 0 */
			
		if(exitNorth == 1 && exitEast == 1 && exitSouth == 1 && exitWest == 1) {
			System.out.println("+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "-----   ------\r\n"
							 + "-----   ------\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++");
		} else if (exitNorth == 1 && exitEast == 1 && exitSouth == 0 && exitWest == 1) {
			System.out.println("+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "-----   ------\r\n"
							 + "--------------\r\n"
							 + "++++++++++++++\r\n"
							 + "++++++++++++++");
		} else if (exitNorth == 1 && exitEast == 0 && exitSouth == 1 && exitWest == 1) {
			System.out.println("+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "-----   |+++++\r\n"
							 + "_____   |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++");
		} else if (exitNorth == 0 && exitEast == 1 && exitSouth == 1 && exitWest == 1) {
			System.out.println("++++++++++++++\r\n"
							 + "++++++++++++++\r\n"
							 + "--------------\r\n"
							 + "------  ------\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++");
		} else if (exitNorth == 1 && exitEast == 1 && exitSouth == 1 && exitWest == 0) {
			System.out.println("+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|   -----\r\n"
							 + "+++++|   -----\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++");
		} else if (exitNorth == 1 && exitEast == 0 && exitSouth == 0 && exitWest == 1) {
			System.out.println("+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "-----   |+++++\r\n"
							 + "________|+++++\r\n"
							 + "++++++++++++++\r\n"
							 + "++++++++++++++");
		} else if (exitNorth == 1 && exitEast == 1 && exitSouth == 0 && exitWest == 0) {
			System.out.println("+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|   -----\r\n"
							 + "+++++|________\r\n"
							 + "++++++++++++++\r\n"
							 + "++++++++++++++");
		} else if (exitNorth == 0 && exitEast == 0 && exitSouth == 1 && exitWest == 1) {
			System.out.println("++++++++++++++\r\n"
							 + "++++++++++++++\r\n"
							 + "--------|+++++\r\n"
							 + "------  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++");
		} else if (exitNorth == 0 && exitEast == 1 && exitSouth == 1 && exitWest == 0) {
			System.out.println("++++++++++++++\r\n"
							 + "++++++++++++++\r\n"
							 + "+++++|--------\r\n"
							 + "+++++|   -----\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++");
		} else if (exitNorth == 1 && exitEast == 0 && exitSouth == 1 && exitWest == 0) {
			System.out.println("+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++");
		} else if (exitNorth == 0 && exitEast == 1 && exitSouth == 0 && exitWest == 1) {
			System.out.println("++++++++++++++\r\n"
							 + "++++++++++++++\r\n"
							 + "--------------\r\n"
							 + "______________\r\n"
							 + "++++++++++++++\r\n"
							 + "++++++++++++++");
		} else if (exitNorth == 1 && exitEast == 0 && exitSouth == 0 && exitWest == 0) {
			System.out.println("+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|__|+++++\r\n"
							 + "++++++++++++++\r\n"
							 + "++++++++++++++");
		} else if (exitNorth == 0 && exitEast == 1 && exitSouth == 0 && exitWest == 0) {
			System.out.println("++++++++++++++\r\n"
							 + "++++++++++++++\r\n"
							 + "++++++--------\r\n"
							 + "++++++|_______\r\n"
							 + "++++++++++++++\r\n"
							 + "++++++++++++++");
		} else if (exitNorth == 0 && exitEast == 0 && exitSouth == 1 && exitWest == 0) {
			System.out.println("++++++++++++++\r\n"
							 + "++++++++++++++\r\n"
							 + "+++++----+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++");
		} else if (exitNorth == 0 && exitEast == 0 && exitSouth == 0 && exitWest == 1) {
			System.out.println("++++++++++++++\r\n"
							 + "++++++++++++++\r\n"
							 + "--------|+++++\r\n"
							 + "________|+++++\r\n"
							 + "++++++++++++++\r\n"
							 + "++++++++++++++");
		} else {
			System.out.println(ANSI_YELLOW + "    (\r\n"
					+ "     )\r\n"
					+ "    ()\r\n"
					+ "   |--|\r\n"
					+ "   |  |\r\n"
					+ " .-|  |-.\r\n"
					+ ":  |  |  :\r\n"
					+ ":  '--'  :\r\n"
					+ " '-....-'\n" + ANSI_RESET + "++++++++++++++\r\n"
							 + "++++------++++\r\n"
							 + "+++|      |+++\r\n"
							 + "+++|      |+++\r\n"
							 + "+++|______|+++\r\n"
							 + "++++++++++++++" + "    (\r\n"
							 		+ ANSI_YELLOW + "     )\r\n\n"
							 		+ "    ()\r\n"
							 		+ "   |--|\r\n"
							 		+ "   |  |\r\n"
							 		+ " .-|  |-.\r\n"
							 		+ ":  |  |  :\r\n"
							 		+ ":  '--'  :\r\n"
							 		+ " '-....-'");
		}					
	}
				
		
	public String chooseExit() {
		// prompts user to move around map
		String direc;
			
		System.out.println("Where would you like to move? (n, e, s, w)");
		direc = myObj.nextLine(); 
		return direc;
	}
	
	
	public Room moveRoom(Room[][] map) {
		// takes return value of direc and adds it to the room
		String chooseExitReturn = chooseExit();	
			
		if (chooseExitReturn.equals("n") && this.exitNorth == 1) {				
			return map[this.y-1][this.x]; 
			
		} else if (chooseExitReturn.equals("e") && this.exitEast == 1) {
			return map[this.y][this.x+1];
			
		} else if (chooseExitReturn.equals("s") && this.exitSouth == 1) {
			return map[this.y+1][this.x];
			
		} else if (chooseExitReturn.equals("w") && this.exitWest == 1) {
			return map[this.y][this.x-1];
			
		} else {
			System.out.println("You cannot exit this direction.");
			return this.moveRoom(map);
			
		}						
	}	
	
}
