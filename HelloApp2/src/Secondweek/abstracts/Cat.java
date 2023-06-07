package Secondweek.abstracts;

public class Cat extends Animal {
	
	@Override
	void breathe() {
		System.out.println("고양이가 숨을쉽니다.");
	}
	
	
	@Override
	void sound() {
		System.out.println("야옹");
	}
}
