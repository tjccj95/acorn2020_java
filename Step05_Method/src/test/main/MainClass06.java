package test.main;
import test.mypac.Messenger;
import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] ar) {
		
		//Messenger 클래스의 static 메소드 3개를 하나씩 호출해보세요.
		Messenger.sendMessage("안녕하세요");
		Messenger.getMessage();
		Messenger.useCar(new Car());
	}
}
