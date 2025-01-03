package inherit;

abstract class Animal
{
	int age;
	public abstract void eat();
	public abstract void makeSound();
	public void sleep() {
		System.out.println("Animal Sleep for 8 hours");
	}
}
abstract class CatFamily extends Animal
{
	abstract void hunt();
	public abstract void makeSound();

}
class Cat extends CatFamily
{
	@Override
	public void eat() {
		// TODO Auto-generated method stub	
	}

	@Override
	void hunt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}
}
class Cheetah extends CatFamily
{
	@Override
	public void eat() {
		System.out.println("Cat eats meat");
		
	}

	@Override
	void hunt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}
	
}
interface Study
{
	void attendCollege();
	int fees=9000;
}
interface Party
{
	void doParty();
	int fees=9000;
}
interface Cocurricular
{
	void playGames();
	int fees=9000;
}
interface Cricket extends Cocurricular
{
	void batting();
	void fielding();
	//JDK 1.8 >
	public default void doToss() {
		
	}
	public static void shareScores() {
		
	}
}
class Men extends Animal implements Study,Party,Cricket {
	@Override
	public void eat() {
		// TODO Auto-generated method stub
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void doParty() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attendCollege() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGames() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void batting() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fielding() {
		// TODO Auto-generated method stub
		
	}
}
public class AnimalApp {

	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		a.sleep();
	}
}
