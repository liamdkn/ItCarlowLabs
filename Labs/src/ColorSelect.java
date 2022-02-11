package lab13;

import javax.swing.*;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.util.Scanner;


public class ColorSelect {
	public static void main(String args[]) {

	     //Creating the Frame
	     JFrame frame = new JFrame("Colour Select");
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frame.setSize(450, 200);
	     frame.setVisible(true);
	     
	     //String for JCombobox
	     String [] options = {"RED", "ORANGE", "GREEN", "BLUE"};
	     
	   //Create top Pane
	     JPanel p1 = new JPanel(new GridBagLayout());
	     p1.setBackground(Color.gray);
	     
	     //Create JCombo box
	     JComboBox<String> jComboBox = new JComboBox<>(options);
	     p1.add(jComboBox);
	     frame.add(p1, BorderLayout.NORTH);
	     
	     
	   //Create center Pane
	     JPanel p2 = new JPanel(new GridBagLayout());
	     
	   //create JCheckboxes in new frame
	     JCheckBox c1 = new JCheckBox("Background");
	     JCheckBox c2 = new JCheckBox("Foreground");
	     frame.add(p2, BorderLayout.CENTER);
	     p2.add(c1);
	     p2.add(c2);
	     p2.setBackground(Color.gray);
	     
	     //create bottom pane
	     JPanel p3 = new JPanel(new GridBagLayout());
	     //Add JButtons to JPanel
	     JButton b1 = new JButton("OK");
	     JButton b2 = new JButton("CANCEL");
	     frame.add(p3, BorderLayout.SOUTH);
	     p3.add(b1);
	     p3.add(b2);
	     p3.setBackground(Color.gray);
	}
}
