# Assignment2

package assignment2;

public class Sample {
	
	Room class
	with exitNorth, exitSouth, etc. properties
	and x and y properties
	and moveRoom and drawRoom methods
	
	drawRoom has no parameters
	uses code you already have done
	
	moveRoom relies on direction from user input
	checks whether the room object has an exit at that direction
	and returns the room at that exit
	
	the main function
	creates a 2d array of room objects (called map)
	shows the title card
	sets the initial current room to map[0][0]
	sets up a repeating loop
		calls currentRoom.drawRoom
		calls currentRoom.moveRoom
		sets currentRoom to the resulting room from moveRoom

}

Room map[][] = {};
		
		for i to 8
			for j to 8
				room newroom
				newroom.sety(i)
				// newroom.y == i
				newroom.setx(j)
				// newroom.x == i
				newroom.setexitnorth = exitsNorth[i][j]
				// newroom.exitnorth == exitsNorth[i][j]
				.
				.
				.
				map[i][j] = newroom
		
		currentRoom = map[1][0]
		currentRoom.drawRoom()
		get input -> // "n"
		// moveroom takes direction as a parameter,
		// checks whether an exit exists in that direction,
		// and returns the corresponding Room object
		currentRoom = currentRoom.moveRoom("n")
			if parameter == "n"
				if exitNorth == 1
				return map[currentRoom.y - 1][currentRoom.x]
				
		
		Room testRoom = new Room();
		testRoom.exitEast = 0;
		testRoom.exitNorth = 1;
		testRoom.exitSouth = 0;
		testRoom.exitWest = 1;
		System.out.println(testRoom.exitEast);
		
		Room testRoom = new Room();
		testRoom.exitEast = 75;
		System.out.println(testRoom.exitEast);
		
		
		testRoom.drawRoom();
		
		drawRoom(1,0,1,0);
		
		testRoom.drawRoom(1, 0, 1, 0);

