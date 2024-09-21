package kadai7;
import java.util.*;
public class Monster implements Character{
	String name;
	int hp;
	int atk;
	int dfn;
	int spd;
	
void attack(Hero hero , Magician magician) {
	System.out.println(this.name + "の攻撃！");
	
	Random rdm = new Random();
	int target = rdm.nextInt(2);
	
	if(target == 0) {
		System.out.println(this.name + "は" + hero.name + "に攻撃した！" );
		int damage = this.atk -hero.dfn;
		if (damage < 0) {
			damage = 0;
		}
		hero.hp -= damage;
		System.out.println(hero.name + "に" + this.atk + "のダメージを与えた！");
		hero.status();
		
	}
	else {
		System.out.println(this.name + "は" + magician.name + "に攻撃した！" );
		int damage = this.atk -magician.dfn;
		if (damage < 0) {
			damage = 0;
		}
		magician.hp -= damage;
		System.out.println(magician.name + "に" + this.atk + "のダメージを与えた！");
		magician.status();
	}
	
}
void deffence() {
	System.out.println(this.name+"は守りを硬めた！");
	if (this.dfn > this.dfn + 20) {
		this.dfn = this.dfn + 20;
		System.out.println("これ以上防御力はあがらない");
	}
	else {
		this.dfn += this.dfn + 10;
		System.out.println("防御力が10上がった！");
	}
	
}
@Override
public int getspd() {
    return this.spd;
}
void status() {
    System.out.println(this.name + "のHPは " + this.hp + "だ！");
}
}
