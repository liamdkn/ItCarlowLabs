/*Liam Durkan - C00264405
  Driver Class - Customer Invoice Management System
*/
package invoiceManager;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		
		//All system.out.prints are for keeping track of code in console
		System.out.println("Driver");
	
		//Create the JFrame
		JFrame frame = new JFrame("Customer Invoice Managment System");//Tile at top of Frame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exit application on close click
        frame.setSize(1000, 600);//Set the size of JFrame
        
        //Creating the panel and adding components
        JPanel navPanel = new JPanel();
        
        //Title at top of page 
        JLabel lblTitle = new JLabel("NAVAGATION MENU");//Create JLable For Title
        lblTitle.setBounds(460, 40, 325, 20);//Set Location on JFrame
        lblTitle.setFont(new Font("Serif", Font.PLAIN, 22));//Set font size and type
        navPanel.add(lblTitle);//add JLable to panel 
      
        //Add functionality buttons that call individual classes 
        JButton customer = new JButton("Customer");//create customer button
        navPanel.add(customer);//add customer button to panel
        JButton product = new JButton("Product");//create product button
        navPanel.add(product);//add product button to panel
        JButton invoice = new JButton("Invoice");//create invoice button
        navPanel.add(invoice);//add invoice button to panel
        
        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.CENTER, navPanel);
        frame.setVisible(true);
        
        //Action listener for customer button that calls customer method on click
       customer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customer();
            }
        });
       
       //Action listener for customer button that calls product method on click
       product.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               product();
           }
       });
       
       //Action listener for customer button that calls invoice method on click
       invoice.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               invoice();
           }
       });



    }//end of Main

	
	//Customer method called from actionListener
	private static void customer() {
		
		System.out.println("Customer Method in driver");//Printing in console only
		
		customer customerObject = new customer();//Creating customer Object 
		customerObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		customerObject.setSize(1000, 600);
		customerObject.setVisible(true);
		
	}
	//Product method called from actionListener
	private static void product() {
		
		System.out.println("Product Method in driver");//Printing in console only
		
		product productObject = new product();//creating product 
		productObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		productObject.setSize(1000, 600);
		productObject.setVisible(true);
		
	}
	//Product method called from actionListener
	private static void invoice() {
		
		System.out.println("Invoice Method in driver");//Printing in console only
		
		invoice invoiceObject = new invoice();//Creating invoice object
		invoiceObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		invoiceObject.setSize(1000, 600);
		invoiceObject.setVisible(true);
		
	}


}
