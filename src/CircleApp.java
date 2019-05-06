import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scrn = new Scanner(System.in);
		String resume = "Y";
		
		System.out.println("Welcome to the Circle Tester");
		
		while(!resume.equalsIgnoreCase("N")) {
			System.out.print("Enter radius: ");
			double input = scrn.nextDouble();
			
			Circle circle = new Circle(input);
			
			System.out.println("Circumference: " + circle.getFormattedCircumference());
			
			System.out.println("Area: " + circle.getFormattedArea())  ;
			
			System.out.println("Continue?(y/n): ");
			resume = scrn.next();
		}
		System.out.println("Goodbye");
	}

}
