package gslc2;

public class zoraWarrior extends Chara {
	public zoraWarrior(int hp, int atk, int def) {
		super(hp, atk, def);
	}
	
	public void skill() {
		atk += 15;
		def += 5;
	}
}
