package Assignment2;

public class Main {

	public static void main(String[] args) {
		int gameState = 0; 
		int numRoomsX = 8;
		int numRoomsY = 8;
		int currentRoomX = 0;
		int currentRoomY = 0;;
	
		Room map[][] = new Room[numRoomsY][numRoomsX]; // create 2d room object array
		Room currentRoom[][] = new Room[numRoomsY][numRoomsX];
	
		
		int myRoomsNorth[][] = {
				{0, 0, 0, 0, 0, 0, 0, 0},
				{1, 1, 0, 0, 1, 1, 1, 1},
				{0, 0, 1, 1, 1, 1, 0, 1},
				{1, 0, 1, 1, 1, 1, 0, 1},
				{1, 1, 1, 0, 1, 1, 1, 1},
				{1, 1, 0, 0, 0, 1, 1, 1},
				{1, 0, 0, 0, 0, 0, 1, 1},
				{1, 1, 1, 1, 1, 1, 1, 1}
		};
		
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
		
		do {
			Title.draw();	
			/*
			 * draw first room with current room variables not i and j
			 * currentroom col/row = moveRoom return value
			 * return currentroom
			 * draw currentroom
			 * call moveroom
			 */
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				map[i][j] = new Room(myRoomsNorth[i][j], myRoomsEast[i][j], myRoomsSouth[i][j], myRoomsWest[i][j]);
				currentRoom[i][j] = map[i][j]; 
			}
		}
		
		
	
		} while (gameState == 1);
		
	}
	
	
}
