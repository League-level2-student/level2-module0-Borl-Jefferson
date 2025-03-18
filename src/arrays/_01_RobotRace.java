package arrays;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Random r = new Random();
		int rand;
		boolean progress = true;
		boolean stop = false;
		int winners = 0;
		int preflingx = 0;
		int preflingy = 0;
		// 2. create an array of 5 robots.
		// okay
		Robot[] rob = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < 5; i++) {
			rob[i] = new Robot();
			rob[i].setX(i * 100 + 300);
			rob[i].setY(500);
			rob[i].setSpeed(10);

		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		int[] finish = new int[rob.length];
		// 5. use another for loop to iterate through the array and make each robot move

// a random amount less than 50.
		while (progress == true) {
			for (int k = 0; k < rob.length; k++) {
				if (rob[k].getY() > 0) {
					progress = true;

				} else {
					stop = true;

					//
					JOptionPane.showMessageDialog(null, "Racer " + (k + 1) + " won the race!");
					progress = false;
					break;

					//

					// run a party method
					//
					//
					//
				}
			}
			for (int j = 0; j < rob.length; j++) {
				rand = r.nextInt(50);
				int y2 = rand;
				int x2 = j;
				Thread go = new Thread(() -> rob[x2].move(y2));
				go.start();
			}
			// make if race in progress, boolean = true if all are above y level 0

		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

		party();
	}

	public static void party() {
		for (int i = 0; i < 9999; i++) {
			Robot.setWindowColor(Color.RED);
			delay();
			Robot.setWindowColor(Color.ORANGE);
			delay();
			Robot.setWindowColor(Color.YELLOW);
			delay();
			Robot.setWindowColor(Color.GREEN);
			delay();
			Robot.setWindowColor(Color.BLUE);
			delay();
			Robot.setWindowColor(Color.MAGENTA);
			delay();
		}

	}
	public static void delay() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

