/* BossRoom.java
 * Purpose: Once the user reaches a designated room (row 6, column 5), the user is prompted to enter the boss room, 
 * where a final show down will occur. The user faces the boss on an either hard or regular difficulty (the only
 * difference being the amount of damage able to receive/deal). The game state at the end of this class is set to 0,
 * determining the game as over.
 * Last edited: October 31th, 2022
 */

package assignment2;
import java.util.Scanner;
import java.io.*;
import java.util.Random;
public class BossRoom extends Room {
	
	// variable
	private int bossHealth = 100;
	private int userHealth = 100;
	
    // ansi reference values taken from https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_PURPLE = "\u001B[35m";
    Scanner myObj = new Scanner(System.in);
    
	// constructor
	BossRoom (int exitNorth, int exitEast, int exitSouth, int exitWest, int x, int y, int hasHealthPotion, int hasDamagePotion, int hasCharmPotion) {
		super(exitNorth, exitEast, exitSouth, exitWest, x, y, hasHealthPotion, hasDamagePotion, hasCharmPotion);
	}	
	
	// user interface when they choose to fight the boss
	public int bossUserInterface(Inventory backpack) {
		String bossRoomEnter;
		System.out.println("You have reached a room with a mysterious door that leads to a boss room. Would you like to enter? ('y'/'n')");
		bossRoomEnter = myObj.nextLine();
		
		if (bossRoomEnter.equals("y")) {
			bossIntro();
			System.out.println(ANSI_PURPLE + "You have " + backpack.healthPotion + ": health potions, " + backpack.damagePotion + ": damage potions, and " + backpack.charmPotion + ": charm potions");
			System.out.println("Would you like to fight on hard mode ('h') or regular mode ('r')? ");
			bossRoomEnter = myObj.nextLine();
			if (bossRoomEnter.equals("r")) {
				drawBossRoom();
				return bossFight(backpack);	
			} else {
				drawBossRoom();
				return bossFight();
			}			
		}	
		return 1;
	}
	
	public void drawBossRoom() {
		exitNorth = 0; 
		exitEast = 0;
		exitSouth = 0;
		exitWest = 0;
		drawRoom();
	}
	
	public void bossIntro() {
		// cow artwork taken from https://www.asciiart.eu/animals/cows		
	    // introduces the boss and displays ascii art
		System.out.println(ANSI_RED +  "WELCOME TO THE BOSS ROOM. GOOD LUCK ON DEFEATING THE EVIL HOLY(?) COW! "
				+ "HE MAY LOOK LIKE A (COW)ARD BUT HE IS MUCH MORE TERRIFYING THAN YOU MAY THINK"	+  ANSI_RESET);
		System.out.println(ANSI_RED + "   /                       \\\r\n"
				+ " /X/                       \\X\\\r\n"
				+ "|XX\\         _____         /XX|\r\n"
				+ "|XXX\\     _/       \\_     /XXX|___________\r\n"
				+ " \\XXXXXXX             XXXXXXX/            \\\\\\\r\n"
				+ "   \\XXXX    /     \\    XXXXX/                \\\\\\\r\n"
				+ "        |   0     0   |                         \\\r\n"
				+ "         |           |                           \\\r\n"
				+ "          \\         /                            |______//\r\n"
				+ "           \\       /                             |\r\n"
				+ "            | O_O | \\                            |\r\n"
				+ "             \\ _ /   \\________________           |\r\n"
				+ "                        | |  | |      \\         /\r\n"
				+ "  No Bull$h!t,          / |  / |       \\______/\r\n"
				+ "   Please...            \\ |  \\ |        \\ |  \\ |\r\n"
				+ "                      __| |__| |      __| |__| |\r\n"
				+ "                      |___||___|      |___||___|" + ANSI_RESET);
	}
	
	public int bossFight(Inventory backpack) { // regular mode
		Random rand = new Random();
		int bossHealth = 100;
		int userHealth = 100;
		String userResponse;
		
		while ((bossHealth > 0) && (userHealth > 0)) {
			int bossResponse = rand.nextInt(2) + 1; // 1 = fight, 2 = defend
			System.out.println(ANSI_RED +  "YOUR HEALTH: " + userHealth	+  ANSI_RESET);
			System.out.println(ANSI_RED +  "BOSS HEALTH: " + bossHealth	+  ANSI_RESET);
			System.out.println(ANSI_RED +  "HOW WOULD YOU LIKE TO PROCEED? (a: ATTACK, d: DEFEND, POTION: p)"	+  ANSI_RESET);
			userResponse = myObj.nextLine(); 
			
			if ((bossResponse == 1) && userResponse.equals("a")) {
				System.out.println(ANSI_RED +  "YOU BOTH CHOSE TO FIGHT" +  ANSI_RESET);
				int userDamage = rand.nextInt(60) + 1;
				int bossDamage = rand.nextInt(30) + 1;
				userHealth -= userDamage;
				bossHealth -= bossDamage;
				
			} else if ((bossResponse == 1) && userResponse.equals("d")) {
				System.out.println(ANSI_RED +  "THE BOSS VICIOUSLY ATTACKS YOU AS YOU (COW)ER IN SHAME" +  ANSI_RESET);
				int userDamage = rand.nextInt(40) + 1;
				userHealth -= userDamage;	
				
			} else if ((bossResponse == 2) && userResponse.equals("d")) {
				System.out.println(ANSI_RED +  "YOU BOTH CHOSE TO DEFEND HOWEVER DUE TO THIS GAME BEING UNFAIR, YOU WERE DEALT DAMAGE"
						+ "DUE TO YOUR (COW)ARDNESS"	+  ANSI_RESET);
				int userDamage = rand.nextInt(10) + 1;
				userHealth -= userDamage;
				
			} else if ((bossResponse == 2) && userResponse.equals("a")) {
				System.out.println(ANSI_RED +  "YOU MANAGED TO ATTACK THE BOSS AS HE WAS DEFENDING AND DEALT SOME DAMAGE" +  ANSI_RESET);
				int bossDamage = rand.nextInt(20) + 1;
				bossHealth -= bossDamage;
			} else if (userResponse.equals("p")) {
				System.out.println("Which potion would you like to use? (health: 'h', damage: 'd', charm: 'c')");
				userResponse = myObj.nextLine(); 
				if (userResponse.equals("h")) {
					System.out.println("You have used a health potion and gained 15 health.");
					userHealth += 15;
					backpack.healthPotion --;	
				} else if (userResponse.equals("d")) {
					System.out.println("You have used a damage potion and dealt 10 health.");
					bossHealth -= 10;
					backpack.healthPotion --;
				} else if (userResponse.equals("c")) {
					System.out.println("You have used a charm potion and gained 5 health stolen from the boss.");
					bossHealth -= 5;
					userHealth += 5;
					backpack.healthPotion --;
				}
			}
		}
		
		if (userHealth > 0) {
			System.out.println(ANSI_RED +  "CONGRATULATIONS YOU HAVE DEFEATED THE BOSS! DRINK A GLASS OF MILK OR SOMETHING" +  ANSI_RESET);
		} else {
			System.out.println(ANSI_RED +  "THE BOSS DEFEATED YOU. UNFORTUNATELY THIS IS GAME OVER FOR YOU!!!!!!! XD" +  ANSI_RESET);
		}	
		return 0;
	}
	
	public int bossFight() { // hard mode 
		Random rand = new Random();
		String userResponse;
		
		while ((bossHealth > 0) && (userHealth > 0)) {
			int bossResponse = rand.nextInt(2) + 1; // 1 = fight, 2 = defend
			System.out.println(ANSI_RED +  "YOUR HEALTH: " + userHealth	+  ANSI_RESET);
			System.out.println(ANSI_RED +  "BOSS HEALTH: " + bossHealth	+  ANSI_RESET);
			System.out.println(ANSI_RED +  "YOU HAVE PICKED HARD MODE, HOW WOULD YOU LIKE TO PROCEED? (a: ATTACK, d: DEFEND)"	+  ANSI_RESET);
			userResponse = myObj.nextLine(); 
			
			if ((bossResponse == 1) && userResponse.equals("a")) {
				System.out.println(ANSI_RED +  "YOU BOTH CHOSE TO FIGHT" +  ANSI_RESET);
				int userDamage = rand.nextInt(80) + 1;
				int bossDamage = rand.nextInt(15) + 1;
				userHealth -= userDamage;
				bossHealth -= bossDamage;
				
			} else if ((bossResponse == 1) && userResponse.equals("d")) {
				System.out.println(ANSI_RED +  "THE BOSS VICIOUSLY ATTACKS YOU AS YOU (COW)ER IN SHAME" +  ANSI_RESET);
				int userDamage = rand.nextInt(55) + 1;
				userHealth -= userDamage;	
				
			} else if ((bossResponse == 2) && userResponse.equals("d")) {
				System.out.println(ANSI_RED +  "YOU BOTH CHOSE TO DEFEND HOWEVER DUE TO THIS GAME BEING UNFAIR, YOU WERE DEALT DAMAGE"
						+ " DUE TO YOUR (COW)ARDNESS"	+  ANSI_RESET);
				int userDamage = rand.nextInt(20) + 1;
				userHealth -= userDamage;
				
			} else if ((bossResponse == 2) && userResponse.equals("a")) {
				System.out.println(ANSI_RED +  "YOU MANAGED TO ATTACK THE BOSS AS HE WAS DEFENDING AND DEALT SOME DAMAGE" +  ANSI_RESET);
				int bossDamage = rand.nextInt(10) + 1;
				bossHealth -= bossDamage;
			}
		}
		
		if (userHealth > 0) {
			System.out.println(ANSI_RED +  "CONGRATULATIONS YOU HAVE DEFEATED THE BOSS! DRINK A GLASS OF MILK OR SOMETHING" +  ANSI_RESET);
		} else {
			System.out.println(ANSI_RED +  "THE BOSS DEFEATED YOU. UNFORTUNATELY THIS IS GAME OVER FOR YOU!!!!!!! XD" +  ANSI_RESET);
		}	
		return 0;
	}
	
}
