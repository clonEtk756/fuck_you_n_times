package baza;

import java.util.Scanner;

public class fuck_you {
	
	public static boolean run = true;

	public static void main(String[] args) {
		int num = 0;			// добавить поддержку имён
								// вилкой раз или жопу глаз => vilkoy raz ili v zhopu glaz
		budesh();

		while(run) {	// main loop
			System.out.print("How many times fuck you? ");
			
			num = getInt();
			
			if(checkValue(num))		// check for 0 and negative value
				printFuck(num);		// print "fuck you"
			else {
				System.out.println("\nVse huinya, davai po novoi. \n");
				continue;
			}
			
			askToFuckYouAgain();
		}
	}
	
	public static int getAnswer(String s) {
		
			if (s.equalsIgnoreCase("заебал") || s.equalsIgnoreCase("zaebal"))	// end program
				return 0;
		
			else if(s.equalsIgnoreCase("да") || s.equalsIgnoreCase("д") || s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y") || s.equalsIgnoreCase("budu"))
				return 1;
			
			else if(s.equalsIgnoreCase("нет") || s.equalsIgnoreCase("н") || s.equalsIgnoreCase("no") || s.equalsIgnoreCase("n") || s.equalsIgnoreCase("ne budu"))
				return 2;
			
			else
				return 3;	// for any other bullshit
	}
	
	public static void printFuck(int n) {
		for(int i = 1; i <= n; i++)
			System.out.println("Poshel nahui!");
		System.out.println();
	}
	
	public static boolean checkValue(int n) {
		if(n == 0) {
			System.out.print("Specialno dlya tebya, fuck you 0 times! ");
			return false;
			
		} else if(n < 0) {
			System.out.print("Umniy pizdec? ");
			return false;
			
		} else
			return true;
	}
	
	public static int getInt() {
		Scanner sc = new Scanner(System.in);	// input for outer loop
		int num = 0;
		boolean ioError = true;
		
		while (ioError) {
	        if (sc.hasNextInt())
	            num = sc.nextInt();
	        else {
	            sc.next();
	            System.out.println("Write a fucking number ");
	            continue;
	        	}
	        ioError = false;
	    }
		return num;
	}
	
	public static void askToFuckYouAgain() {
		Scanner in = new Scanner(System.in);	// input for 
		String answer = "";	
		boolean ans = true;
		
		while(ans) {	// inner loop for repeating and exit
			System.out.println("Poslat' eshcho? ");
			
			if (in.hasNext()) { // get input
				answer = in.nextLine();
			} else {
				System.out.println("something's wrong "); // should not ever work, just for safety
				in.next();
				continue;
			}
			
			switch(getAnswer(answer)) {
				case 1: System.out.println("Harosh.");	// return to the main loop
						ans = false; 
						break;
				
				case 2: System.out.println("Ne ugadal."); break;		// you can't say no
				
				case 3: System.out.println("Huiny pishesh'.");	break;		// you can't say anything else
						
				case 0: System.out.println("Nu lan.");					// say "zaebal" to end program
						ans = false;
						exit();
			}	
		}
	}
	
	public static void budesh() {
		Scanner in = new Scanner(System.in);
		String s = "";
		
		System.out.println("Budesh? ");
		s = in.nextLine();
		
		switch(getAnswer(s)) {
			case 1: System.out.println("Net, ne budesh "); break;
			
			case 2: System.out.println("Gde-to zagrustil 1 Farid"); break;
			
			case 3: System.out.println("bruh");
		}
		
	}
	
	public static void exit() { run = false; }
}
