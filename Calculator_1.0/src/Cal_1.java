import java.util.Iterator;
import java.util.Scanner;

public class Cal_1 {
	
	static int result;
	static String key;
	
	static int add(int a, int b) {
		result=a+b;
		return result;
	}
	static int sub(int a, int b) {
		result=a-b;
		return result;
	}
	static int multiply(int a, int b) {
		result=a*b;
		return result;
	}
	static int div(int a, int b) {
		result=a/b;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner readInput = new Scanner(System.in);
		System.out.println("Helloworld");
		System.out.println("Please select operation : a. Addition \n" + "b. Substraction \n" + "c. Multiplication\n" + "d. Division\n" );
		String key = readInput.next();
		System.out.println("Enter values ");
	    int a = readInput.nextInt(); 
	    int b = readInput.nextInt();
	    switch (key) {
		case "a":
			add(a, b);
			System.out.println(a + " + " + b + " = " + result);
			break;
		case "b" :
			sub(a, b);
			System.out.println(a + " - " + b + " = " + result);
		case "c" :
			multiply(a, b);
			System.out.println(a + " * " + b + " = " + result);
			break;
		case "d" :
			div(a, b);
			System.out.println(a + " / " + b + " = " + result);
			break;
			
		default:
			break;
		}
	    
 	}

}
