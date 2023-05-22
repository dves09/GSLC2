package gslc2;

public class ritoWarrior extends Chara {
	
	public ritoWarrior(int hp, int atk, int def) {
		super(hp, atk, def);
	}
	
	public void skill() {
		atk += 10;
		def += 10;
	}
	
}
