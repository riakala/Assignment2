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
