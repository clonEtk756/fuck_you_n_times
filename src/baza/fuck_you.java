package baza;

import java.util.Scanner;

public class fuck_you {
	
	public static boolean run = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// input for outer loop
		Scanner in = new Scanner(System.in);	// input for inner loop
		int num = 0;
		String answer = "";										// �������� ��������� ���
		
		while(run) {	// main outer loop
			System.out.print("������� ��� ������� �����? ");
			boolean ioError = true;
			
		    while (ioError) {
		        if (sc.hasNextInt())
		            num = sc.nextInt();
		        else {
		            sc.next();
		            System.out.println("���� ����� ������ � ");
		            continue;
		        	}
		        ioError = false;
		    }
			
			if(checkValue(num))		// check for 0 and negative value
				printFuck(num);		// print "����� �����"
			else {
				System.out.println("\n�� �����, ����� �� �����. \n");
				continue;
			}
			
			
			boolean ans = true;
			
			while(ans) {	// inner loop for repeating and exit
				System.out.println("������� ���? ");
				
				if (in.hasNext()) { // get input
					answer = in.nextLine();
				} else {
					System.out.println("���-�� �� ���"); // should not ever work
					in.next();
					continue;
				}
				
				switch(parseString(answer)) {
					case 1: System.out.println("�����.");	// start all over
							ans = false; 
							break;
					
					case 2: System.out.println("�� ������."); break;		// you can't say no
					
					case 3: System.out.println("����� �����.");	break;		// you can't say anything else
							
					case 0: System.out.println("�� ���.");					// say "zaebal" to end program
							ans = false;
							exit();
				}
					
			}
			
		}
		sc.close();
		in.close();
	}
	
	public static int parseString(String s) {
		
			if (s.equalsIgnoreCase("������") || s.equalsIgnoreCase("zaebal"))	// end program
				return 0;
		
			else if(s.equalsIgnoreCase("��") || s.equalsIgnoreCase("�") || s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y"))
				return 1;
			
			else if(s.equalsIgnoreCase("���") || s.equalsIgnoreCase("�") || s.equalsIgnoreCase("no") || s.equalsIgnoreCase("n"))
				return 2;
			
			else
				return 3;
					
	}
	
	public static void printFuck(int n) {
		for(int i = 1; i <= n; i++)
			System.out.println("����� �����!");
		
		System.out.println();
	}
	
	public static boolean checkValue(int n) {
		if(n == 0) {
			System.out.print("���������� ��� ����, ����� ���� ���! ");
			return false;
			
		} else if(n < 0) {
			System.out.print("����� ������, ��? ");
			return false;
			
		} else
			return true;
	}
	
	public static void exit() { run = false; }

}
