package assignment2;

public class Room {
	boolean exitNorth;
	boolean exitEast;
	boolean exitSouth;
	boolean exitWest;
	
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
	
	// test rooms else/if ladder
	
		public void drawRoom(boolean exitNorth,boolean exitEast, boolean exitSouth, boolean exitWest) {
			
			if(exitNorth == true && exitEast == true && exitSouth == true && exitWest == true) {
				System.out.println("+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "-----   ------\r\n"
								 + "-----   ------\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++");
			} else if(exitNorth == true && exitEast == true && exitSouth == false && exitWest == true) {
				System.out.println("+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "-----   ------\r\n"
								 + "--------------\r\n"
								 + "++++++++++++++\r\n"
								 + "++++++++++++++");
			} else if (exitNorth == true && exitEast == false && exitSouth == true && exitWest == true) {
				System.out.println("+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "-----   |+++++\r\n"
								 + "_____   |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++");
			} else if(exitNorth == false && exitEast == true && exitSouth == true && exitWest == true) {
				System.out.println("++++++++++++++\r\n"
								 + "++++++++++++++\r\n"
								 + "--------------\r\n"
								 + "------  ------\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++");
			} else if(exitNorth == true && exitEast == true && exitSouth == true && exitWest == false) {
				System.out.println("+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|   -----\r\n"
								 + "+++++|   -----\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++");
			} else if(exitNorth == true && exitEast == false && exitSouth == false && exitWest == true) {
				System.out.println("+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "-----   |+++++\r\n"
								 + "________|+++++\r\n"
								 + "++++++++++++++\r\n"
								 + "++++++++++++++");
			} else if(exitNorth == true && exitEast == true && exitSouth == false && exitWest == false) {
				System.out.println("+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|   -----\r\n"
								 + "+++++|________\r\n"
								 + "++++++++++++++\r\n"
								 + "++++++++++++++");
			} else if(exitNorth == false && exitEast == false && exitSouth == true && exitWest == true) {
				System.out.println("++++++++++++++\r\n"
								 + "++++++++++++++\r\n"
								 + "--------|+++++\r\n"
								 + "------  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++");
			} else if(exitNorth == false && exitEast == true && exitSouth == true && exitWest == false) {
				System.out.println("++++++++++++++\r\n"
								 + "++++++++++++++\r\n"
								 + "+++++|--------\r\n"
								 + "+++++|   -----\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++");
			} else if(exitNorth == true && exitEast == false && exitSouth == true && exitWest == false) {
				System.out.println("+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++");
			} else if(exitNorth == false && exitEast == true && exitSouth == false && exitWest == true) {
				System.out.println("++++++++++++++\r\n"
								 + "++++++++++++++\r\n"
								 + "--------------\r\n"
								 + "______________\r\n"
								 + "++++++++++++++\r\n"
								 + "++++++++++++++");
			} else if (exitNorth == true && exitEast == false && exitSouth == false && exitWest == false) {
				System.out.println("+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|__|+++++\r\n"
								 + "++++++++++++++\r\n"
								 + "++++++++++++++");
			} else if(exitNorth == false && exitEast == true && exitSouth == false && exitWest == false) {
				System.out.println("++++++++++++++\r\n"
								 + "++++++++++++++\r\n"
								 + "++++++--------\r\n"
								 + "++++++|_______\r\n"
								 + "++++++++++++++\r\n"
								 + "++++++++++++++");
			} else if(exitNorth == false && exitEast == false && exitSouth == true && exitWest == false) {
				System.out.println("++++++++++++++\r\n"
								 + "++++++++++++++\r\n"
								 + "+++++----+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++\r\n"
								 + "+++++|  |+++++");
			} else if(exitNorth == false && exitEast == false && exitSouth == false && exitWest == true) {
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
