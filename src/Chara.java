package gslc2;

//This class acts as the parent or superclass that will be used by every role. As mentioned before, this utilizess both abstract and interface.
public abstract class Chara implements playerAction {
	int hp;
	int atk;
	int def;
	
	public Chara(int hp, int atk, int def) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public int getDef() {
		return def;
	}
	
	public abstract void skill();
	
}
