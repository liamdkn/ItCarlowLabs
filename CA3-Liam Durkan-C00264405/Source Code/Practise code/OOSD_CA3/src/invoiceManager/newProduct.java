package invoiceManager;

import java.awt.BorderLayout;
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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class newProduct extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField catagory;
	private JTextField description;
	private JTextField costprice;
	private JTextField sellprice;
	private JButton button;
	
	String jdbcURL = "jdbc:mysql://localhost:3306/InvoiceManagement";
	String username = "root";
	String password = "password";
	

	public static void main(String[] args) {

                try {
                	newProduct frame = new newProduct();
                	frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
    }


	public newProduct() {
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(450, 190, 1014, 597);
	    contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        contentPane.setBackground(Color.lightGray);
        
        //Title
        JLabel lblAddNewProduct = new JLabel("Add A New Product");//Title at top of page 
        lblAddNewProduct.setFont(new Font("Times New Roman", Font.PLAIN, 36));
        lblAddNewProduct.setBounds(362, 52, 325, 50);
        contentPane.add(lblAddNewProduct);
        
        //First four JLabels
        JLabel lblName = new JLabel("Product Name");//First name label
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblName.setBounds(58, 152, 99, 43);
        contentPane.add(lblName);
        
        JLabel lblCatagory = new JLabel("Product Catagory");//Last name label 
        lblCatagory.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblCatagory.setBounds(58, 243, 110, 29);
        contentPane.add(lblCatagory);

        JLabel lblDescription = new JLabel("Product Decription");
        lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblDescription.setBounds(58, 324, 124, 36);
        contentPane.add(lblDescription);
        
        JLabel lblCostPrice = new JLabel("Product Cost Price");
        lblCostPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblCostPrice.setBounds(58, 400, 124, 36);
        contentPane.add(lblCostPrice);
        
        JLabel lblSellPrice = new JLabel("Product Sell Price");
        lblSellPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblSellPrice.setBounds(542, 159, 99, 29);
        contentPane.add(lblSellPrice);
        
        //JTextFields corresponding with first four JLabels
        name = new JTextField();
        name.setFont(new Font("Tahoma", Font.PLAIN, 32));
        name.setBounds(214, 151, 228, 50);
        contentPane.add(name);
        name.setColumns(10);

        catagory = new JTextField();
        catagory.setFont(new Font("Tahoma", Font.PLAIN, 32));
        catagory.setBounds(214, 235, 228, 50);
        contentPane.add(catagory);
        catagory.setColumns(10);

        description = new JTextField();
        description.setFont(new Font("Tahoma", Font.PLAIN, 32));
        description.setBounds(214, 320, 228, 50);
        contentPane.add(description);
        description.setColumns(10);
        
        costprice = new JTextField();
        costprice.setFont(new Font("Tahoma", Font.PLAIN, 32));
        costprice.setBounds(214, 395, 228, 50);
        contentPane.add(costprice);
        costprice.setColumns(10);
        
        sellprice = new JTextField();
        sellprice.setFont(new Font("Tahoma", Font.PLAIN, 32));
        sellprice.setBounds(707, 151, 228, 50);
        contentPane.add(sellprice);
        sellprice.setColumns(10);
        
      //initalise Jbutton and add a listener 
        button = new JButton("Add Product");
        
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                String Name = name.getText();
                String Catagory = catagory.getText();
                String Description = description.getText();
                String costPrice = costprice.getText();
                String sellPrice = sellprice.getText();
                
                try {
        			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
        			
        			if(connection != null) {
        				
        				String sql = "INSERT INTO product (name,catagory,description,costPrice,sellPrice)"
        						+ " VALUES (?,?,?,?,?)";
        				
        				PreparedStatement statement = connection.prepareStatement(sql);
        				statement.setString(1,  Name);
        				statement.setString(2,  Catagory);
        				statement.setString(3,  Description);
        				statement.setString(4,  costPrice);  
        				statement.setString(5,  sellPrice);
        				
        				int rows = statement.executeUpdate();
        				
        				if(rows > 0) {
        					System.out.println("A new Product has been inserted sucessfully.");
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

