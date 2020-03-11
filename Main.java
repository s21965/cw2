package pgo;

public class Main {

	public static void main(String[] args) {
	
		Car A = new Car ("black","Ferrarri",20);
		String color = A.getColor();
		
		System.out.println("The color of car is"+color);
		
		String brand = A.getBrand();
		
		System.out.println("The branf of car is"+brand);
		
		int EngineCapacity= A.getEngineCapacity();
		
		System.out.println("The engine capacity of car is"+ EngineCapacity);
		


	}

}
