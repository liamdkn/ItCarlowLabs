package invoiceManager;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class product extends JFrame{
	
	
	//Database Credentials
	String jdbcURL = "jdbc:mysql://localhost:3306/InvoiceManagement";
	String username = "root";
	String password = "password";
	
	//Declaring variables 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField catagory;
	private JTextField description;
	private JTextField costprice;
	private JTextField sellprice;
	private JButton register;
	private JButton update;
	private JButton delete;
	private JButton rowSel;

	//Product class
	public product(){
	
		System.out.println("Product Form Method");//Print to console Only 
		
		//Create GUI 
	    contentPane = new JPanel();//Create JPanel 
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.lightGray);//Set Backgrount color of contentPane
        
        //Title at top of pane
        JLabel lblNewProductRegister = new JLabel("PRODUCT");
        lblNewProductRegister.setBounds(460, 40, 325, 20);
        lblNewProductRegister.setFont(new Font("Serif", Font.PLAIN, 22));
        contentPane.add(lblNewProductRegister);
        
        //JLabels for Product form 
        JLabel lblFName = new JLabel("Product Name");//First name label
        lblFName.setBounds(58, 152, 99, 36);
        contentPane.add(lblFName);
        
        JLabel lblNewLabel = new JLabel("Product Catagory");//Last name label 
        lblNewLabel.setBounds(58, 188, 110, 36);
        contentPane.add(lblNewLabel);

        JLabel lblMobileNumber = new JLabel("Product Description");
        lblMobileNumber.setBounds(58, 224, 124, 36);
        contentPane.add(lblMobileNumber);
        
        JLabel lblEmailAddress = new JLabel("Cost Price ");
        lblEmailAddress.setBounds(58, 260, 124, 36);
        contentPane.add(lblEmailAddress);
        
        JLabel lblStreet = new JLabel("Sell Price");
        lblStreet.setBounds(58, 296, 99, 36);
        contentPane.add(lblStreet);
        
        //JTextFields corresponding with each JLabel
        name = new JTextField();
        name.setBounds(200, 152, 228, 35);
        contentPane.add(name);
        name.setColumns(10);

        catagory = new JTextField();
        catagory.setBounds(200, 188, 228, 35);
        contentPane.add(catagory);
        catagory.setColumns(10);

        description = new JTextField();
        description.setBounds(200,224, 228, 35);
        contentPane.add(description);
        description.setColumns(10);
        
        costprice = new JTextField();
        costprice.setBounds(200, 260, 228, 35);
        contentPane.add(costprice);
        costprice.setColumns(10);
        
        sellprice = new JTextField();
        sellprice.setBounds(200, 296, 228, 35);
        contentPane.add(sellprice);

        //Initialize JButtons and add a listener 
        register = new JButton("Register Product");
        update = new JButton("Update Product");
        delete = new JButton("Delete Product");
        rowSel = new JButton("Select Row");

        
        register.setFont(new Font("Serif", Font.PLAIN, 12));
        register.setBounds(50, 447, 170, 50);
        contentPane.add(register);
        
        update.setFont(new Font("Serif", Font.PLAIN, 12));
        update.setBounds(220, 447, 130, 50);
        contentPane.add(update);
        
        delete.setFont(new Font("Serif", Font.PLAIN, 12));
        delete.setBounds(350, 447, 140, 50);
        contentPane.add(delete);
        
        rowSel.setFont(new Font("Serif", Font.PLAIN, 12));
        rowSel.setBounds(287,340, 140, 50);
        contentPane.add(rowSel);

        //call product table method
        productTable();
       
        
       
        //Register button MYSQL Statement
        register.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//create strings with data from JTextboxes
                String Name = name.getText();
                String Catagory = catagory.getText();
                String Description = description.getText();
                String costPrice = costprice.getText();
                String sellPrice = sellprice.getText();
                
                //connection to database
                try {
        			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
        			
        			//if the connection is successful
        			if(connection != null) {
        				
        				//java sql statement to insert into table
        				String sql = "INSERT INTO product (name,catagory,description,costPrice,sellPrice)"
        						+ " VALUES (?,?,?,?,?)";
        				
        				PreparedStatement statement = connection.prepareStatement(sql);
        				statement.setString(1,  Name);
        				statement.setString(2,  Catagory);
        				statement.setString(3,  Description);
        				statement.setString(4,  costPrice);  
        				statement.setString(5,  sellPrice);
        				
        				int rows = statement.executeUpdate();
        				
        				//upon successful insertion into database 
        				if(rows > 0) {
        					System.out.println("A new Product has been inserted sucessfully.");
        				}
        			connection.close();//close connection to database 
        			}
        			
        		}//catch block if connection to database is not successful 
        		catch (SQLException ex) {
        			ex.printStackTrace();
        		}
            }

        });



      
        //TABLE//////////////////////
	}
        public void productTable() {
        try {
        
        	Connection connection = DriverManager.getConnection(jdbcURL, username, password);
        
        	String query = "SELECT * FROM product";//sql query
      
	        Statement stm = connection.createStatement();
	        ResultSet res = stm.executeQuery(query);
      
	        String columns[] = { "name", "catagory", "description","costPrice", "sellPrice"};//Columns to create JTable
	        String data[][] = new String[12][5];
      
	        int i = 0;
	        //while loop insering data into JTable
	        while (res.next()) {
	      
		          String name = res.getString("name");
		          String catagory = res.getString("catagory");
		          String description = res.getString("description");
		          String costPrice = res.getString("costPrice");
		          String sellPrice = res.getString("sellPrice");

		          data[i][0] = name;
		          data[i][1] = catagory;
		          data[i][2] = description;
		          data[i][3] = costPrice;
		          data[i][4] = sellPrice;
          
		          i++;
	        }
	        //create JTable 
	        DefaultTableModel model = new DefaultTableModel(data, columns);
	        JTable table = new JTable(model);
	        table.setShowGrid(true);
	        table.setShowVerticalLines(true);//show grid lines
	        table.setGridColor(Color.black);//change grid lines to black
	        JScrollPane pane = new JScrollPane(table);//allow table to scroll
	        JPanel panel = new JPanel();//create jpanel 
	        panel.add(pane);//add scroll pane to jpanel
	        table.getTableHeader().setBackground(Color.WHITE);
	        panel.setBounds(480, 150, 500, 250);//size of jpanel
	        contentPane.add(panel);//add panel to contentpane
	        
	        //when row select button is pressed
	        rowSel.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                
	           	 DefaultTableModel model = (DefaultTableModel)table.getModel();
	          	int row = table.getSelectedRow();
	          	
	          	//
	          	name.setText(model.getValueAt(row, 0).toString());
	          	catagory.setText(model.getValueAt(row, 1).toString());
	          	description.setText(model.getValueAt(row, 2).toString());
	          	costprice.setText(model.getValueAt(row, 3).toString());
	          	sellprice.setText(model.getValueAt(row, 4).toString());
	               
	            }
	        });
	        //when update button is pressed
	        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Name = name.getText();
                String Catagory = catagory.getText();
                String Description = description.getText();
                String costPrice = costprice.getText();
                String sellPrice = sellprice.getText();

                try {//connect to the database 
        			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
        			
        			if(connection != null) {
        				//my qul statment to update from jtextboxes into table
        				String sql = "UPDATE product SET name='"+Name+"',catagory='"+Catagory+"',description='"+Description+"',costPrice='"+costPrice+"'sellPrice='"+sellPrice+ "' WHERE productId=1;";
        				
        				PreparedStatement statement = connection.prepareStatement(sql);
        				statement.setString(1,  Name);
        				statement.setString(2,  Catagory);
        				statement.setString(3,  Description);
        				statement.setString(4,  costPrice);  
        				statement.setString(5,  sellPrice);
        				
        				int rows = statement.executeUpdate();
        				
        				if(rows > 0) {
        					System.out.println("Product has been updated sucessfully.");
        				}
        			connection.close();//close connection to database 
        			}
        			
        		}
        		catch (SQLException ex) {//if database cannot be sucesfully connected to 
        			ex.printStackTrace();
        		}
            }
      
    });
      } 
	catch(SQLException e) {
        e.printStackTrace();
      }   
       //end of table  
       
        }
	


        
	
}


