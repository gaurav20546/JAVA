package Saturaday_28_Exam;
import java.util.Scanner;
import java.util.function.*;

public class sensorData 
{
	private double temperature;
	private double humidity;
	
	sensorData(double temperature,double humidity)
	{
		this.temperature=temperature;
		this.humidity=humidity;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	
	public static void main(String[] args)
	{
		sensorData s=new sensorData(30.3,20.0);
	
		Function<sensorData,Double> at=data ->data.getTemperature();
		double resultTemperature = at.apply(s);
		 System.out.println("Temperature: " + resultTemperature);
		 
		 Double threshold = 25.0;
		 Function<Double, Boolean> Threshold = temp -> {return temp > threshold;  };
	
	        System.out.printf("Is temperature above .1f degrees? "+(Threshold.apply(resultTemperature)));
    }

	
}
/*1) 
Define a user defined class, SensorData , with private attributes double temperature, double humidity. To initialize these develop
 one parameterised
constructor and provide setters and getters.

Take main method in SensorData class and use Function(Predefined Functional interface) to analyse the temperature, which should 
take a SensorData instance as a parameter and use a functional interface to return the temperature and store and display the result.
Double apply(SensorData Data).

Take one local variable double threshold  with temperature 25.0.
Define a second lambda expression using Function<Double, Boolean> type,  that takes a Double (temperature) as a parameter
 and returns true if the temperature is above a specified threshold (e.g., 25 degrees Celsius). Apply this function to check if 
 the calculated temperature is above the given threshold and printf true or false as per return value.
Boolean apply(Double temperature);
*/
