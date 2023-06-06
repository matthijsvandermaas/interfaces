public class Customer {

		public Customer(String name, String lastName, CreditCard creditCard) {
				this(name,  lastName, (int)(Math.random() * 100), creditCard);
		}

		public Customer(String name,  String lastName, int customerNumber, CreditCard creditCard) {
				this.name = name;
				this.customerNumber = customerNumber;
				this.lastName = lastName;
				this.creditCard = creditCard;
		}

	public abstract class CreditCard {
		public static void main(String[] args) {
			// Creëer een EmailContact-object en roep de sendMessage()-methode aan
			ContactInfo emailContact = new EmailContact("johndoe@example.com");
			emailContact.sendMessage();
		}

		public interface ContactInfo {
			void sendMessage();
		}

		private int debt;

		public CreditCard(int debt) {
			this.debt = debt;
		}

		public void pay(int amount) {
			this.debt = this.debt + amount;
		}

		public int getDebt() {
			return debt;
		}

		public void setDebt(int debt) {
			this.debt = debt;
		}

		public static class EmailContact implements ContactInfo {
			private String email;

			public EmailContact(String email) {
				this.email = email;
			}

			@Override
			public void sendMessage() {
				System.out.println("Sending email to " + email);
			}
		}
	}

		private int customerNumber;
		private String lastName;

		private CreditCard creditCard;

		public String getName(){
				return Name;
		}

		public void setName(String name){
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
		}

		public void printName(){
				System.out.println("Customer " + name);
		}
}
