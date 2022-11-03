/* Room.java
 * Purpose: write what this class does
 * Last edited: October 30th, 2022
 */

package assignment2;
import java.util.Scanner;

public class Room {
	final static String ANSI_RESET = "\u001B[0m";
    final static String ANSI_YELLOW = "\u001B[33m";
    final static String ANSI_PURPLE = "\u001B[35m";
	Scanner myObj = new Scanner(System.in);
	protected int hasHealthPotion;
	protected int hasDamagePotion;
	protected int hasCharmPotion;
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
	
	Room (int exitNorth, int exitEast, int exitSouth, int exitWest, int x, int y, int hasHealthPotion, int hasDamagePotion, int hasCharmPotion) {
		this.exitNorth = exitNorth;
		this.exitEast = exitEast;
		this.exitSouth = exitSouth;
		this.exitWest = exitWest;
		this.x = x;
		this.y = y;
		this.hasHealthPotion = hasHealthPotion;
		this.hasDamagePotion = hasDamagePotion;
		this.hasCharmPotion = hasCharmPotion;
	}	
	
	
	public void drawRoom() {
		/* rooms else/if ladder
		   true == 1, false == 0 
		   draws rooms based on properties of exits
		*/
			
		if(exitNorth == 1 && exitEast == 1 && exitSouth == 1 && exitWest == 1) {
			System.out.println("+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "-----   ------\r\n"
							 + "-----   ------\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\n");
		} else if (exitNorth == 1 && exitEast == 1 && exitSouth == 0 && exitWest == 1) {
			System.out.println("+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "-----   ------\r\n"
							 + "--------------\r\n"
							 + "++++++++++++++\r\n"
							 + "++++++++++++++\n");
		} else if (exitNorth == 1 && exitEast == 0 && exitSouth == 1 && exitWest == 1) {
			System.out.println("+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "-----   |+++++\r\n"
							 + "_____   |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\n");
		} else if (exitNorth == 0 && exitEast == 1 && exitSouth == 1 && exitWest == 1) {
			System.out.println("++++++++++++++\r\n"
							 + "++++++++++++++\r\n"
							 + "--------------\r\n"
							 + "------  ------\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\n");
		} else if (exitNorth == 1 && exitEast == 1 && exitSouth == 1 && exitWest == 0) {
			System.out.println("+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|   -----\r\n"
							 + "+++++|   -----\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\n");
		} else if (exitNorth == 1 && exitEast == 0 && exitSouth == 0 && exitWest == 1) {
			System.out.println("+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "-----   |+++++\r\n"
							 + "________|+++++\r\n"
							 + "++++++++++++++\r\n"
							 + "++++++++++++++\n");
		} else if (exitNorth == 1 && exitEast == 1 && exitSouth == 0 && exitWest == 0) {
			System.out.println("+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|   -----\r\n"
							 + "+++++|________\r\n"
							 + "++++++++++++++\r\n"
							 + "++++++++++++++\n");
		} else if (exitNorth == 0 && exitEast == 0 && exitSouth == 1 && exitWest == 1) {
			System.out.println("++++++++++++++\r\n"
							 + "++++++++++++++\r\n"
							 + "--------|+++++\r\n"
							 + "------  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\n");
		} else if (exitNorth == 0 && exitEast == 1 && exitSouth == 1 && exitWest == 0) {
			System.out.println("++++++++++++++\r\n"
							 + "++++++++++++++\r\n"
							 + "+++++|--------\r\n"
							 + "+++++|   -----\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\n");
		} else if (exitNorth == 1 && exitEast == 0 && exitSouth == 1 && exitWest == 0) {
			System.out.println("+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\n");
		} else if (exitNorth == 0 && exitEast == 1 && exitSouth == 0 && exitWest == 1) {
			System.out.println("++++++++++++++\r\n"
							 + "++++++++++++++\r\n"
							 + "--------------\r\n"
							 + "______________\r\n"
							 + "++++++++++++++\r\n"
							 + "++++++++++++++\n");
		} else if (exitNorth == 1 && exitEast == 0 && exitSouth == 0 && exitWest == 0) {
			System.out.println("+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|__|+++++\r\n"
							 + "++++++++++++++\r\n"
							 + "++++++++++++++\n");
		} else if (exitNorth == 0 && exitEast == 1 && exitSouth == 0 && exitWest == 0) {
			System.out.println("++++++++++++++\r\n"
							 + "++++++++++++++\r\n"
							 + "++++++--------\r\n"
							 + "++++++|_______\r\n"
							 + "++++++++++++++\r\n"
							 + "++++++++++++++\n");
		} else if (exitNorth == 0 && exitEast == 0 && exitSouth == 1 && exitWest == 0) {
			System.out.println("++++++++++++++\r\n"
							 + "++++++++++++++\r\n"
							 + "+++++----+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\r\n"
							 + "+++++|  |+++++\n");
		} else if (exitNorth == 0 && exitEast == 0 && exitSouth == 0 && exitWest == 1) {
			System.out.println("++++++++++++++\r\n"
							 + "++++++++++++++\r\n"
							 + "--------|+++++\r\n"
							 + "________|+++++\r\n"
							 + "++++++++++++++\r\n"
							 + "++++++++++++++\n");
		} else { // boss room design with added colour
			System.out.println(ANSI_YELLOW + "    (\r\n"
					+ "     )\r\n"
					+ "    ()\r\n"
					+ "   |--|\r\n"
					+ "   |  |\r\n"
					+ " .-|  |-.\r\n"
					+ ":  |  |  :\r\n"
					+ ":  '--'  :\r\n"
					+ " '-....-'\n" + ANSI_RESET + "++++++++++++++\r"
							 + "++++------++++\r\n"
							 + "+++|      |+++\r\n"
							 + "+++|      |+++\r\n"
							 + "+++|______|+++\r\n"
							 + "++++++++++++++" + "    \r\n"
							 		+ ANSI_YELLOW + "     \r\n\n"
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
		// takes return value of direc and adds it to the room to move user to next room
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
	
	public void hasPotion(Inventory backpack) {	
		// tracks whether or not user has reached a room with a potion (while referring to 2D arrays for potions)
		// gives them a message and updates the value of the potion variable they reached in backpack object
		if (this.hasHealthPotion == 1) {
			System.out.println(ANSI_PURPLE + "You have reached a room with a potion!" + ANSI_RESET);
			backpack.healthPotion++;
		} else if (this.hasDamagePotion == 1) {
			System.out.println(ANSI_PURPLE + "You have reached a room with a potion!" + ANSI_RESET);
			backpack.damagePotion++;
		} else if (this.hasCharmPotion == 1) {
			System.out.println(ANSI_PURPLE + "You have reached a room with a potion!" + ANSI_RESET);
			backpack.charmPotion++;
		}
	}
}
