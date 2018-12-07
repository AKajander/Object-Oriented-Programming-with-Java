package CustomersGui;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

import Customers.Customers;
import CustomersDatabase.CustomersDatabase;

public class CustomersGui extends JFrame {
	private JTextField customerIdField;
	private JTextField customerFirstNameField;
	private JTextField contactIdField;

	public CustomersGui() throws ParseException {
		getContentPane().setFont(new Font("Verdana", Font.PLAIN, 13));
		setTitle("Customers register");
		getContentPane().setLayout(null);

		customerIdField = new JTextField();
		customerIdField.setBounds(228, 93, 146, 26);
		getContentPane().add(customerIdField);
		customerIdField.setColumns(10);

		customerFirstNameField = new JTextField();
		customerFirstNameField.setColumns(10);
		customerFirstNameField.setBounds(228, 138, 146, 26);

		getContentPane().add(customerFirstNameField);

		contactIdField = new JTextField();
		contactIdField.setColumns(10);
		contactIdField.setBounds(228, 186, 146, 26);
		getContentPane().add(contactIdField);

		JButton addButton = new JButton("Add new customer");
		addButton.setFont(new Font("Verdana", Font.PLAIN, 18));
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addCustomer();
			}
		});
		addButton.setBounds(34, 255, 288, 29);
		getContentPane().add(addButton);
		
		JLabel lblManageCustomers = new JLabel("Manage customers");
		lblManageCustomers.setFont(new Font("Verdana", Font.BOLD, 25));
		lblManageCustomers.setBounds(34, 26, 340, 26);
		getContentPane().add(lblManageCustomers);
		
		JLabel lblCustomerId = new JLabel("CustomerId");
		lblCustomerId.setFont(new Font("Bodoni MT", Font.PLAIN, 18));
		lblCustomerId.setBounds(34, 96, 111, 16);
		getContentPane().add(lblCustomerId);
		
		JLabel lblCustomerfirstname = new JLabel("CustomerFirstName");
		lblCustomerfirstname.setFont(new Font("Bodoni MT", Font.PLAIN, 18));
		lblCustomerfirstname.setBounds(34, 141, 182, 16);
		getContentPane().add(lblCustomerfirstname);
		
		JLabel lblContactpersonid = new JLabel("ContactPersonId");
		lblContactpersonid.setFont(new Font("Bodoni MT", Font.PLAIN, 18));
		lblContactpersonid.setBounds(34, 189, 138, 16);
		getContentPane().add(lblContactpersonid);
	}

	protected void addCustomer() {

		String customerId = customerIdField.getText();
		String customerFirstName = customerFirstNameField.getText();
		String contactId = contactIdField.getText();
		
		Customers customer = new Customers(Integer.parseInt(customerId), customerFirstName, Integer.parseInt(contactId));

		CustomersDatabase.addCustomer(customer);
		JOptionPane.showMessageDialog(this, "A new customer is now saved into Customers table.");
		CustomersDatabase.getCustomer();
	}

	public static void main(String[] args) {

		try {
			JFrame newFrame = new CustomersGui();
			newFrame.setSize(800,400);
			newFrame.setVisible(true);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
