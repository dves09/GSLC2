package gslc2;

import java.util.Random;

public class monster extends Chara{

	public monster(int hp, int atk, int def) {
		super(hp, atk, def);
	}

	@Override
	public void skill() {
		int a = new Random().nextInt(10);
		if(a==1) {
			atk += 20000;
		}
		
	}

}
