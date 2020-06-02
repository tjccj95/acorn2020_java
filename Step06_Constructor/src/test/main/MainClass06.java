package test.main;

import javax.swing.JFrame;

public class MainClass06 {
	public static void main(String[] ar) {
		JFrame f=new JFrame("김구라");
		//x,y,폭,높이
		f.setBounds(100, 100, 500, 500);
		
		f.setVisible(true);
		//창을 닫았을때 프로세스도 자동으로 종료되도록 한다.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//final : 상수화
	}
}
