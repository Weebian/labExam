/**
 * @author Hoang Bui 101029049
 *
 */
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class AddressBookView extends JFrame{

	private JMenu menuAddressBook, menuBuddyInfo;
	private JMenuItem itemCreateBook, itemSaveBook, itemAddBuddy, itemEditBuddy, itemRemoveBuddy; 
	private JMenuBar menuBar;
	private JList<BuddyInfo> addressBook;
	private JPanel panel;
	
	@SuppressWarnings("deprecation")
	public AddressBookView(String title) {
		super(title);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(1,1));
		
		menuBar = new JMenuBar();
		menuAddressBook = new JMenu("Address Book");  
		menuBuddyInfo = new JMenu("Buddy Info");
        
		itemCreateBook = new JMenuItem("Create");  
		itemSaveBook = new JMenuItem("Save");  
		itemAddBuddy = new JMenuItem("Add");
		itemEditBuddy = new JMenuItem("Edit");
		itemRemoveBuddy = new JMenuItem("Remove");
		
		itemSaveBook.setEnabled(false);
		itemAddBuddy.setEnabled(false);
		itemEditBuddy.setEnabled(false);
		itemRemoveBuddy.setEnabled(false);
		
		addressBook = new JList<BuddyInfo>();
		
		menuAddressBook.add(itemCreateBook); 
		menuAddressBook.add(itemSaveBook);   
		menuBuddyInfo.add(itemAddBuddy);
		menuBuddyInfo.add(itemEditBuddy);
		menuBuddyInfo.add(itemRemoveBuddy);
        menuBar.add(menuAddressBook);
        menuBar.add(menuBuddyInfo);
        panel.add(menuBar);
        panel.add(addressBook);
        
		this.setJMenuBar(menuBar);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // same job as CloseableFrame...
		this.setContentPane(panel);
        this.setSize(500,500);
		this.show();
	}

	/**
	 * return the JMenuItem that creates a new Address Book
	 * 
	 * @return itemCreateBook, return the JMenuItem
	 */
	public JMenuItem getItemCreateBook() {
		return itemCreateBook;
	}

	/**
	 * return the JMenuItem that saves the Address Book
	 * 
	 * @return itemSaveBook, return the JMenuItem
	 */
	public JMenuItem getItemSaveBook() {
		return itemSaveBook;
	}

	/**
	 * return the JMenuItem that adds a buddy to the Address Book
	 * 
	 * @return itemAddBuddy, return the JMenuItem
	 */
	public JMenuItem getItemAddBuddy() {
		return itemAddBuddy;
	}

	/**
	 * return the JMenuItem that edit a buddy on the Address Book
	 * 
	 * @return itemEditBuddy, return the JMenuItem
	 */
	public JMenuItem getItemEditBuddy() {
		return itemEditBuddy;
	}

	/**
	 * return the JMenuItem that remove a buddy on the Address Book
	 * 
	 * @return itemRemoveBuddy, return the JMenuItem
	 */
	public JMenuItem getItemRemoveBuddy() {
		return itemRemoveBuddy;
	}

	/**
	 * return a list of buddy from the address book
	 * 
	 * @return addressBook, return the list of buddy
	 */
	public JList<BuddyInfo> getAddressBook() {
		return addressBook;
	}

	/**
	 * Set a new list of buddy for the address book
	 * 
	 * @param addressBook, the new list of buddy
	 */
	public void setAddressBook(JList<BuddyInfo> addressBook) {
		this.addressBook = addressBook;
	}
	
}
