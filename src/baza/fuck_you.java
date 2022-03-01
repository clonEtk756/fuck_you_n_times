package baza;

import java.util.Scanner;

public class fuck_you {
	
	public static boolean run = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String s = "";										// добавить поддержку имён
		
		while(run) {	// main loop
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
				System.out.println("Всё хуйня, давай по новой. \n");
				continue;
			}
			
			
			boolean ans = true;
			
			while(ans) {	// secondary loop for repeating and exit
				System.out.println("Послать ещё? ");
				
				if(sc.hasNext())	// get input
					s = sc.next();
				else
					System.out.println("что-то не так");
				
				switch(parseString(s)) {
					case 1: System.out.println("харош"); 
							ans = false; 
							break;
					
					case 2: System.out.println("не угадал"); break;
					
					case 3: System.out.println("Ну лан, давай тогда");
							ans = false;
							exit(); 
							break;
				}
					
			}
			
		}
		sc.close();
	}
	
	public static int parseString(String s) {
			if(s.equalsIgnoreCase("да") || s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y"))
				return 1;
			
			else if(s.equalsIgnoreCase("нет") || s.equalsIgnoreCase("no") || s.equalsIgnoreCase("n"))
				return 2;
			
			else {
				System.out.println("Ты такие вещи не пиши. ");
				return 3;
			}
				
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
