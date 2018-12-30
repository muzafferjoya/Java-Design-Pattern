package strategy;

abstract class Duck {
	// Two Reference variables
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;

	// Duck Class Constructor
	public Duck() {

	}

	// abstract Method
	public abstract void display();

	// FlyBehaviour Interface Call Method fly()
	public void performFly() {
		flyBehaviour.fly();
	}

	// QuackBehaviour Interface Call Method quack()
	public void performQuack() {
		quackBehaviour.quack();
	}

	// setter Method
	public void setFlyBehaviour(FlyBehaviour fb) {
		flyBehaviour = fb;

	}

	// setter Method
	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}

	public void swim() {
		System.out.println("All ducks float, even decoys");
	}
}

public class Simulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack(); // Quack
		mallard.performFly(); // I'm Flying

		Duck model = new ModelDuck();
		model.performFly(); // I can't Fly
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly(); // I'm Flying With Rocket
	}

}
