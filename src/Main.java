package gslc2;

import java.util.Random;
import java.util.Scanner;

//Explanations
//Interface acts as a sort of template that can be used by classes. This template determines what functions
//a class needs to have in order to follow the interface. For example if I were to create a class that follows
//the playerAction interface, it would need to have getHp(), getAtk(), getDef(), and skills.

//Abstract on the other hand is different towards interface as it is sort of like an additional feature that a class can have.
//In this example, the superclass (Chara) is an abstract class. It also has an abstract function which is the skill() function.
//This is where abstract comes into play, the parent already determined the other 3 functions (getHp, getAtk, getDef) but not 
//the skill function. Abstract allows new created subclasses to determine what they want to do with the skill function. So, in
//this program, every role has a different skill and utilizes the abstract function.

//This program combines both abstract and interface to create the roles for the game. Therefore, every class that is created, wether
//it is player on npc would have the have getHp(), getAtk(), getDef(), and skill() function.


public class Main {
	
	public static int rng(int x) {
		int a = new Random().nextInt(x);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int selection = 0;
		int npc = 0;
		int flag =0;
		int damage = 0;
		int wincon = 0;
		int heal = 0;
		//create characters and npc
		hyrulian Player1 = new hyrulian(50, 20, 20);
		ritoWarrior Player2 = new ritoWarrior(60, 15, 15);
		goronWarrior Player3 = new goronWarrior(65, 30, 5);
		gerudoWarrior Player4 = new gerudoWarrior(20, 20, 65);
		zoraWarrior Player5 = new zoraWarrior(30, 30, 30);
		monster mons = new monster(50, 50, 50);
		//select role
		System.out.println("Select your role:");
		System.out.println("1. Hyrulian");
		System.out.println("2. Rito Warrior");
		System.out.println("3. Goron Warrior");
		System.out.println("4. Gerudo Warrior");
		System.out.println("5. Zora Warrior");
		System.out.println(">");
		selection = sc.nextInt(); sc.nextLine();
		System.out.printf("\n\n\n");
		//switch case depending on role
		switch(selection) {
		case 1:
			do {
				//Battle phase.
				System.out.println("What will you do?");
				System.out.println("Your Stats");
				System.out.printf("HP: %d, ATK: %d, DEF: %d\n", Player1.getHp(), Player1.getAtk(), Player1.getDef());
				System.out.println("Monster Stats");
				System.out.printf("HP: %d, ATK: %d, DEF: %d\n", mons.getHp(), mons.getAtk(), mons.getDef());
				System.out.println("1. Attack");
				System.out.println("2. Heal");
				System.out.println("3. Skill");
				System.out.println("4. Flee");
				System.out.printf(">");
				selection = sc.nextInt(); sc.nextLine();
				
				switch(selection) {
				case 1:
					System.out.println("You attacked the monster");
					damage = mons.getDef()-Player1.getAtk();
					damage = damage*-1;
					if(damage<0) {
						damage=0;
					}
					mons.hp = mons.hp - damage;
					break;
				case 2:
					heal = rng(30);
					Player1.hp = Player1.hp + heal;
					System.out.println("You heal");
					break;
				case 3:
					System.out.println("You've used your skill!");
					Player1.skill();
					break;
				case 4:
					flag++;
					System.out.println("You have fled the battle!");
					break;
				default:
					System.out.println("You have decided to do nothing!");
					break;
				}
				
				if(mons.getHp()>0 && wincon == 0) {
					npc = rng(3);
					switch(npc) {
					case 1:
						System.out.println("The monster attacked!");
						damage = Player1.getDef() - mons.getAtk();
						if(damage<0) {
							damage=0;
						}
						Player1.hp = Player1.hp - damage;
						break;
					case 2:
						System.out.println("The monster used its skill!");
						mons.skill();
						break;
					case 3:
						System.out.println("The monster fled!");
						flag++;
						break;
					}
				}else {
					wincon++;
					flag++;
				}
				
				if(Player1.hp <= 0) {
					flag++;
					System.out.println("You dead");
				}
				System.out.printf("\n\n\n");
			}while(flag==0);
			if(wincon > 0) {
				System.out.println("You have slained the monster!");
			}
			
			break;
		case 2:
			do {
				System.out.println("What will you do?");
				System.out.println("Your Stats");
				System.out.printf("HP: %d, ATK: %d, DEF: %d\n", Player2.getHp(), Player2.getAtk(), Player2.getDef());
				System.out.println("Monster Stats");
				System.out.printf("HP: %d, ATK: %d, DEF: %d\n", mons.getHp(), mons.getAtk(), mons.getDef());
				System.out.println("1. Attack");
				System.out.println("2. Heal");
				System.out.println("3. Skill");
				System.out.println("4. Flee");
				System.out.printf(">");
				selection = sc.nextInt(); sc.nextLine();
				
				switch(selection) {
				case 1:
					System.out.println("You attacked the monster");
					damage = mons.getDef()-Player2.getAtk();
					damage = damage*-1;
					if(damage<0) {
						damage=0;
					}
					mons.hp = mons.hp - damage;
					break;
				case 2:
					heal = rng(30);
					Player2.hp = Player2.hp + heal;
					System.out.println("You heal");
					break;
				case 3:
					System.out.println("You've used your skill!");
					Player2.skill();
					break;
				case 4:
					flag++;
					System.out.println("You have fled the battle!");
					break;
				default:
					System.out.println("You have decided to do nothing!");
					break;
				}
				
				if(mons.getHp()>0 && wincon == 0) {
					npc = rng(3);
					switch(npc) {
					case 1:
						System.out.println("The monster attacked!");
						damage = Player2.getDef() - mons.getAtk();
						if(damage<0) {
							damage=0;
						}
						Player2.hp = Player2.hp - damage;
						break;
					case 2:
						System.out.println("The monster used its skill!");
						mons.skill();
						break;
					case 3:
						System.out.println("The monster fled!");
						flag++;
						break;
					}
				}else {
					wincon++;
					flag++;
				}
				
				if(Player2.hp <= 0) {
					flag++;
					System.out.println("You dead");
				}
				System.out.printf("\n\n\n");
			}while(flag==0);
			if(wincon > 0) {
				System.out.println("You have slained the monster!");
			}
			break;
		case 3:
			do {
				System.out.println("What will you do?");
				System.out.println("Your Stats");
				System.out.printf("HP: %d, ATK: %d, DEF: %d\n", Player3.getHp(), Player3.getAtk(), Player3.getDef());
				System.out.println("Monster Stats");
				System.out.printf("HP: %d, ATK: %d, DEF: %d\n", mons.getHp(), mons.getAtk(), mons.getDef());
				System.out.println("1. Attack");
				System.out.println("2. Heal");
				System.out.println("3. Skill");
				System.out.println("4. Flee");
				System.out.printf(">");
				selection = sc.nextInt(); sc.nextLine();
				
				switch(selection) {
				case 1:
					System.out.println("You attacked the monster");
					damage = mons.getDef()-Player3.getAtk();
					damage = damage*-1;
					if(damage<0) {
						damage=0;
					}
					mons.hp = mons.hp - damage;
					break;
				case 2:
					heal = rng(30);
					Player3.hp = Player3.hp + heal;
					System.out.println("You heal");
					break;
				case 3:
					System.out.println("You've used your skill!");
					Player3.skill();
					break;
				case 4:
					flag++;
					System.out.println("You have fled the battle!");
					break;
				default:
					System.out.println("You have decided to do nothing!");
					break;
				}
				
				if(mons.getHp()>0 && wincon == 0) {
					npc = rng(3);
					switch(npc) {
					case 1:
						System.out.println("The monster attacked!");
						damage = Player3.getDef() - mons.getAtk();
						if(damage<0) {
							damage=0;
						}
						Player3.hp = Player3.hp - damage;
						break;
					case 2:
						System.out.println("The monster used its skill!");
						mons.skill();
						break;
					case 3:
						System.out.println("The monster fled!");
						flag++;
						break;
					}
				}else {
					wincon++;
					flag++;
				}
				
				if(Player3.hp <= 0) {
					flag++;
					System.out.println("You dead");
				}
				System.out.printf("\n\n\n");
			}while(flag==0);
			if(wincon > 0) {
				System.out.println("You have slained the monster!");
			}
			
			break;
		case 4:
			do {
				System.out.println("What will you do?");
				System.out.println("Your Stats");
				System.out.printf("HP: %d, ATK: %d, DEF: %d\n", Player4.getHp(), Player4.getAtk(), Player4.getDef());
				System.out.println("Monster Stats");
				System.out.printf("HP: %d, ATK: %d, DEF: %d\n", mons.getHp(), mons.getAtk(), mons.getDef());
				System.out.println("1. Attack");
				System.out.println("2. Heal");
				System.out.println("3. Skill");
				System.out.println("4. Flee");
				System.out.printf(">");
				selection = sc.nextInt(); sc.nextLine();
				
				switch(selection) {
				case 1:
					System.out.println("You attacked the monster");
					damage = mons.getDef()-Player4.getAtk();
					damage = damage*-1;
					if(damage<0) {
						damage=0;
					}
					mons.hp = mons.hp - damage;
					break;
				case 2:
					heal = rng(30);
					Player4.hp = Player4.hp + heal;
					System.out.println("You heal");
					break;
				case 3:
					System.out.println("You've used your skill!");
					Player4.skill();
					break;
				case 4:
					flag++;
					System.out.println("You have fled the battle!");
					break;
				default:
					System.out.println("You have decided to do nothing!");
					break;
				}
				
				if(mons.getHp()>0 && wincon == 0) {
					npc = rng(3);
					switch(npc) {
					case 1:
						System.out.println("The monster attacked!");
						damage = Player4.getDef() - mons.getAtk();
						if(damage<0) {
							damage=0;
						}
						Player4.hp = Player4.hp - damage;
						break;
					case 2:
						System.out.println("The monster used its skill!");
						mons.skill();
						break;
					case 3:
						System.out.println("The monster fled!");
						flag++;
						break;
					}
				}else {
					wincon++;
					flag++;
				}
				
				if(Player4.hp <= 0) {
					flag++;
					System.out.println("You dead");
				}
				System.out.printf("\n\n\n");
			}while(flag==0);
			if(wincon > 0) {
				System.out.println("You have slained the monster!");
			}
			
			break;
		case 5:
			
			do {
				System.out.println("What will you do?");
				System.out.println("Your Stats");
				System.out.printf("HP: %d, ATK: %d, DEF: %d\n", Player5.getHp(), Player5.getAtk(), Player5.getDef());
				System.out.println("Monster Stats");
				System.out.printf("HP: %d, ATK: %d, DEF: %d\n", mons.getHp(), mons.getAtk(), mons.getDef());
				System.out.println("1. Attack");
				System.out.println("2. Heal");
				System.out.println("3. Skill");
				System.out.println("4. Flee");
				System.out.printf(">");
				selection = sc.nextInt(); sc.nextLine();
				
				switch(selection) {
				case 1:
					System.out.println("You attacked the monster");
					damage = mons.getDef()-Player5.getAtk();
					damage = damage*-1;
					if(damage<0) {
						damage=0;
					}
					mons.hp = mons.hp - damage;
					break;
				case 2:
					heal = rng(30);
					Player5.hp = Player5.hp + heal;
					System.out.println("You heal");
					break;
				case 3:
					System.out.println("You've used your skill!");
					Player5.skill();
					break;
				case 4:
					flag++;
					System.out.println("You have fled the battle!");
					break;
				default:
					System.out.println("You have decided to do nothing!");
					break;
				}
				
				if(mons.getHp()>0 && wincon == 0) {
					npc = rng(3);
					switch(npc) {
					case 1:
						System.out.println("The monster attacked!");
						damage = Player5.getDef() - mons.getAtk();
						if(damage<0) {
							damage=0;
						}
						Player5.hp = Player5.hp - damage;
						break;
					case 2:
						System.out.println("The monster used its skill!");
						mons.skill();
						break;
					case 3:
						System.out.println("The monster fled!");
						flag++;
						break;
					}
				}else {
					wincon++;
					flag++;
				}
				
				if(Player5.hp <= 0) {
					flag++;
					System.out.println("You dead");
				}
				System.out.printf("\n\n\n");
			}while(flag==0);
			if(wincon > 0) {
				System.out.println("You have slained the monster!");
			}
			
			break;	
		default:
			System.out.println("You've defaulted to hyrulian");
			do {
				System.out.println("What will you do?");
				System.out.println("Your Stats");
				System.out.printf("HP: %d, ATK: %d, DEF: %d\n", Player1.getHp(), Player1.getAtk(), Player1.getDef());
				System.out.println("Monster Stats");
				System.out.printf("HP: %d, ATK: %d, DEF: %d\n", mons.getHp(), mons.getAtk(), mons.getDef());
				System.out.println("1. Attack");
				System.out.println("2. Heal");
				System.out.println("3. Skill");
				System.out.println("4. Flee");
				System.out.printf(">");
				selection = sc.nextInt(); sc.nextLine();
				
				switch(selection) {
				case 1:
					System.out.println("You attacked the monster");
					damage = mons.getDef()-Player1.getAtk();
					damage = damage*-1;
					if(damage<0) {
						damage=0;
					}
					mons.hp = mons.hp - damage;
					break;
				case 2:
					heal = rng(30);
					Player1.hp = Player1.hp + heal;
					System.out.println("You heal");
					break;
				case 3:
					System.out.println("You've used your skill!");
					Player1.skill();
					break;
				case 4:
					flag++;
					System.out.println("You have fled the battle!");
					break;
				default:
					System.out.println("You have decided to do nothing!");
					break;
				}
				
				if(mons.getHp()>0 && wincon == 0) {
					npc = rng(3);
					switch(npc) {
					case 1:
						System.out.println("The monster attacked!");
						damage = Player1.getDef() - mons.getAtk();
						if(damage<0) {
							damage=0;
						}
						Player1.hp = Player1.hp - damage;
						break;
					case 2:
						System.out.println("The monster used its skill!");
						mons.skill();
						break;
					case 3:
						System.out.println("The monster fled!");
						flag++;
						break;
					}
				}else {
					wincon++;
					flag++;
				}
				
				if(Player1.hp <= 0) {
					flag++;
					System.out.println("You dead");
				}
				System.out.printf("\n\n\n");
			}while(flag==0);
			if(wincon > 0) {
				System.out.println("You have slained the monster!");
			}
			break;
		}
		
		
		
		
		System.out.println("Thanks for Playing!");
	}

}
