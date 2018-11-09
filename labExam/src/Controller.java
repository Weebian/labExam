/**
 * Controller class for lab exam
 * @author Hoang Bui, 101029049
 *
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class Controller implements ActionListener{

	View view;
	Model model;
	
	/**
	 * Constructor for controller
	 * @param view; the view object that the controller is using
	 * @param model; the model object that the controller will manipulate
	 */
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
		
		/**
		view.getItemEditBuddy().addActionListener(this);
		view.getItemRemoveBuddy().addActionListener(this);
		view.getAddressBook().addListSelectionListener(this);
		 */
		//Add action listeners
	}
	
	
	/**
	 * Method to react when an event is triggered
	 * @param arg0; the event that was triggered
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JMenuItem event = (JMenuItem) arg0.getSource(); //change if not a JMenuItem
	}
	
	/**
	 * Main function to run code
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View view = new View("Lab Exam");
		Model model = new Model();
		Controller controller = new Controller(view, model);
	}

}
