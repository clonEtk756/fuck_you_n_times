package baza;

import java.util.Scanner;

public class fuck_you {
	
	public static boolean run = true;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		String s;										// добавить поддержку имён
		
		
		
		while(run) {
			System.out.print("Сколько раз послать нахуй? ");
			num = in.nextInt();							// впилить try-catch, легко наебать
			
			if(checkValue(num))
				printFuck(num);
			else {
				System.out.println("Всё хуйня, давай по новой.");
				continue;
			}
			
			do {										// переделать, хуево
				System.out.print("Послать ещё нахуй? ");
				s = in.next();							// баг с проскакиванием ввода, надо придумать как починить
			} while (!parseString(s));
			
														// придумать как красиво сделать выход
		}
		
		in.close();
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
