package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
Random r = new Random();
int rand;
		// 2. create an array of 5 robots.
		// okay
		Robot[] randy = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < 5; i++) {
			randy[i] = new Robot();
			randy[i].setX(i * 50);
			randy[i].setY(500);
			
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move

// a random amount less than 50.
while (randy[.getY() > 0) {
	
for (int j=0; j < 5; j++) {
	 rand = r.nextInt(50);
	randy[j].move(rand);
	//make if race in progress, boolean = true if all are above y level 0
	if() {
		
	}
		
}
}
	
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
