package lab3;

import java.util.Scanner;

public class Labthree {

	public static void main(String[] args) {

		System.out.println("Whats your name?");
		Scanner newName =new Scanner(System.in);
		String  name = newName.nextLine() ;
		System.out.println("hello " + name + ", please enter a number between 1 and 100");
		Scanner usersNumber = new Scanner(System.in);
		int i = usersNumber.nextInt();
		
		if( i > 60 && i < 100 && i % 2 !=0 ) {
			System.out.println(name + " " + i + " is odd and over 60");
			
		}
			else if( i > 25 && i < 60 && i % 2 ==0  ) {
				System.out.println(name + " " + i + " is even" );
			}
			else if( i % 2 !=0) {
				System.out.println(name + " " + i + " is odd" );
			}
			else if ( i < 25 && i % 2 ==0 ) {
				System.out.println(name +" your number is even and less then 25" );
			}
			else {
				System.out.println(name +" your number was not between 1 and 100, please try again ");
			}
	}

}
