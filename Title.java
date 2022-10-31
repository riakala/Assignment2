/* Title.java
 * Purpose: Show a fun colourful display title at the start of the game, 
 * which prompts the user to begin playing
 * Last edited: October 30th, 2022
 */

package assignment2;

public class Title {
    // ANSI colour codes
    final static String ANSI_RESET = "\u001B[0m";
    final static String ANSI_YELLOW = "\u001B[33m";
    final static String ANSI_CYAN = "\u001B[36m";
    final static String ANSI_GREEN = "\u001B[32m";

	public static void draw() {
	// Draws the title
		System.out.println(ANSI_YELLOW + "===============================================================================");
		System.out.println(ANSI_CYAN  + " ________  ___  ________          ________  ________  _____ ______   _______      \r\n"
				+ "|\\   __  \\|\\  \\|\\   __  \\        |\\   ____\\|\\   __  \\|\\   _ \\  _   \\|\\  ___ \\     \r\n"
				+ "\\ \\  \\|\\  \\ \\  \\ \\  \\|\\  \\       \\ \\  \\___|\\ \\  \\|\\  \\ \\  \\\\\\__\\ \\  \\ \\   __/|    \r\n"
				+ " \\ \\   _  _\\ \\  \\ \\   __  \\       \\ \\  \\  __\\ \\   __  \\ \\  \\\\|__| \\  \\ \\  \\_|/__  \r\n"
				+ "  \\ \\  \\\\  \\\\ \\  \\ \\  \\ \\  \\       \\ \\  \\|\\  \\ \\  \\ \\  \\ \\  \\    \\ \\  \\ \\  \\_|\\ \\ \r\n"
				+ "   \\ \\__\\\\ _\\\\ \\__\\ \\__\\ \\__\\       \\ \\_______\\ \\__\\ \\__\\ \\__\\    \\ \\__\\ \\_______\\\r\n"
				+ "    \\|__|\\|__|\\|__|\\|__|\\|__|        \\|_______|\\|__|\\|__|\\|__|     \\|__|\\|_______|\r\n"
				+ "                                                                                  ");
		System.out.println(ANSI_YELLOW + "===============================================================================");
		System.out.println(ANSI_RESET + "============================= ENTER '1' TO START ==============================");
	}
}
