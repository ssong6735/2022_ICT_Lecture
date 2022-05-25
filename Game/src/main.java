
public class main {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		p1.play(1);
		
		AdvancedLevel aLv = new AdvancedLevel();
		p1.upgradeLevel(aLv);
		p1.play(2);
		
		SuperLevel sLv = new SuperLevel();
		p1.upgradeLevel(sLv);
		p1.play(3);
		
	}
	
}
