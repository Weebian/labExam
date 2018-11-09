import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class AddressBookController implements ActionListener, ListSelectionListener {
	AddressBookView view;
	DefaultListModel<BuddyInfo> addressbook;

	public AddressBookController(AddressBookView view) {
		this.view = view;

		view.getItemCreateBook().addActionListener(this);
		view.getItemSaveBook().addActionListener(this);
		view.getItemAddBuddy().addActionListener(this);
		view.getItemEditBuddy().addActionListener(this);
		view.getItemRemoveBuddy().addActionListener(this);
		view.getAddressBook().addListSelectionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JMenuItem event = (JMenuItem) arg0.getSource();

		// Test event
		// System.out.println("Selected: " + e.getActionCommand());

		if (event.equals(view.getItemCreateBook())) { // Create
			int choice = JOptionPane.showConfirmDialog(null,
					"Creating a new address book will delete the current one. Do you wish to proceed?",
					"Confirm create", JOptionPane.YES_NO_OPTION);
			if (choice == JOptionPane.YES_OPTION) {
				addressbook = new DefaultListModel<BuddyInfo>();
				view.getAddressBook().setModel(addressbook);
				System.out.println("Created a new address book");
				view.getItemSaveBook().setEnabled(true);
				view.getItemAddBuddy().setEnabled(true);
			}
		} 
		else if (event.equals(view.getItemSaveBook())) { // Save
			try (PrintWriter out = new PrintWriter("filename.txt")) {
				out.println(view.getAddressBook().toString());
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Saved address book");
		} 
		else if (event.equals(view.getItemAddBuddy())) { // Add
			String name = JOptionPane.showInputDialog(view, "What is your buddy's name?", null);
			String city = JOptionPane.showInputDialog(view, "Where does your buddy live?", null);
			String number = JOptionPane.showInputDialog(view, "What is your buddy's number? (No dashes)", 0);
			if (name != null || city != null || number != null) {
				BuddyInfo buddy = new BuddyInfo(name, city, number);
				addressbook.addElement(buddy);
				System.out.println("Added a new buddy");
			} else {
				System.out.println("Add buddy has been cancelled");
			}
		} 
		else if (event.equals(view.getItemEditBuddy())) { // edit
			String name = JOptionPane.showInputDialog(view, "What is your buddy's name?", null);
			String city = JOptionPane.showInputDialog(view, "Where does your buddy live?", null);
			String number = JOptionPane.showInputDialog(view, "What is your buddy's number? (No dashes)", 0);
			if (name != null || city != null || number != null) {
				int index = view.getAddressBook().getSelectedIndex();
				addressbook.get(index).setName(name);
				addressbook.get(index).setAddress(city);
				addressbook.get(index).setPhoneNumber(number);
			}
		} 
		else if (event.equals(view.getItemRemoveBuddy())) { // remove
			int index = view.getAddressBook().getSelectedIndex();
			addressbook.remove(index);
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		if (e.getValueIsAdjusting() == false) {

			if (view.getAddressBook().getSelectedIndex() == -1) {
				view.getItemEditBuddy().setEnabled(false);
				view.getItemRemoveBuddy().setEnabled(false);
			} 
			else {
				view.getItemEditBuddy().setEnabled(true);
				view.getItemRemoveBuddy().setEnabled(true);
			}
		}
	}

	/**
	 * Main function to run code
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBookView view = new AddressBookView("AddressBook");
		AddressBookController controller = new AddressBookController(view);
	}
}
