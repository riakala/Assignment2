package Assignment2;
import java.util.Scanner;

public class Room {
	Scanner myObj = new Scanner(System.in);
	int exitNorth;
	int exitEast;
	int exitSouth;
	int exitWest;
	private int x;
	private int y;
	
	Room(int exitNorth, int exitEast, int exitSouth, int exitWest) {
		this.exitNorth = exitNorth;
		this.exitEast = exitEast;
		this.exitSouth = exitSouth;
		this.exitWest = exitWest;
	}
	
	// array of rooms + general idea of 64 square map (not in use)
	
	int myRooms[][] = {
			{0, 1, 2, 3, 4, 5, 6, 7},
			{8, 9, 10, 11, 12, 13, 14, 15},
			{16, 17, 18, 19, 20, 21, 22, 23},
			{24, 25, 26, 27, 28, 29, 30, 31},
			{32, 33, 34, 35, 36, 27, 38, 39},
			{40, 41, 42, 43, 44, 45, 46, 47},
			{48, 49, 50, 51, 52, 53, 54, 55},
			{56, 57, 58, 59, 60, 61, 62, 63}						
		  };
	

	
	/* test rooms else/if ladder
	   true == 1, false == 0 */
	
		public void drawRoom() {
			
			if(exitNorth == 1 && exitEast == 1 && exitSouth == 1 && exitWest == 1) {
				System.out.println("+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "-----   ------\r\n"
								 + "-----   ------\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++");
			} else if(exitNorth == 1 && exitEast == 1 && exitSouth == 0 && exitWest == 1) {
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
			} else if(exitNorth == 0 && exitEast == 1 && exitSouth == 1 && exitWest == 1) {
				System.out.println("++++++++++++++\r\n"
								 + "++++++++++++++\r\n"
								 + "--------------\r\n"
								 + "------  ------\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++");
			} else if(exitNorth == 1 && exitEast == 1 && exitSouth == 1 && exitWest == 0) {
				System.out.println("+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|   -----\r\n"
								 + "+++++|   -----\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++");
			} else if(exitNorth == 1 && exitEast == 0 && exitSouth == 0 && exitWest == 1) {
				System.out.println("+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "-----   |+++++\r\n"
								 + "________|+++++\r\n"
								 + "++++++++++++++\r\n"
								 + "++++++++++++++");
			} else if(exitNorth == 1 && exitEast == 1 && exitSouth == 0 && exitWest == 0) {
				System.out.println("+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|   -----\r\n"
								 + "+++++|________\r\n"
								 + "++++++++++++++\r\n"
								 + "++++++++++++++");
			} else if(exitNorth == 0 && exitEast == 0 && exitSouth == 1 && exitWest == 1) {
				System.out.println("++++++++++++++\r\n"
								 + "++++++++++++++\r\n"
								 + "--------|+++++\r\n"
								 + "------  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++");
			} else if(exitNorth == 0 && exitEast == 1 && exitSouth == 1 && exitWest == 0) {
				System.out.println("++++++++++++++\r\n"
								 + "++++++++++++++\r\n"
								 + "+++++|--------\r\n"
								 + "+++++|   -----\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++");
			} else if(exitNorth == 1 && exitEast == 0 && exitSouth == 1 && exitWest == 0) {
				System.out.println("+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++");
			} else if(exitNorth == 0 && exitEast == 1 && exitSouth == 0 && exitWest == 1) {
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
			} else if(exitNorth == 0 && exitEast == 1 && exitSouth == 0 && exitWest == 0) {
				System.out.println("++++++++++++++\r\n"
								 + "++++++++++++++\r\n"
								 + "++++++--------\r\n"
								 + "++++++|_______\r\n"
								 + "++++++++++++++\r\n"
								 + "++++++++++++++");
			} else if(exitNorth == 0 && exitEast == 0 && exitSouth == 1 && exitWest == 0) {
				System.out.println("++++++++++++++\r\n"
								 + "++++++++++++++\r\n"
								 + "+++++----+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++");
			} else if(exitNorth == 0 && exitEast == 0 && exitSouth == 0 && exitWest == 1) {
				System.out.println("++++++++++++++\r\n"
								 + "++++++++++++++\r\n"
								 + "--------|+++++\r\n"
								 + "________|+++++\r\n"
								 + "++++++++++++++\r\n"
								 + "++++++++++++++");
			} else {
				System.out.println("++++++++++++++\r\n"
								 + "++++------++++\r\n"
								 + "+++|      |+++\r\n"
								 + "+++|      |+++\r\n"
								 + "+++|______|+++\r\n"
								 + "++++++++++++++");
			}
					
		}
		
		
		// prompts user to move around map
	
		
		public int moveRoom() {

			String direc;
			int returnValue = 0;
			
			System.out.println("Where would you like to move? (n, e, s, w)");
			direc = myObj.nextLine(); 
			
			// takes return value of direc and adds it to the room
			
			if (direc.equals("n")) {				
				if(this.exitNorth == 1) {
					returnValue = 1;
				} else {
					returnValue = 0;
				}
				
			} else if (direc.equals("e")) {
				if(this.exitEast == 1) {
					returnValue = 1;
				} else {
					returnValue = 0;
				}
				
			} else if (direc.equals("s")) {
				if (this.exitSouth == 1) {
					returnValue = 1;
				} else {
					returnValue = 0;
				}		
				
			} else if (direc.equals("w")) {
				if (this.exitWest == 1) {
					returnValue = 1;
				} else {
					returnValue = 0;
				}
				
			}
			
			return returnValue;
			
		}
}
