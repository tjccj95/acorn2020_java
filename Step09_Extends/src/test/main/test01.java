package test.main;

import test.human.Blood;
import test.human.Men;

public class test01 {
	public static void main(String[] args) {
		Blood neo = new Blood("+", "O");
		Men m1 = new Men(neo);
		test01.Mando(m1);
	}
	public static void Mando(Men m) {
		m.seeMovie();
		m.study();
		m.walk();
	}
}
	