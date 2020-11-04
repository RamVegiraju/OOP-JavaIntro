import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActionWindow extends JFrame{
	
	JLabel label;
	JButton button;
	
	/**
	 * For creating a label for the window*/
	public ActionWindow() {
		label = new JLabel("Nothing has happened");
		
	}
	
	
	/**
	 * For creating the empty text field on the window**/
	public static double CreateTextField() {
		JTextField field1 = new JTextField();
		String x = field1.getText();
		int km = Integer.parseInt(x);
		double res = convertKM(km);
		return res;
		
	}
	
	/**
	 * For creating an action button*/
	public void CreateActionButton() {
		button = new JButton();
	}
	
	static double convertKM(int s) {
		return (s * 0.621371);
	}
	
	/**
	 * Display window*/
	public static void createAndShowGUI() {
		ActionWindow frame = new ActionWindow();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.CreateTextField();
		frame.CreateActionButton();
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		

	}

}
