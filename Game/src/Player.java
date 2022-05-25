
public class Player {

	// 플레이어
	private PlayerLevel level;
	
	public Player() {
		this.level = new BeginnerLevel();
		this.level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return this.level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		this.level.showLevelMessage();		
	}
	
	public void play(int count) {
		this.level.go(count);
		System.out.println();
	}
	
}
