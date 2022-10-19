package Assignment2;

public class Room {
	int exitNorth;
	int exitEast;
	int exitSouth;
	int exitWest;
	
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
	
	/*
	public void exitNorthRooms(int[][] myRoomsNorth, int exitNorth) {
		myRoomsNorth = myRooms;
		this.exitNorth = exitNorth;
		
		myRoomsNorth = {
					{0, 0, 0, 0, 0, 0, 0, 0,},
					{1, 1, 0, 0, 1, 1, 1, 0},
					{0, 0, 1, 1, 1, 1, 0, 1},
					{1, 0, 1, 1, 1, 1, 0, 1},
					{1, 1, 1, 0, 1, 1, 1, 1},
					{1, 1, 0, 0, 0, 1, 1, 1},
					{1, 0, 0, 0, 0, 0, 1, 1},
					{1, 1, 1, 1, 1, 1, 1, 1}
		};
	}
	*/
	
	
	public void exitEastRooms(int[][] myRooms) {
		this.myRooms = myRooms;
		
	}
	
	public void exitSouthRooms(int[][] myRooms) {
		this.myRooms = myRooms;
		
	}
	
	public void exitWestRooms(int[][] myRooms) {
		this.myRooms = myRooms;
		
	}
	
		// access by row u can do the exits and then reset values to true/false
	
	// test rooms else/if ladder
	// true == 1, false == 0
	
		public void drawRoom(int exitNorth, int exitEast, int exitSouth, int exitWest) {
			this.exitNorth = exitNorth;
			this.exitEast = exitEast;
			this.exitSouth = exitSouth;
			this.exitWest = exitWest;
			
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
}
