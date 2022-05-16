package singletonEx;

public class Singleton {

	// �������
	private static Singleton instance;
	
	// private ������
	private Singleton() {
		System.out.println("Singleton ������ ȣ��!");
	}
	
	// �̱�������(�ϳ��� �ν��Ͻ��� ����) ����
	// ó������ �ν��Ͻ��� �����ϰ� ���Ŀ��� ������ �������
	// �ν��Ͻ��� ��ȯ�Ѵ�.
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
}
