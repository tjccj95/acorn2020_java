package test.mypac;

public class MyUtil {
	//static 필드
	public static String version;
	//static 메소드
	public static void send() {
		System.out.println("전송합니다.");
		
	//이처럼 필드와 메소드는 static의 여부에따라 종류가 나뉜다.
	//static이 붙은 객체는 new를 붙이지 않아도 사용할수있다. heap,stack영역에 저장되지 않음.
	//static 고유공간에 저장
	}
}
