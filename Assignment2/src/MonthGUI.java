import java.awt.*;
import java .awt. event .*;
import javax.swing.*; 

/**
 * @author yajurvashisht
 *
 *MonthGUI uses ActionListener to create a GUI for a user to interact with and recieves an input of month
 *and provides the number of days.
 *
 */

public class MonthGUI implements ActionListener{
	
	private JTextField inputField; 
	private JTextArea display;
	
	public MonthGUI() {
		this("A Program That Displays the Number of Days in a Month!");
	}

	public MonthGUI(String title)  {
	
		JFrame jfrm = new JFrame(title);
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(450, 100 );  
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JLabel prompt = new JLabel("Input a month between 1 and 12 and press return:");
		jfrm.add(prompt);
		
		inputField = new JTextField(2); 
		inputField.setText("0");
		inputField.addActionListener( this ); 
		jfrm.add(inputField);
		
		display = new JTextArea (1 ,30);
		jfrm.add(display);
		
		jfrm.setVisible(true);
		
	}
	
	/**
	 *Is used to get the input from the user and then provides the info of days in the month to the user in the GUI.
	 */
	
	public void actionPerformed(ActionEvent ae)  {
		if (ae.getSource() == inputField) { 
        int month = Integer.parseInt(inputField.getText());
        int days = Days.howManyDaysinMonth(month);     
			display.append("The month chosen was " + month + " which has " + days + " Days.\n");
		}
	}
	
	public static void main(String[] args) {
		
		//Starting the GUI application
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MonthGUI("Days of Months");
			}
		});

	}

}
