package test.human;

public class Men extends Person{
	
	//생성자
	public Men(Blood blood) {
		//Blood 타입의 생성자를 내려받는다?
		super(blood);//부모 생성자에 필요한 값을 전달한다.
	}
	
	
	public void seeMovie() {
		System.out.println("영화를 봐요");
	}
}
