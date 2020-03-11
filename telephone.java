package pgo;

public class telephone {
		
		String brand;
		int resolution;
		int number;
		
public telephone (String brand, int resoultion, int number) {
			
			this.brand = brand;
			this.resolution = resolution;
			this.number = number;
			}

public String SendMessage (int number, String content) {
	
	return "Sending the message"+ content + "to number"+ number;	
	
}
}