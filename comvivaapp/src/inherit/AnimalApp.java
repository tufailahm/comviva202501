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
class Men extends Animal {
	@Override
	public void eat() {
		// TODO Auto-generated method stub
	}

	@Override
	public void makeSound() {
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
