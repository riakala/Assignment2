/* Ria Kala
 * ICS4U1
 * Main.java
 * Purpose: write stuff about main here
 * Last edited: October 20th, 2022
 */

package assignment2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ansi reference values taken from https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
		final String ANSI_RESET = "\u001B[0m";
	    final String ANSI_PURPLE = "\u001B[35m";
		
		Scanner myObj = new Scanner(System.in);
		int gameState = 0; 
		int numRoomsX = 8;
		int numRoomsY = 8;
		int startX = 0;
		int startY = 0;	
	
		Room map[][] = new Room[numRoomsY][numRoomsX]; // create 2d room object array	
		BossRoom bossRoom = new BossRoom(0, 0, 0, 0, 5, 6);
	
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
			
		Title.draw();
		gameState = myObj.nextInt();
		System.out.println(ANSI_PURPLE + "Welcome to Ria Game which is named that not due to a lack of creativity. You have found yourself in a maze with ");
		System.out.println("an inevitable chance of death however, it is up to you to naviagte through this map and change your fate" + ANSI_RESET);
		System.out.println();	
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				map[i][j] = new Room(myRoomsNorth[i][j], myRoomsEast[i][j], myRoomsSouth[i][j], myRoomsWest[i][j], j, i);
			}
		}
		
		Room currentRoom = map[startY][startX];
		
		while (gameState == 1) {
			if (currentRoom.checkBossRoom()) {
				gameState = bossRoom.bossUserInterface();
					if (gameState == 0) {
						System.out.println("Would you like to play again?");
						if (myObj.nextInt() == 1) {
							currentRoom = map[startY][startX];
							gameState = 1;
						}
					}
			}
			currentRoom.drawRoom();
			currentRoom = currentRoom.moveRoom(map);
		} 				
	}	
}	
