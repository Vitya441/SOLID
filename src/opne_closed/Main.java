package opne_closed;
// O - OPEN CLOSE principle
// Код должен быть универсальным
// Открыт для рассширения, закрыт для изменения
public class Main {

	public static void main(String[] args) {
		Toyota toyota = new Toyota();
		workInTaxi(toyota);
	}
	
	static void workInTaxi(Car car) {
		car.workInTaxi();
	}
}

interface Car {
	void workInTaxi();
}

class Toyota implements Car {
	void getPassangers() {
		System.out.println("get passangers...");
	}
	@Override
	public void workInTaxi() {
		getPassangers();
	}
}

class Celica extends Toyota {
	@Override
	public void workInTaxi() {
		getPassanger();
	}
	void getPassanger() {
		System.out.println("get 1 passanger");
	}
}
