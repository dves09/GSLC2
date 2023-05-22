# GSLC2
GSLC 2 - Dave Sebastian Wijono.

The program I will be making will be a game called The Legend of Sunib: Tears of The Students. The story revolves around students of sunib or otherly called Sunibians that are isekaid into the land of Hyrule. When arriving, the students are asked to pick a role between being a Hyrulian, a Rito Warrior, a Goron Warrior, a Zora Warrior, or a Gerudo Warrior. To win, students must defeat the monster infront of them by utlizing their skills. Each role has their own skills, this is because of the utilization of the abstract function. And every role will have 4 determined functions as the classes follows the playerAction interace. 

Explanations
Interface acts as a sort of template that can be used by classes. This template determines what functions a class needs to have in order to follow the interface. For example if I were to create a class that follows the playerAction interface, it would need to have getHp(), getAtk(), getDef(), and skills.

Abstract on the other hand is different towards interface as it is sort of like an additional feature that a class can have. In this example, the superclass (Chara) is an abstract class. It also has an abstract function which is the skill() function. This is where abstract comes into play, the parent already determined the other 3 functions (getHp, getAtk, getDef) but not the skill function. Abstract allows new created subclasses to determine what they want to do with the skill function. So, in this program, every role has a different skill and utilizes the abstract function.

This program combines both abstract and interface to create the roles for the game. Therefore, every class that is created, wether it is player on npc would have the have getHp(), getAtk(), getDef(), and skill() function.
