package Secondweek.abstracts;
//추상클래스
public abstract class Animal {
	String kind;
	
	Animal(){}
	Animal(String kind){
		this.kind = kind;
	}
	
	void breathe() {
		System.out.println("숨을 쉽니다!");
	}
	
	//추상메소드
	abstract void sound();
}
