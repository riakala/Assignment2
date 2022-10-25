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
	
	
	// which rooms have which exits methods below:

	public void exitNorthRooms(int exitNorth) {	
		this.exitNorth = exitNorth;	
	}
	
	private int myRoomsNorth[][] = {
			{0, 0, 0, 0, 0, 0, 0, 0},
			{1, 1, 0, 0, 1, 1, 1, 1},
			{0, 0, 1, 1, 1, 1, 0, 1},
			{1, 0, 1, 1, 1, 1, 0, 1},
			{1, 1, 1, 0, 1, 1, 1, 1},
			{1, 1, 0, 0, 0, 1, 1, 1},
			{1, 0, 0, 0, 0, 0, 1, 1},
			{1, 1, 1, 1, 1, 1, 1, 1}
	};
	
	public void setMyRoomsNorth(int myRoomsNorth[][]) {
		this.myRoomsNorth = myRoomsNorth;
	}
	
	public int[][] getMyRoomsNorth() {
		return myRoomsNorth;
	}
	
	// take newRoom object and give it the properties of myRoomsNorth array
	
	public void exitEastRooms(int exitEast) {
		this.exitEast = exitEast;
		
		int myRoomsEast[][] = {
					{0, 1, 1, 1, 1, 0, 1, 0},
					{1, 1, 1, 1, 0, 1, 0, 0},
					{1, 1, 0, 0, 0, 1, 1, 0},
					{0, 1, 1, 1, 0, 1, 0, 0},
					{1, 1, 0, 0, 1, 0, 0, 0},
					{0, 1, 1, 1, 1, 0, 0, 0},
					{0, 1, 1, 0, 1, 0, 1, 0},
					{1, 1, 0, 1, 1, 1, 1, 0}
		};	
	}
	
	public void exitSouthRooms(int exitSouth) {
		this.exitSouth = exitSouth;
		
		int myRoomsSouth[][] = {
				    {1, 1, 0, 0, 1, 1, 1, 1},
				    {0, 0, 1, 1, 1, 1, 0, 1},
				    {1, 0, 1, 1, 1, 1, 0, 1},
				    {1, 1, 1, 0, 1, 1, 1, 1},
				    {1, 1, 0, 0, 0, 1, 1, 1},
				    {1, 0, 0, 0, 0, 0, 1, 1},
				    {1, 1, 1, 1, 1, 1, 1, 1},
				    {0, 0, 0, 0, 0, 0, 0, 0}
		};
	}
	
	public void exitWestRooms(int exitWest) {
		this.exitWest = exitWest;
		
		int myRoomsWest[][] = {
				    {0, 0, 1, 1, 1, 1, 0, 1},
				    {0, 1, 1, 1, 1, 0, 1, 0},
				    {0, 1, 1, 0, 0, 0, 1, 1},
				    {0, 0, 1, 1, 1, 0, 1, 0},
				    {0, 1, 1, 0, 0, 1, 0, 0},
				    {0, 0, 1, 1, 1, 1, 0, 0},
				    {0, 0, 1, 1, 0, 1, 0, 1},
				    {0, 1, 1, 0, 1, 1, 1, 1}
		};
	}
	
	// setter and getter for private int x/y
	
	public void setX(int x) { // prob do not need
		this.x = x;
	}
	
	//public int getX() {
	//	return x;
//	}
	
	public void setY(int y) { // prob dont need
		this.y = y;
	}
	
//	public int getY() {
//		return y;
//	}
	
	/* test rooms else/if ladder
	   true == 1, false == 0 */
	
	// Room0{
	// exitNorth
	// exitSouth
	// exitWest
	// exitEast
	// }
	
	// Room0.drawRoom()
	
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
		
		public void moveRoom() {

			String direc;
			
			System.out.println("Where would you like to move? (n, e, s, w)");
			direc = myObj.nextLine(); 
			
			if (direc == "n") {				
				// check exitNorthRooms() using roomID and based on that, either draw or display that action cannot be taken			
			} else if (direc == "e") {
				
			} else if (direc == "s") {
				
			} else if (direc == "w") {
				
			}
		}
}
