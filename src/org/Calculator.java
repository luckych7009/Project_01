package org;
import java.util.Scanner;
public class Calculator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Functions obj=new Functions();
		int press;
		do {
		System.out.print("Enter value of a :");
		int a=sc.nextInt();
		System.out.print("Enter value of b :");
		int b=sc.nextInt();
		System.out.println("Press 1 for addition.");
		System.out.println("Press 2 for subtraction.");
		System.out.println("Press 3 for division.");
		System.out.println("Press 4 for multiplication.");
		System.out.println("Press 5 for exit.");
		System.out.print("Enter value for operation :");
		 press=sc.nextInt();
		if(press==1) {
			System.out.println("Sum of a and b is : "+obj.add(a, b));
		}
		else if(press==2) {
			System.out.println("Subtraction of a from b is : "+obj.sub(a, b));
		}
		else if(press==3) {
			System.out.println("division of a from b is: "+obj.div(a, b));
		}
		else if(press==4) {
			System.out.println("Multiplication of a and b is : "+obj.multiply(a, b));
		}
		else {
			System.out.println("---Thanks for using calculator---");
			break;
		}
		}while(press !=5);
		
	}

}
