//LIAM DURKAN
package lab12;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;

class SwingDriver extends JFrame{
 public static void main(String args[]) {

     //Creating the Frame
     JFrame frame = new JFrame("My GUI");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(500, 300);
     frame.setVisible(true);
     
     //set background color on frame
    frame.getContentPane().setBackground(Color.gray);
    
    //Create Left Pane
    JPanel p1 = new JPanel(new GridBagLayout());
    
    //create JCheckboxes in new frame
    JCheckBox c1 = new JCheckBox("Snap to Grid");
    JCheckBox c2 = new JCheckBox("Show Grid");

    //Create constraint object
    GridBagConstraints c = new GridBagConstraints();
    //add Jbuttomns to frame
    c.insets = new Insets(10,10,10,10);
    c.gridx=0;
    c.gridy=1;
    p1.add(c1,c);
    c.gridx=0;
    c.gridy=2;
    p1.add(c2);
    //add new frame to JPanel
    frame.add(p1, BorderLayout.WEST);
    
    
    //create JTextboxes
    JPanel p2 = new JPanel(new GridBagLayout());
    JTextField t1 = new JTextField("X:");
    JTextField t2 = new JTextField("Y:");
    //add JCheckboxes to frame
    p2.add(t1,c);
    p2.add(t2);
    frame.add(p2,BorderLayout.CENTER);
    
    
    //Create Right JPanel
    JPanel p3 = new JPanel(new GridBagLayout());
    //Add JButtons to JPanel
    JButton b1 = new JButton("OK");
    JButton b2 = new JButton("CANCEL");
    JButton b3 = new JButton("HELP");
    
    //Seperate constraint needed as 3 buttons
    GridBagConstraints v2 = new GridBagConstraints();
    v2.insets = new Insets(10,10,10,10);
    v2.gridx=0;
    v2.gridy=3;
    p3.add(b1,c);
    p3.add(b2);
    p3.add(b3,v2);
    frame.add(p3,BorderLayout.EAST);
    
    //Set background colour for all individual panes
    p1.setBackground(Color.gray);
    p2.setBackground(Color.gray);
    p3.setBackground(Color.gray);
    
  
    
 }
}