package Assignment2;
import java.util.Scanner;

public class Main {
	
	public int changeValueY(Room[][] currentRoom, int currentRoomY, int currentRoomX) {
		currentRoomY = currentRoom[currentRoomY][currentRoomX].drawRoom();
		return currentRoomY;
	}
	
	public int changeValueY() {
		
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int gameState = 0; 
		int numRoomsX = 8;
		int numRoomsY = 8;
		int currentRoomX = 0;
		int currentRoomY = 0;
	
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
			
			/*
			 * draw first room with current room variables not i and j
			 * currentroom col/row = moveRoom return value
			 * return currentroom
			 * draw currentroom
			 * 
			 * call moveroom
			 */
			
			// if return value is 0, prompt moveRoom
			
			Title.draw();
			gameState = myObj.nextInt();
			System.out.println("Welcome to Ria Game which is named that not due to a lack of creativity. You have found yourself in a maze with ");
			System.out.println("an inevitable chance of death however, it is up to you to naviagte through this map and change your fate");
			System.out.println();
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				map[i][j] = new Room(myRoomsNorth[i][j], myRoomsEast[i][j], myRoomsSouth[i][j], myRoomsWest[i][j]);
				currentRoom[i][j] = map[i][j];
				
			}
		}
		
		currentRoom[currentRoomY][currentRoomX].drawRoom(); 
		currentRoom[currentRoomY][currentRoomX].moveRoom();
		gameState = 0;
	
		} while (gameState == 1);
		
	}
	
}	
