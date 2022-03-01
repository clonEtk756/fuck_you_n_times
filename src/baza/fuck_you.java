package baza;

import java.io.BufferedReader;
import java.util.Scanner;

public class fuck_you {
	
	public static boolean run = true;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		String s;										// добавить поддержку имён
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String s = br.readLine();
//		int i = Integer.parseInt(s);
		
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.print("Сколько раз послать нахуй? ");
//			num = in.nextInt();							// впилить try-catch, легко наебать
//			in.nextLine();
			
			
		    boolean inError = true;
		    
		    while (inError) {
		        if (sc.hasNextInt())
		            num = sc.nextInt();
		        else {
		            sc.next();
		            System.out.print("Сука цифру напиши а ");
		            continue;
		        	}
		        inError = false;
		    }
			
			if(checkValue(num))
				printFuck(num);
			else {
				System.out.println("Всё хуйня, давай по новой. \n");
				continue;
			}
/*			
			do {										// переделать, хуево
				System.out.print("Послать ещё нахуй? ");
				s = in.next();							// баг с проскакиванием ввода, надо придумать как починить
			} while (!parseString(s));
*/			
														// придумать как красиво сделать выход
		}
		sc.close();
		
//		in.close();
	}
	
	public static boolean parseString(String s) {
			if(s.equalsIgnoreCase("да") || s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y"))
				return true;
			else if(s.equalsIgnoreCase("нет") || s.equalsIgnoreCase("no") || s.equalsIgnoreCase("n"))
				return false;
			else {
				System.out.print("Ты такие вещи не пиши. ");
				return false;
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
