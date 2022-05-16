package classEx2;

public class Recipe {

	public Recipe() {
		System.out.println("recipe 클래스 기본생성자 호출");
	}
	
	int nSource;
	String name;
	int count;
	public void setSource(int nSource) {
		this.nSource = nSource;
	}
	public int getSource() {
		return this.nSource;
	}
	
}
