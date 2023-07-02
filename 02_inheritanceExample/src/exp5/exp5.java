package exp5;

public class exp5 {
	public static void main(String[] args) {
		Bike bike = new Bike();
		Car car = new Car();
		Truck truck = new Truck();
		Van van = new Van();
		
		Signal signal = new Signal();
		signal.redSignal(bike);
		signal.redSignal(car);
		signal.redSignal(truck);
		signal.redSignal(van);
	}
}

class Signal {
	public void redSignal(Vehicle v) {v.stop();}
	public void greenSiganl(Vehicle v) {v.start();}

}
class Vehicle{
	public void start() {}
	public void stop() {}
}

class Bike extends Vehicle {
	public void start() {System.out.println("bike start");}
	public void stop() {System.out.println("bike stop");}
}

class Car extends Vehicle {
	public void start() {System.out.println("car start");}
	public void stop() {System.out.println("car stop");}
}

class Truck extends Vehicle {
	public void start() {System.out.println("Truck start");}
	public void stop() {System.out.println("Truck stop");}
}

class Van extends Vehicle {
	public void start() {System.out.println("Van start");}
	public void stop() {System.out.println("Van stop");}
}
