package gslc2;

import java.util.Random;

public class hyrulian extends Chara {
	
	public hyrulian(int hp, int atk, int def) {
		super(hp, atk, def);
	}
	
	public void skill() {
		atk += new Random().nextInt(20);
		def += new Random().nextInt(20);
	}
}
