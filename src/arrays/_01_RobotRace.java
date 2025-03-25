package arrays;

import java.awt.Color;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {

	Racer[] robs = new Racer[5];
	boolean isrunning=true;

	public static void main(String[] args) {

		_01_RobotRace rr = new _01_RobotRace();
		rr.race();
	}

	public void race() {
		for (int j = 0; j < robs.length; j++) {
robs[j] = new Racer(j);
			robs[j].start();
		}
	}

	public void party(int winner) {
		for (int i = 0; i < robs.length; i++) {
			if (robs[i] != robs[winner]) {
				isrunning=false;
			}
		}
		JOptionPane.showMessageDialog(null, "Racer " + (winner + 1) + " won the race!");

		/*for (int i = 0; i < 9999; i++) {
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
		}*/

	}

	public static void delay() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public class Racer extends Thread {
		private int j;

		public Racer(int j) {
			this.j = j;
		}

		public void run() {
			Random r = new Random();
			int rand = r.nextInt(50)+5;
			Robot rob = new Robot();
			rob.setX(j * 100 + 300);
			rob.setY(500);
			rob.setSpeed(10);

			while (rob.getY() > 0) {
				if(isrunning) {
				rob.move(rand);
				}else {
					return;
				}
			}
			party(j);

		}

	}
}
