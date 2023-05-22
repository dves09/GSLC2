package gslc2;

public class gerudoWarrior extends Chara{
	public gerudoWarrior(int hp, int atk, int def) {
		super(hp, atk, def);
	}
	
	public void skill() {
		atk += 20;
	}
}
