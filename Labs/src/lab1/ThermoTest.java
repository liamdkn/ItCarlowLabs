package lab1;
// Student Name 	: Liam Durkan
// Student Id Number: 
// Date 			: October-2020
// Purpose 			: My first class implementation

public class ThermoTest { // begin class ThermTest
	public static void main(String args[]) { // being main method

		Thermometer thermA = new Thermometer(); // Create an instance of our Thermometer class
		Thermometer thermB = new Thermometer();

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius());
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius());

		thermB.setCelsius(10.0);
		System.out.println("Temp. of Thermometer b is " + thermB.getCelsius());

	} // end main
} // end class ThermTest
