import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * Partial implementation of the Stats GUI
 * 
 * Uses the GUI to display the user inputted values from 
 *
 * @author Yajur Vashisht
 */
public class StatsGUI implements ActionListener {
	private JTextField inputField;
	private JTextArea display;
	private JButton reset, displayStats;
	private Stats Stats; 
	
	public StatsGUI(String title) { 
		
		Stats = new Stats();
		
		JFrame jfrm = new JFrame(title);
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(300, 200);  
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel prompt = new JLabel("Next Grade (press ENTER)");
		jfrm.add(prompt);
		
		this.inputField = new JTextField(4); 
		this.inputField.setText("");
		this.inputField.addActionListener( this ); 
		jfrm.add(inputField);
		
		this.display = new JTextArea (5 ,20);
		jfrm.add(display);
		
		displayStats = new JButton("STATS");
		displayStats.addActionListener(this);
		jfrm.add(displayStats);

		reset = new JButton("RESET");
		reset.addActionListener(this);
		jfrm.add(reset);
		
		jfrm.setVisible(true);	
		
		
	}

	/**
	 * The following displays the stats from the stat.java file or it will reset to the default blank setting
	 * if the reset button is clicked.
	 */
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == inputField) {
			int grade = Integer.parseInt(inputField.getText());
			Stats.add(grade);
			inputField.setText("");
		} else if (e.getSource() == displayStats) {
			display.setText(Stats.toString());
		} else if (e.getSource() == reset) {
			Stats = new Stats();
			inputField.setText("");
			display.setText("");
		}
	}

	public static void main(String[] args) {
		//Starting the GUI application
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new StatsGUI("Grades statistics");
			}
		});
	}
}
