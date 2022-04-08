package invoiceManager;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class invoice extends JFrame{

	String jdbcURL = "jdbc:mysql://localhost:3306/InvoiceManagement";
	String username = "root";
	String password = "password";
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField invoice_no;
	private JTextField invoice_date;
	private JTextField invoice_status;
	
	public invoice(){
		System.out.println("Invoice Method");
	    contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        contentPane.setBackground(Color.lightGray);
        
        //Title at top of page 
       JLabel lblTitle = new JLabel("INVOICE");
       lblTitle.setBounds(460, 40, 325, 20);
       lblTitle.setFont(new Font("Serif", Font.PLAIN, 22));
       contentPane.add(lblTitle);
        
        
	}
}
