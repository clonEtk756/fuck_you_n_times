package baza;

import java.io.BufferedReader;
import java.util.Scanner;

public class fuck_you {
	
	public static boolean run = true;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		String s;										// �������� ��������� ���
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String s = br.readLine();
//		int i = Integer.parseInt(s);
		
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.print("������� ��� ������� �����? ");
//			num = in.nextInt();							// ������� try-catch, ����� �������
//			in.nextLine();
			
			
		    boolean inError = true;
		    
		    while (inError) {
		        if (sc.hasNextInt())
		            num = sc.nextInt();
		        else {
		            sc.next();
		            System.out.print("���� ����� ������ � ");
		            continue;
		        	}
		        inError = false;
		    }
			
			if(checkValue(num))
				printFuck(num);
			else {
				System.out.println("�� �����, ����� �� �����. \n");
				continue;
			}
/*			
			do {										// ����������, �����
				System.out.print("������� ��� �����? ");
				s = in.next();							// ��� � �������������� �����, ���� ��������� ��� ��������
			} while (!parseString(s));
*/			
														// ��������� ��� ������� ������� �����
		}
		sc.close();
		
//		in.close();
	}
	
	public static boolean parseString(String s) {
			if(s.equalsIgnoreCase("��") || s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y"))
				return true;
			else if(s.equalsIgnoreCase("���") || s.equalsIgnoreCase("no") || s.equalsIgnoreCase("n"))
				return false;
			else {
				System.out.print("�� ����� ���� �� ����. ");
				return false;
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
