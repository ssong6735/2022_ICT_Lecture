package singletonEx;

public class main {

	public static void main(String[] args) {
		
		// �ν��Ͻ��� �ϳ��� ����
		Singleton stIns1 = Singleton.getInstance();
		Singleton stIns2 = Singleton.getInstance();
		Singleton stIns3 = Singleton.getInstance();
		
		System.out.println(stIns1);
		System.out.println(stIns2);
		System.out.println(stIns3);
		
		// �ν��Ͻ��� ���� ����
		Basic basic1 = new Basic();
		Basic basic2 = new Basic();
		System.out.println(basic1);
		System.out.println(basic2);		
		
	}
	
}
