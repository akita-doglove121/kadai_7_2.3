package kadai7;

public class Hero implements Character{
	String name;
	int hp;
	int atk;
	int dfn;
	int spd;
	int maxhp = hp;
	
void attack(Monster monster) {
	System.out.println(this.name + "の攻撃！");
	int damage = this.atk - monster.dfn;
	if ( damage < 0) {
		damage = 0;
	}
	monster.hp -= damage;
	System.out.println(monster.name + "に" + this.atk + "のダメージを与えた！");
	monster.status();
}

void deffence() {
	System.out.println("勇者はガードした！");
	if (this.dfn > this.dfn + 20) {
		this.dfn = this.dfn + 20;
		System.out.println("これ以上防御力はあがらない");
	}
	else {
		this.dfn += this.dfn + 10;
		System.out.println("防御力が10上がった！");
	}
}


void heal() {
	System.out.println("勇者は祈りをささげた！");

	if (this.hp > this.maxhp) {
		this.hp = this.maxhp;
		System.out.println("勇者の体力が全快した！");
		
	}
	else {
		this.hp += 10;
		System.out.println("勇者の体力が"+this.hp+"まで回復した！");
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
