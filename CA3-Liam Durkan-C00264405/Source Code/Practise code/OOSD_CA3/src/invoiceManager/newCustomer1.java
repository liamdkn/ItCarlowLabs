package invoiceManager;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public void newCustomer() {
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(450, 190, 1014, 597);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    
    contentPane.setBackground(Color.lightGray);
    
    //Title
    JLabel lblNewUserRegister = new JLabel("Register A New Customer");//Title at top of page 
    lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 36));
    lblNewUserRegister.setBounds(362, 52, 325, 50);
    contentPane.add(lblNewUserRegister);
    
  //First four JLabels
    JLabel lblFName = new JLabel("First name");//First name label
    lblFName.setFont(new Font("Tahoma", Font.PLAIN, 20));
    lblFName.setBounds(58, 152, 99, 43);
    contentPane.add(lblFName);
    
    JLabel lblNewLabel = new JLabel("Last name");//Last name label 
    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
    lblNewLabel.setBounds(58, 243, 110, 29);
    contentPane.add(lblNewLabel);

    JLabel lblMobileNumber = new JLabel("Mobile number");
    lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
    lblMobileNumber.setBounds(58, 324, 124, 36);
    contentPane.add(lblMobileNumber);
    
    JLabel lblEmailAddress = new JLabel("Email address");
    lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
    lblEmailAddress.setBounds(58, 400, 124, 36);
    contentPane.add(lblEmailAddress);
    
    //JTextFields corresponding with first four JLabels
    firstname = new JTextField();
    firstname.setFont(new Font("Tahoma", Font.PLAIN, 32));
    firstname.setBounds(214, 151, 228, 50);
    contentPane.add(firstname);
    firstname.setColumns(10);

    lastname = new JTextField();
    lastname.setFont(new Font("Tahoma", Font.PLAIN, 32));
    lastname.setBounds(214, 235, 228, 50);
    contentPane.add(lastname);
    lastname.setColumns(10);

    phone = new JTextField();
    phone.setFont(new Font("Tahoma", Font.PLAIN, 32));
    phone.setBounds(214, 320, 228, 50);
    contentPane.add(phone);
    phone.setColumns(10);
    
    email = new JTextField();
    email.setFont(new Font("Tahoma", Font.PLAIN, 32));
    email.setBounds(214, 395, 228, 50);
    contentPane.add(email);
    email.setColumns(10);
    
    //Second row of JFrame labels
    JLabel lblStreet = new JLabel("Street");
    lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 20));
    lblStreet.setBounds(542, 159, 99, 29);
    contentPane.add(lblStreet);

    JLabel lblCounty = new JLabel("County");
    lblCounty.setFont(new Font("Tahoma", Font.PLAIN, 20));
    lblCounty.setBounds(542, 245, 99, 24);
    contentPane.add(lblCounty);
    
    JLabel lblPostcode = new JLabel("Postcode");
    lblPostcode.setFont(new Font("Tahoma", Font.PLAIN, 20));
    lblPostcode.setBounds(542, 329, 139, 26);
    contentPane.add(lblPostcode);

    //Second corresponding row of JTextFields
    street = new JTextField();
    street.setFont(new Font("Tahoma", Font.PLAIN, 32));
    street.setBounds(707, 151, 228, 50);
    contentPane.add(street);
    street.setColumns(10);
   
    county = new JTextField();
    county.setFont(new Font("Tahoma", Font.PLAIN, 32));
    county.setBounds(707, 235, 228, 50);
    contentPane.add(county);
    
    postcode = new JTextField();
    postcode.setFont(new Font("Tahoma", Font.PLAIN, 32));
    postcode.setBounds(707, 320, 228, 50);
    contentPane.add(postcode);

    //initalise Jbutton and add a listener 
    button = new JButton("Register");
    
    button.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
            String firstName = firstname.getText();
            String lastName = lastname.getText();
            String Mobile = phone.getText();
            String Email = email.getText();
            String Street = street.getText();
            String County = county.getText();
            String Postcode = postcode.getText();

            String msg = "" + firstName;
            msg += " \n";
            if (Mobile.length() != 10) {
                JOptionPane.showMessageDialog(button, "Enter a valid mobile number");
            }

            try {
    			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
    			
    			if(connection != null) {
    				
    				String sql = "INSERT INTO customer (firstName,lastName,phone,email,street,county,postcode)"
    						+ " VALUES (?,?,?,?,?,?,?)";
    				
    				PreparedStatement statement = connection.prepareStatement(sql);
    				statement.setString(1,  firstName);
    				statement.setString(2,  lastName);
    				statement.setString(3,  Mobile);
    				statement.setString(4,  Email);
    				statement.setString(5,  Street);
    				statement.setString(6,  County);
    				statement.setString(7,  Postcode);
    				
    				int rows = statement.executeUpdate();
    				
    				if(rows > 0) {
    					System.out.println("A new Customer has been inserted sucessfully.");
    				}
    			connection.close();
    			}
    			
    		}
    		catch (SQLException ex) {
    			ex.printStackTrace();
    		}
        }
    });
    button.setFont(new Font("Tahoma", Font.PLAIN, 22));
    button.setBounds(399, 447, 259, 74);
    contentPane.add(button);
}
}