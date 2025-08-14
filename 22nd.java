//System.out.println(a);
//System is the public class out is the public static field ,
//print ln is a method of public of the class the represent out.
//this is a print stream.
public interface Car{
	public static Engine engine;// this becomes public static
//  private int method(); // this is a wrong
	//x int method(); // this is a public
	//protected int method1(); // this becomes public
	//int method1();
	int start_the_car(); // this is becomes in public
	}
	public class car{
		// implement the method
	}

	public Maruthi implements Car{
		@Override
		public int method1();
	}
	Car car=new Car();

// types of inhertiance in java
// 1) multiple inhertiance.
// 2) Multi level inhertiance.

//class parent{}
//class child1 extend parent{}
//class child2 extend parent{}
//class child3 extend child1,{}

// this is for hyricial
//class parent{}
//class child1 extend parent{}
//class child2 extend parent{}
//class child3 extend child1,child 2{} this is wrong cant interfaces each other

//solid
//S-single responsiblilty priciple
//O-Open Closed Princile (for opening the extension oe closing the extension
//L-Liskov's subsitution Princile
//I-Interface seggeration Principle
//D-Dependency Inversion Principle

//UML - Unified Markup Language


// this is for examples from gpt

 //1) Single Inheritance

class Car {
    void startEngine() {
        System.out.println("Engine started.");
    }
}

class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Battery charging...");
    }
}


//2) Multilevel Inheritance

class Vehicle {
    void drive() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started");
    }
}

class SportsCar extends Car {
    void turboBoost() {
        System.out.println("Turbo mode activated!");
    }
}

//3) Hierarchical Inheritance
class Car {
    void fuelType() {
        System.out.println("This is a fuel-based car.");
    }
}

class PetrolCar extends Car {
    void petrolOnly() {
        System.out.println("Runs on petrol.");
    }
}

class DieselCar extends Car {
    void dieselOnly() {
        System.out.println("Runs on diesel.");
    }
}

// 4) Multiple Inheritance (Not allowed with classes)

class Engine {
    void engineType() {
        System.out.println("Generic engine");
    }
}

class Battery {
    void batteryType() {
        System.out.println("Lithium battery");
    }
}

//  Not allowed in Java
// class HybridCar extends Engine, Battery {} // Error


//5) Multiple Inheritance (Using Interfaces)

interface Engine {
    void engineType();
}

interface Battery {
    void batteryType();
}

class HybridCar implements Engine, Battery {
    public void engineType() {
        System.out.println("Petrol engine");
    }

    public void batteryType() {
        System.out.println("Electric battery");
    }
}

// 6) Hybrid Inheritance (Using Interfaces)

interface Vehicle {
    void move();
}

interface Electric extends Vehicle {
    void charge();
}

interface Petrol {
    void fuel();
}

class HybridCar implements Electric, Petrol {
    public void move() {
        System.out.println("Hybrid car is moving.");
    }

    public void charge() {
        System.out.println("Charging battery...");
    }

    public void fuel() {
        System.out.println("Filling petrol...");
    }
}
