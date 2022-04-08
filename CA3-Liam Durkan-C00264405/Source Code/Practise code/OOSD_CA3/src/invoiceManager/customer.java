package invoiceManager;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

class customer extends JFrame{
	
	private JPanel contentPane;
	
    try {
    	newCustomer frame = new newCustomer();
        frame.setVisible(true);
    } catch (Exception e) {
        e.printStackTrace();
   }
}
	
	public void customerForm(){
		
		System.out.println("customer form method");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(450, 190, 1014, 597);
	    contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        contentPane.setBackground(Color.lightGray);
        
         //Title at top of page 
        JLabel lblNewUserRegister = new JLabel("CUSTOMER");
        lblNewUserRegister.setBounds(460, 40, 325, 20);
        lblNewUserRegister.setFont(new Font("Serif", Font.PLAIN, 22));
        contentPane.add(lblNewUserRegister);
        
        //First four JLabels
        JLabel lblFName = new JLabel("First name");//First name label
        lblFName.setBounds(58, 152, 99, 36);
        contentPane.add(lblFName);
        
        JLabel lblNewLabel = new JLabel("Last name");//Last name label 
        lblNewLabel.setBounds(58, 188, 110, 36);
        contentPane.add(lblNewLabel);

        JLabel lblMobileNumber = new JLabel("Mobile number");
        lblMobileNumber.setBounds(58, 224, 124, 36);
        contentPane.add(lblMobileNumber);
        
        JLabel lblEmailAddress = new JLabel("Email address");
        lblEmailAddress.setBounds(58, 260, 124, 36);
        contentPane.add(lblEmailAddress);
        
        //JTextFields corresponding with first four JLabels
        firstname = new JTextField();
        firstname.setBounds(200, 152, 228, 35);
        contentPane.add(firstname);
        firstname.setColumns(10);

        lastname = new JTextField();
        lastname.setBounds(200, 188, 228, 35);
        contentPane.add(lastname);
        lastname.setColumns(10);

        phone = new JTextField();
        phone.setBounds(200,224, 228, 35);
        contentPane.add(phone);
        phone.setColumns(10);
        
        email = new JTextField();
        email.setBounds(200, 260, 228, 35);
        contentPane.add(email);
        email.setColumns(10);
        
        //Second row of JFrame labels
        JLabel lblStreet = new JLabel("Street");
        lblStreet.setBounds(58, 296, 99, 36);
        contentPane.add(lblStreet);

        JLabel lblCounty = new JLabel("County");
        lblCounty.setBounds(58, 332, 99, 36);
        contentPane.add(lblCounty);
        
        JLabel lblPostcode = new JLabel("Postcode");
        lblPostcode.setBounds(58, 368, 99, 36);
        contentPane.add(lblPostcode);

        //Second corresponding row of JTextFields
        street = new JTextField();
        street.setBounds(200, 296, 228, 35);
        contentPane.add(street);
       
        county = new JTextField();
        county.setBounds(200, 332, 228, 35);
        contentPane.add(county);
        
        postcode = new JTextField();
        postcode.setBounds(200, 368, 228, 35);
        contentPane.add(postcode);

        //Initialize JButtons and add a listener 
        register = new JButton("Register New Customer");
        update = new JButton("Update Customer");
        delete = new JButton("Delete Customer");
        
        register.setFont(new Font("Serif", Font.PLAIN, 12));
        register.setBounds(50, 447, 170, 50);
        contentPane.add(register);
        
        update.setFont(new Font("Serif", Font.PLAIN, 12));
        update.setBounds(220, 447, 130, 50);
        contentPane.add(update);
        
        delete.setFont(new Font("Serif", Font.PLAIN, 12));
        delete.setBounds(350, 447, 140, 50);
        contentPane.add(delete);
        
        
        
        
        
        
        //Register button MYSQL Statement
        register.addActionListener(new ActionListener() {
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
                    JOptionPane.showMessageDialog(register, "Enter a valid mobile number");
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
	}
}
}