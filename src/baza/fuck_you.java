package baza;

import java.util.Scanner;

public class fuck_you {
	
	public static boolean run = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// input for outer loop
		Scanner in = new Scanner(System.in);	// input for inner loop
		int num = 0;
		String answer = "";										// добавить поддержку имён
		
		while(run) {	// main outer loop
			System.out.print("Сколько раз послать нахуй? ");
			boolean ioError = true;
			
		    while (ioError) {
		        if (sc.hasNextInt())
		            num = sc.nextInt();
		        else {
		            sc.next();
		            System.out.println("Сука число напиши а ");
		            continue;
		        	}
		        ioError = false;
		    }
			
			if(checkValue(num))		// check for 0 and negative value
				printFuck(num);		// print "пошёл нахуй"
			else {
				System.out.println("\nВсё хуйня, давай по новой. \n");
				continue;
			}
			
			
			boolean ans = true;
			
			while(ans) {	// inner loop for repeating and exit
				System.out.println("Послать ещё? ");
				
				if (in.hasNext()) { // get input
					answer = in.nextLine();
				} else {
					System.out.println("что-то не так"); // should not ever work
					in.next();
					continue;
				}
				
				switch(parseString(answer)) {
					case 1: System.out.println("Харош.");	// start all over
							ans = false; 
							break;
					
					case 2: System.out.println("Не угадал."); break;		// you can't say no
					
					case 3: System.out.println("Хуйню пишеш.");	break;		// you can't say anything else
							
					case 0: System.out.println("Ну лан.");					// say "zaebal" to end program
							ans = false;
							exit();
				}
					
			}
			
		}
		sc.close();
		in.close();
	}
	
	public static int parseString(String s) {
		
			if (s.equalsIgnoreCase("заебал") || s.equalsIgnoreCase("zaebal"))	// end program
				return 0;
		
			else if(s.equalsIgnoreCase("да") || s.equalsIgnoreCase("д") || s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y"))
				return 1;
			
			else if(s.equalsIgnoreCase("нет") || s.equalsIgnoreCase("н") || s.equalsIgnoreCase("no") || s.equalsIgnoreCase("n"))
				return 2;
			
			else
				return 3;
					
	}
	
	public static void printFuck(int n) {
		for(int i = 1; i <= n; i++)
			System.out.println("Пошёл нахуй!");
		
		System.out.println();
	}
	
	public static boolean checkValue(int n) {
		if(n == 0) {
			System.out.print("Специально для тебя, нахуй ноль раз! ");
			return false;
			
		} else if(n < 0) {
			System.out.print("Умный пиздец, да? ");
			return false;
			
		} else
			return true;
	}
	
	public static void exit() { run = false; }

}
