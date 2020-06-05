package test.mypac;
/*
 * 개발자들이 사용하도록 미리 만들어둠(라이브러리처럼)
 * 보통 추상클래스는 누군가가 import 할수있도록 미리 만들어놨다.
 * 미완성된 구현되지 않는 추상 클래스를 멤버로 가지고 있는 클래스는
 * abstract 예약어를 붙여서 정의해야한다.
 * 재정의(오버라이드)와 추상클래스의 차이는 추상클래스는 여러개를 다룰수있다.
 */
public abstract class Weapon  {
	//abstract담긴 메서드를 가진 클래스는 반드시 abstract가 있어야한다.
	//무기 작동을 준비하는 메소드
	public void prepare() {
		System.out.println("무기작동을 준비중입니다.");
	}
	//구현되지 않은 추상메소드를 만들때는 abstract 예약어를 붙여서 메소드를 정의한다.
	//미완성된 부모 메서드로 사용하지않고 자식 메서드로만 사용하고자 할때
	public abstract void attack();
}
