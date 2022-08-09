/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame jeff;
	JPanel jepp;
	Random r = new Random();
	// 1. create an array of JButtons. Don't initialize it yet.
	JButton[] h;
	// 2 create an int variable called hiddenButton
	int hb;
		int de;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {
		jeff = new JFrame("Find the Button");
		jepp = new JPanel();
		jeff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		// 3. Ask the user to enter a positive number and convert it to an int
		String in = JOptionPane.showInputDialog("How mant buttons would you like?");
		int bu = Integer.parseInt(in);
		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3
		h = new JButton[bu];
		// 5. Make a for loop to iterate through the JButton array
		for (int i = 0; i < h.length; i++) {
//6. initialize each JButton in the array
			h[i] = new JButton();
//7. add the ActionListener to each JButton
			h[i].addActionListener(this);
//8. add each JButton to the panel
			h[i].setText("mo");
			jepp.add(h[i]);
		}
		// 9 add the panel to the window
		jeff.add(jepp);
		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		jeff.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// 11. set the JFrame to visible.
		jeff.setVisible(true);
		// 12. Give the user the instructions for the game.

		// 13. initialize the hiddenButton variable to a random number less than the int
		// created in step 3
		 de = r.nextInt(bu);
		// 14. Set the text of the JButton located at hiddenButton to "ME"
		h[de].setText("ME");
		// 15. Use Thread.sleep(1000); to pause the program.
		// Surround it with a try/catch - use Eclipse helper for this
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 16. Set the text of the JButton located at hiddenButton to be blank.
		h[de].setText(" ");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.
		if (e.getSource() == h[de]) {
JOptionPane.showMessageDialog(null, "You pressed the correct button!");
		} else {
			JOptionPane.showMessageDialog(null, "try again");
		}
		// 18. else tell them to try again
	}
}
