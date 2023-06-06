public class CreditCard {
	private String name;
	private int customerNumber;
	private String lastName;
	private CreditCard creditCard;
	private ContactInfo contactInfo;

	public CreditCard(String name, String lastName, CreditCard creditCard) {
		this(name, lastName, (int) (Math.random() * 100), creditCard);
	}

	public CreditCard(String name, String lastName, int customerNumber, CreditCard creditCard) {
		this.name = name;
		this.customerNumber = customerNumber;
		this.lastName = lastName;
		this.creditCard = creditCard;
		this.contactInfo = creditCard.getContactInfo();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
		this.contactInfo = createContactInfo(); // Invoke createContactInfo() method
	}

	public void printName() {
		System.out.println("Customer " + name);
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public interface ContactInfo {
		void sendMessage();
	}

	public class EmailContact implements ContactInfo {
		private String email;

		public EmailContact(String email) {
			this.email = email;
		}

		@Override
		public void sendMessage() {
			System.out.println("Sending email to " + email);
		}
	}

	// Define the createContactInfo() method
	public ContactInfo createContactInfo() {
		// Create and return a new instance of EmailContact
		return new EmailContact("example@example.com");
	}

	public static void main(String[] args) {
		// Create a CreditCard object
		CreditCard creditCard = new CreditCard("John", "Doe", null);

		// Create an EmailContact object and call the sendMessage() method
		ContactInfo emailContact = creditCard.new EmailContact("johndoe@example.com");
		emailContact.sendMessage();
	}
}
