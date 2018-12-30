package strategy;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();

	}

	@Override
	public void display() {
		System.out.println("I'm Real Mallard Duck");

	}

}
