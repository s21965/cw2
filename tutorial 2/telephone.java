package pgo;

import java.util.Scanner;

public class Telephone {
	private String brand;
	private int number;
	private int resolution;
	Scanner in;

public class telephone {
		
		String brand;
		int resolution;
		int number;
		
public telephone (String brand, int resoultion, int number) {

			this.in = new Scanner(System.in);
			this.brand = brand;
			this.resolution = resolution;
			this.number = number;
			}

public String SendMessage (int number, String content) {
	
	return "Sending the message"+ content + "to number"+ number;	
	
}
}