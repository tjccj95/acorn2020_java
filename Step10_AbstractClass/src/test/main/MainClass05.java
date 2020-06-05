package test.main;

public class MainClass05 {
	//필드
	public String myName="김구라";
	public static String yourName="원숭이";
	public static void main(String[] args) {
		//System.out.println(this.myName);//static 영역에서는 this를 사용할수없다. heap영역에서 나의 참조값을 가져올때만 사용
		
		//System.out.println(MainClass05.myName); myName이라는 필드는 non static 이므로 클래스명. 으로 접근불가
		
		//myName은 non static 필드이므로 참조값으로 접근 가능
		System.out.println(new MainClass05().myName);
		
		//yourName 이라는 필드는 static 이므로 클래스명. 으로 접근가능
		System.out.println(MainClass05.yourName);
		
		//yourName과 main() 메소드는 동일 클래스 내부에 있기 때문에 클래스명 생략 가능
		System.out.println(yourName);
		
		//static 메소드 안에서 this는 의미도 없고 사용 불가.
		//System.out.println(this.yourName);
		//static 안에서는 static만 바로 접근해서 쓸수있다.
	}
	
}
