package Assignment2;

public class Main {
	public static void main(String[] args) {
		int gameState; 
		Title.draw();	
		
		// make nested for loop for creating 
		Room map[][]; // create 2d room object array
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Room newRoom = new Room();
				newRoom.setY(i);
				newRoom.setX(j);
				newRoom.setMyRoomsNorth = myRoomsNorth[i][j];
				
				map[i][j] = newRoom;
			}
		}
		
		
	}
	
	
}
