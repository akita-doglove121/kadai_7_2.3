package kadai7;

public class Magician implements Character{
	String name;
	int hp;
	int atk;
	int dfn;
	int spd;
	int mp;
	int maxhp = hp;
	int maxmp = mp;
	

void str_attack(Monster monster) {//物理攻撃メソッド
	System.out.println( this.name + "の物理攻撃！");
	int damage = this.atk - monster.dfn;
	if ( damage < 0) {
		damage = 0;
	}
	monster.hp -= damage;
	System.out.println(monster.name + "に" + this.atk + "のダメージを与えた！");
	monster.status();
	
}

void mg_attack(Monster monster) {//魔法攻撃メソッド（物理に攻撃を一時的に強化付与）
	System.out.println( this.name + "は攻撃魔法を唱えた！");
	this.atk += 3;
	int damage = this.atk - monster.dfn;
	if ( damage < 0) {
		damage = 0;
	}
	monster.hp -= damage;
	System.out.println(monster.name + "に" + this.atk + "のダメージを与えた！");
	System.out.println("MPを3消費した。");
	this.mp -=3;
	System.out.println("残りMPは" + this.mp + "だ！");
	this.atk -=3;
	monster.status();
}

void mg_heal() {//回復魔法メソッド
	System.out.println( this.name + "は回復魔法を唱えた");
	
	if (this.hp > this.maxhp) {
		this.hp = this.maxhp;
	}
	else {
		System.out.println("体力が5回復した");
		this.hp += 5;
	}
	System.out.println("MPを2消費した。");
	this.mp -= 2;
	
}

void meditation() {
	System.out.println( this.name + "は瞑想した！");
	System.out.println("MPが全快した！");
	this.mp = this.maxmp;
	
}
@Override
public int getspd() {
    return this.spd;
}
void status() {
    System.out.println(this.name + "のHPは " + this.hp + "だ！");
}
}
