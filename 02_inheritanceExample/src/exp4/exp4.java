package exp4;

public class exp4 {
	public static void main(String[] args) {
		Bike bike = new Bike();
		Car car = new Car();
		Truck truck = new Truck();
		
		Signal signal = new Signal();
		signal.redSignal(bike);
		signal.redSignal(car);
	}
}

class Signal {
	public void redSignal(Bike bike) {bike.stop();}
	public void greenSiganl(Bike bike) {bike.start();}
	public void redSignal(Car bike) {bike.stop();}
	public void greenSiganl(Car bike) {bike.start();}
}

class Bike {
	public void start() {System.out.println("bike start");}
	public void stop() {System.out.println("bike stop");}
}

class Car {
	public void start() {System.out.println("car start");}
	public void stop() {System.out.println("car stop");}
}

class Truck {
	public void start() {System.out.println("Truck start");}
	public void stop() {System.out.println("Truck stop");}
}
