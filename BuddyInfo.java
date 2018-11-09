
public class BuddyInfo {
	public String name;
	public String address;
	public String phoneNumber;
	
	/**
	 * Method to create a buddy object
	 * 
	 * @param name; Name of buddy
	 * @param address; buddy's address
	 * @param phoneNumber; buddy's phone number
	 */
	public BuddyInfo(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	
	/**
	 * Method to get buddy's name
	 * @return name, return buddy's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to set buddy's name
	 * @param name, buddy's name 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method to get buddy's address
	 * @return address, return buddy's address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Method to set buddy's address
	 * @param address; buddy's address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Method to obtain buddy's phone number
	 * @return phoneNumber, return buddy's phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Method to set buddy' phone number
	 * @param phoneNumber, buddy's phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * BuddyInfo's toString Method
	 */
	public String toString() {
		String text;
		text = ("\nName :" + this.name + "\nAddress: " + this.address + "\nPhone Number: " + this.phoneNumber);
		return text;
	}
}
