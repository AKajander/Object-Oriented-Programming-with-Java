package Customers;

import java.util.Scanner;
import CustomersDatabase.CustomersDatabase;

public class Customers {

	private int id;
	private String firstName;
	private int contactPersonId;

	public Customers() {
		this.contactPersonId = 100;
	}
	
	public Customers(int id, String firstName, int contactPersonId) {
		this.id = id;
		this.firstName = firstName;
		this.contactPersonId = contactPersonId;
	}

	public int getCustomerId() {
		return id;
	}

	public void setCustomerId(int id) {
		this.id = id;
	}

	public String getCustomerFirstName() {
		return firstName;
	}

	public void setCustomerFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getCustomerContactPersonId() {
		return contactPersonId;
	}

	public void setCustomerContactPersonId(int contactPersonId) {
		this.contactPersonId = contactPersonId;
	}

	public String toString() {
		String printableText = "Customer's first name is: " + this.getCustomerFirstName()
		+ " and customer's contact person (id) is: " + this.getCustomerContactPersonId();
		
		return printableText;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Customers[] customersTable = new Customers[2];
		Scanner reader = new Scanner(System.in);

		int customerId;
		String name;
		int contactId;

		for (int i = 0; i < customersTable.length; i++) {
			
			Customers firstCustomer = new Customers();
			customersTable[i] = firstCustomer;

			System.out.println("Customer's id: ");
			customerId = reader.nextInt();
			firstCustomer.setCustomerId(customerId);

			System.out.println("Customer's first name: ");
			name = reader.nextLine();
			firstCustomer.setCustomerFirstName(name);

			System.out.println("Customer's contact person's id: ");
			contactId = reader.nextInt();
			reader.nextLine();
			firstCustomer.setCustomerContactPersonId(contactId);

		}

		for (int i = 0; i < customersTable.length; i++) {
			System.out.println(customersTable[i]);

			CustomersDatabase.addCustomer(customersTable[i]);

		}

		
	}

}