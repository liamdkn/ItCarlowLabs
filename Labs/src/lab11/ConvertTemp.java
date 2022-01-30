package lab11;

//Converts a Fahrenheit temperature entered by the user to Celsius, or vice versa

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertTemp extends JFrame {
	
	private JTextField fahrenField = new JTextField();
	private JTextField celsiusField = new JTextField();
	
	
	
	private double celsius;
	private double fahrenheit;
	
	
	// Constructor
	public ConvertTemp(String title)	{
		// Set title for frame and choose layout
		super(title);
		getContentPane().setLayout(new GridLayout(2, 2));

		// Add Fahrenheit label and text field to frame
		add(new JLabel("Fahrenheit"));
		add(fahrenField);
		// Attach listener to text field
		FahrenHandler handlerFahren = new FahrenHandler();
        fahrenField.addActionListener(handlerFahren);
		
		// Add Celsius label and text field to frame
		add(new JLabel("Celsius"));
		add(celsiusField);
		// Attach listener to text field
		CelsiusHandler handlerCelsius = new CelsiusHandler();
        celsiusField.addActionListener(handlerCelsius);

		// Attach window listener
		addWindowListener(new WindowCloser());
	}//end costructor
	
	
	//private inner class for event handling
    private class CelsiusHandler implements ActionListener {
        public void actionPerformed(ActionEvent evt) {

	        //Waiting for the keystroke
	        celsius = Double.parseDouble(celsiusField.getText());
	
	        //Change from Celsius to fahrenheit
	        fahrenheit = 9.0 / 5.0 * celsius + 32;
	
	        //Display the result in fahrenheit field
	        fahrenField.setText(String.format("%.2f", fahrenheit));
	    }
    }

        private class FahrenHandler implements ActionListener {
            public void actionPerformed(ActionEvent evt) {

                //Waiting for the keystroke
                celsius = Double.parseDouble(celsiusField.getText());

                //Change from fahrenheit to celsius
                fahrenheit = 5.0 / 9.0 * (celsius - 32);

                //Display the result in celsius field
                celsiusField.setText(String.format("%.2f", celsius));
            }

        }
    
        
       

        
	// Listener for window
	class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
	}

}//end class