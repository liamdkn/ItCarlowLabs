package invoiceManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LaunchScreen {

	public static void main(String args[]) {
		
		
		
		//Create the JFrame
		JFrame frame = new JFrame("Customer Invoice Managment System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);

        //Creating the MenuBar and adding components
        JMenuBar menu = new JMenuBar();
        
        menu.setForeground(Color.white);
        
        //Create menubar objects
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        
        //Add menu items to menu bar
        menu.add(m1);
        menu.add(m2);
        

        
        //Buttons in drop down list
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);
        


        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JPanel panel2 = new JPanel();
        
        //Add functionality buttons 
        JButton customer = new JButton("Customer");
        panel2.add(customer);
        
       customer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, menu);
        frame.getContentPane().add(BorderLayout.CENTER, panel2);
        frame.setVisible(true);
        

    }
	
	class myListener implements ActionListener
	{  
	   public void actionPerformed(ActionEvent event)
	   {  
	      System.out.println("The button was press !");
	   }
	}
}