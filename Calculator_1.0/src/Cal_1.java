import java.lang.String;
import java.util.Scanner;

public class Cal_1 {
	
	Scanner readInput = new Scanner(System.in);
	String c;
	public Cal_1() {
		
		System.out.println("Please select option:\na. Addition \n" + "b. Substraction \n" + "c. Multiplication\n" + "d. Division\n" + "e. Square\n" );
		String key = readInput.next();
		double a;
		double b;
	    switch (key) {
		case "a":
			System.out.println("Enter values ");
			a = readInput.nextInt(); 
			b = readInput.nextInt();
			add(a, b);
			System.out.println(a + " + " + b + " = " + result);
			break;
		case "b" :
			System.out.println("Enter values ");
			a = readInput.nextInt(); 
			b = readInput.nextInt();
			sub(a, b);
			System.out.println(a + " - " + b + " = " + result);
		case "c" :
			System.out.println("Enter values ");
			a = readInput.nextInt(); 
			b = readInput.nextInt();
			multiply(a, b);
			System.out.println(a + " * " + b + " = " + result);
			break;
		case "d" :
			System.out.println("Enter values ");
			a = readInput.nextInt(); 
			b = readInput.nextInt();
			div(a, b);
			System.out.println(a + " / " + b + " = " + result);
			break;
		case "e" :
			System.out.println("Enter values ");
			a = readInput.nextDouble(); 
			square(a);
			System.out.println(a + "^2 = " + result);
			break;
		default:
			System.out.println("Invalid operation");
			break;
		}
//	    System.out.println("Do you want to continue? Y/N");
//	    c = readInput.next();

	}
	static double result;
	static String key;
	
	static double add(double a, double b) {
		result=a+b;
		return result;
	}
	static double sub(double a, double b) {
		result=a-b;
		return result;
	}
	static double multiply(double a, double b) {
		result=a*b;
		return result;
	}
	static double div(double a, double b) {
		result=a/b;
		return result;
	}
	static double square(double a) {
		result=a*a;
		return result;
	}
	
	public static void main(String[] args) {
		
	Cal_1 c = new Cal_1();
			    
	    
 	}


}
