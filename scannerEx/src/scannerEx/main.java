package scannerEx;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println("���̿� �̸��� �Է��ϼ���.");
		age = sc.nextInt();
		name = sc.next();
		
		System.out.println("���� : " + age);
		System.out.println("�̸� : " + name);
		
		sc.close();		
		
	}
	
}
