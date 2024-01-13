package single_responsobility;
// S - SINGLE RESPONSOBILITY 
// У класса доджна быть одна причина чтобы меняться!

public class Main {

	public static void main(String[] args) {


	}
	

}

interface Employee { // Сотрудник
	int getSalary();
}
class Cook implements Employee { // Повар
	@Override
		public int getSalary() {
			return 10;
		}
	void cook() {}
}
class Janitor implements Employee { // Дворник
	@Override
	public int getSalary() {
		return 10;
	}
	void cleanFloor() {}
}

class EmployeeFacade { // Универсальный сотрудник
	Cook cook = new Cook();
	Janitor janitor = new Janitor();
	
	void cook() {
		cook.cook();
	}
	void cleanFloor() {
		janitor.cleanFloor();
	}
	
}