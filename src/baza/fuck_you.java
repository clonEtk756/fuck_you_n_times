package baza;

import java.util.Scanner;

public class fuck_you {
	
	public static boolean run = true;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		String s;										// �������� ��������� ���
		
		
		
		while(run) {
			System.out.print("������� ��� ������� �����? ");
			num = in.nextInt();							// ������� try-catch, ����� �������
			
			if(checkValue(num))
				printFuck(num);
			else {
				System.out.println("�� �����, ����� �� �����.");
				continue;
			}
			
			do {										// ����������, �����
				System.out.print("������� ��� �����? ");
				s = in.next();							// ��� � �������������� �����, ���� ��������� ��� ��������
			} while (!parseString(s));
			
														// ��������� ��� ������� ������� �����
		}
		
		in.close();
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
