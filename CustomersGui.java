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
		setTitle("Customers register");
		getContentPane().setLayout(null);

		JLabel lblKirjanSytt = new JLabel("Manage customers");
		lblKirjanSytt.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblKirjanSytt.setBounds(34, 27, 195, 20);
		getContentPane().add(lblKirjanSytt);

		JLabel lblKirjanNimi = new JLabel("Customer's id:");
		lblKirjanNimi.setBounds(34, 94, 111, 20);
		getContentPane().add(lblKirjanNimi);

		JLabel lblTekij = new JLabel("Customer's first name:");
		lblTekij.setBounds(34, 139, 111, 20);
		getContentPane().add(lblTekij);

		JLabel lblJulkaisuvuosi = new JLabel("Customer's contact person's id:");
		lblJulkaisuvuosi.setBounds(34, 189, 111, 20);
		getContentPane().add(lblJulkaisuvuosi);

		customerIdField = new JTextField();
		customerIdField.setBounds(148, 91, 146, 26);
		getContentPane().add(customerIdField);
		customerIdField.setColumns(10);

		customerFirstNameField = new JTextField();
		customerFirstNameField.setColumns(10);
		customerFirstNameField.setBounds(148, 136, 146, 26);

		getContentPane().add(customerFirstNameField);

		contactIdField = new JTextField();
		contactIdField.setColumns(10);
		contactIdField.setBounds(148, 186, 146, 26);
		getContentPane().add(contactIdField);

		JButton addButton = new JButton("Add new customer");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addCustomer();
			}
		});
		addButton.setBounds(34, 244, 115, 29);
		getContentPane().add(addButton);
	}

	protected void addCustomer() {

		String customerId = customerIdField.getText();
		String customerFirstName = customerFirstNameField.getText();
		String contactId = contactIdField.getText();
		
		Customers customer = new Customers(Integer.parseInt(customerId), customerFirstName, Integer.parseInt(contactId));

		CustomersDatabase.addCustomer(customer);
		JOptionPane.showMessageDialog(this, "Customer is now added.");
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
