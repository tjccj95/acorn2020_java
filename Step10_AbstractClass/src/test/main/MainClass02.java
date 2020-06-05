package test.main;

import test.mypac.Weapon;
import test.mypac.Machingun;

public class MainClass02 {
	public static void main(String[] args) {
		//여러분이 직접 클래스를 만들고 객체생성을 해서 
		//아래의 useWeapon() 메소드를 호출해보세요
		Weapon M1 = new Machingun();
		useWeapon(M1);
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
