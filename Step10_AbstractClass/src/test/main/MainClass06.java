package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static class RazerBeam extends test.mypac.Weapon{
		@Override
		public void attack() {
			System.out.println("레이저빔 발사!");
		}
		
	}

	public static void main(String[] args) {
		/*
		 * useWeapon() 메소드를 호출하는게 목적이다.
		 * 호출하려고 보니 Weapon 추상클래스 type 객체의 참조값이 필요하다.
		 * 따라서 Weapon 추상 클래스를 상속받은  클래스를 파일로 만들어야된다.
		 * 그런데 불금이다보니 만사가 귀찮다. 클래스를 파일로 만들기 싫다.
		 *  
		 */
		RazerBeam rz = new RazerBeam();
		useWeapn(rz);
		
		//local inner class도 이용해보자
		class OurWeapon extends Weapon{

			@Override
			public void attack() {
				System.out.println("지겹다 이제 그만 공격하자...");
			}
			
		}
		OurWeapon w2 = new OurWeapon();
		w2.attack();
}
	
	public static void useWeapn(Weapon w) {
		w.prepare();
		w.attack();
	}

}
