package invoiceManager;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class driver extends JFrame{
	

	private JPanel contentPane;

	public static void main(String args[]) {
		private static final long serialVersionUID = 1L;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(450, 190, 1014, 597);
	    contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        contentPane.setBackground(Color.lightGray);
		
		
		
		
		
		customer customerObject = new customer();
		customerObject.customerForm();
		
		
	}
}
