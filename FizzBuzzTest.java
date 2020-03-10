package cl.talento;

import java.util.Scanner;

public class FizzBuzzTest {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Ingrese un numero: ");
	int number = sc.nextInt();

	
		FizzBuzz fizz = new FizzBuzz();
		System.out.println(fizz.fizzBuzz(number));
		
	}
	
}