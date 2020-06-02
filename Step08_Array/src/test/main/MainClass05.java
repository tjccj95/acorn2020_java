package test.main;
import test.mypac.Rect;
import java.io.*;
public class MainClass05 {
	public static void main(String[] ar) throws IOException{
		//1. Rect 객체를 담을수 있는 방 3개짜리 배열객체를 생성해서
		// 참조값을 rects라는 이름의 지역변수에 담아보세요
		Rect[] rects=new Rect[3];
		//2. 배열에 Rect 객체 3개를 순서대로 담아보세요
		rects[0]= new Rect(10,10);
		rects[1]= new Rect(10,20);
		rects[2]= new Rect(20,20);

		//3. 반복문 for문을 이용해서 각각 사각형의 면적을 구해보세요
		for(int i=0; i<rects.length; i++) {
			System.out.println("이 사각형의 면적은 "+rects[i].getArea()+"㎥ 입니다.");
		}
	}
}
