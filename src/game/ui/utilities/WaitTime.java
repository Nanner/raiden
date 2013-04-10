package game.ui.utilities;

/**
 * The Class WaitTime implements a method to make the system(thread) wait for a given time
 */
public class WaitTime {
	
	/**
	 * Makes the system wait for n milliseconds
	 *
	 * @param n the number of milliseconds to wait
	 */
	public static void wait (int n) {
		try {
			int time = n;
			Thread.sleep(time);
		} catch (Exception e) {
			System.err.println("Problem executing thread sleep!");
		}
	}
}
