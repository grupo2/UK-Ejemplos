//file: GridBag1.java

package kennedy.ar.ui.ejemplos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridBagDemo extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	GridBagConstraints constraints = new GridBagConstraints();

	public GridBagDemo() {
		setLayout(new GridBagLayout());
		// int x, y; // for clarity
		addGB(new JButton("North"), 1, 0);
		addGB(new JButton("West"), 0, 1);
		addGB(new JButton("Center"), 1, 1);
		addGB(new JButton("East"), 2, 1);
		addGB(new JButton("South"), 1, 2);
	}

	void addGB(Component component, int x, int y) {
		constraints.gridx = x;
		constraints.gridy = y;
		add(component, constraints);
	}

	public static void main(String[] args) {
		JFrame f = new JFrame("GridBagDemo");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setSize(225, 150);
		f.setLocation(200, 200);
		f.setContentPane(new GridBagDemo());
		f.setVisible(true);
	}
}
