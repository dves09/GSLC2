package gslc2;

public class goronWarrior extends Chara {
	public goronWarrior(int hp, int atk, int def) {
		super(hp, atk, def);
	}
	
	public void skill() {
		def += 5;
	}
}
