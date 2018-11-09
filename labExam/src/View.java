/**
 * View class for lab exam
 * @author Hoang Bui, 101029049
 *
 */

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class View extends JFrame{
	//private JMenu menuAddressBook, menuBuddyInfo;
	//private JMenuItem itemCreateBook, itemSaveBook, itemAddBuddy, itemEditBuddy, itemRemoveBuddy; 
	//private JMenuBar menuBar;
	//private JList<BuddyInfo> addressBook;
	private JPanel panel;
	
	/**
	 * @param title
	 */
	public View(String title) {
		super(title);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(1,1)); // will need to change
		
		/**
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
		*/
		
		//Generate Getter and Setter methods to retrieve and set the view components
	}
}
