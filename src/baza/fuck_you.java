package baza;

import java.util.Scanner;

public class fuck_you {
	
	public static boolean run = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String s = "";										// �������� ��������� ���
		
		while(run) {	// main loop
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
				System.out.println("�� �����, ����� �� �����. \n");
				continue;
			}
			
			
			boolean ans = true;
			
			while(ans) {	// secondary loop for repeating and exit
				System.out.println("������� ���? ");
				
				if(sc.hasNext())	// get input
					s = sc.next();
				else
					System.out.println("���-�� �� ���");
				
				switch(parseString(s)) {
					case 1: System.out.println("�����"); 
							ans = false; 
							break;
					
					case 2: System.out.println("�� ������"); break;
					
					case 3: System.out.println("�� ���, ����� �����");
							ans = false;
							exit(); 
							break;
				}
					
			}
			
		}
		sc.close();
	}
	
	public static int parseString(String s) {
			if(s.equalsIgnoreCase("��") || s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y"))
				return 1;
			
			else if(s.equalsIgnoreCase("���") || s.equalsIgnoreCase("no") || s.equalsIgnoreCase("n"))
				return 2;
			
			else {
				System.out.println("�� ����� ���� �� ����. ");
				return 3;
			}
				
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
