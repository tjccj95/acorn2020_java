package test.main;

class A1 implements Runnable{
	public void run() {
		System.out.println("\nHere is MyThread!!");
		for(int i = 0; i<100; i++) {
			for(char ch = 'A'; ch <= 'z'; ch++) {
				System.out.print(ch);
			}
		}
	}
}
	
public class test {
	public static void main(String[] ar) {
		System.out.println("Main Thread!!!");
		A1 mt = new A1(); // Runnable 객체 생성
		Thread myth = new Thread(mt); // Thread 객체생성
		myth.start(); // Thread 실행
		for(int i = 1; i <1000; i++) {
			System.out.print(i);
			if(i % 10 == 0) System.out.println();
			else System.out.print("\t");
		}
		System.out.println("\nMain Thread Destroy!!");
	}
}
