package Secondweek.abstracts;

public class AnimalExe {
	public static void main(String[] args) {
		
		//추상클래스 != 실체클래스
		Animal animal = null;
		animal = new Bird();
		animal.breathe();
		animal.sound();
		
		Bird bird = new Bird();
		bird.breathe();
		bird.sound();
	}
}
