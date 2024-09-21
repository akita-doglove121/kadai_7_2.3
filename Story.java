package kadai7;
import java.util.*;
public class Story {
	public static void main(String [] args) {
		
		Scanner sc1 = new Scanner (System.in);
		//勇者の作成
		Hero hero = new Hero();
		System.out.println("勇者の名前を入力してください。");
		hero.name = sc1.nextLine();
		
		System.out.println("体力を入力してください。");
		hero.hp = sc1.nextInt();
		
		System.out.println("攻撃力を入力してください。");
		hero.atk = sc1.nextInt();
		
		System.out.println("防御力を入力してください。");
		hero.dfn = sc1.nextInt();
		
		System.out.println("素早さを入力してください。");
		hero.spd = sc1.nextInt();
		
		
		System.out.println("勇者" + hero.name + "が誕生した！");
		System.out.println("体力は" + hero.hp + "だ");
		System.out.println("攻撃力は" + hero.atk + "だ");
		System.out.println("防御力は" + hero.dfn + "だ");
		System.out.println("素早さは" +hero.spd + "だ");
		
		Scanner sc3 = new Scanner(System.in);
		//魔法使いの作成
		Magician magician = new Magician();
		System.out.println("魔法使いの名前を入力してください。");
		magician.name = sc3.nextLine();
		
		System.out.println("体力を入力してください。");
		magician.hp = sc3.nextInt();
		
		System.out.println("攻撃力を入力してください。");
		magician.atk = sc3.nextInt();
		
		System.out.println("防御力を入力してください。");
		magician.dfn = sc3.nextInt();
		
		System.out.println("素早さを入力してください。");
		magician.spd = sc3.nextInt();
		
		System.out.println("MPを入力してください。");
		magician.mp = sc3.nextInt();
		
		System.out.println("魔法使い" + magician.name + "が誕生した！");
		System.out.println("体力は" + magician.hp + "だ");
		System.out.println("攻撃力は" + magician.atk + "だ");
		System.out.println("防御力は" + magician.dfn + "だ");
		System.out.println("素早さは" + magician.spd + "だ");
		System.out.println("MPは" + magician.mp + "だ");
		
		Scanner sc2 = new Scanner(System.in);
		//モンスターの作成
		Monster monster = new Monster();
		System.out.println("敵モンスターの名前を入力してください。");
		monster.name = sc2.nextLine();
		
		System.out.println("敵モンスターの体力を入力してください。");
		monster.hp = sc2.nextInt();
		
		System.out.println("敵モンスターの攻撃力を入力してください。");
		monster.atk = sc2.nextInt();
		
		System.out.println("敵モンスターの防御力を入力してください。");
		monster.dfn = sc2.nextInt();
		
		System.out.println("素早さを入力してください。");
		monster.spd = sc2.nextInt();
		
		System.out.println("モンスターの" + monster.name + "が誕生した！");
		System.out.println( monster.name + "の体力は" + monster.hp + "だ");
		System.out.println( monster.name + "の攻撃力は" + monster.atk + "だ");
		System.out.println( monster.name + "の防御力は" + monster.dfn + "だ");
		System.out.println( monster.name + "素早さは" + monster.spd + "だ");
		
        //戦闘
		ArrayList<Character> turnOrder = new ArrayList <>();
		turnOrder.add(hero);
		turnOrder.add(magician);
		turnOrder.add(monster);
		//戦闘の順番を決める
		turnOrder.sort(Comparator.comparingInt(Character::getspd).reversed());
		
        System.out.println("戦闘開始！！");
        
        while(true) {
        	for (Character character : turnOrder) {
        		if (hero.hp <= 0 && magician.hp <= 0) {
                    System.out.println("勇者たちは敗北した・・・");
                    return; // ゲーム終了
                } else if (monster.hp <= 0) {
                    System.out.println("勇者たちは勝利した！");
                    return; // ゲーム終了
                }
            	if (character instanceof Hero) {
            		Hero h = (Hero) character;
            		hero.attack(monster);
            	}
            	else if (character instanceof Magician) {
            		Magician mg = (Magician) character;
            		magician.mg_attack(monster);
            	}
            	else if (character instanceof Monster) {
                    Monster mon = (Monster) character;
                    monster.attack(hero, magician); 
            	}
            }
        }		
	}
}
