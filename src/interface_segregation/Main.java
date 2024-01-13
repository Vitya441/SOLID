package interface_segregation;
// Интерфейсы должны предостовлять методы, которые мы используем,
// не доджно быть неиспользуемых или использованных без реализации, т.е
// можно в реализующем классе метод который не хотим использовать просто реализовать пустым, ошибки компиляции не будет,
// но это НЕ ПРАВИЛЬНО, мы доджны использовать ТОЛЬКО ТО, что нам надо, поэтому имлементируем подходящий интерфейс!
public class Main {

	public static void main(String[] args) {
		Worker waiter = new Waiter(); // рабочий который только работает
		waiter.work(); // работает 3 часа(студент)
		
		DefaultWorker cook = new Cook(); // рабочий который и работает, и ест
		cook.work();
		cook.eat(); // обед
		cook.work();
	}

}

interface Worker {
	void work();
}
interface Eater {
	void eat();
}

interface DefaultWorker extends Worker, Eater  { // обычный работник и работает и ест
	
}

class Cook implements DefaultWorker {
	@Override
	public void work() {
		System.out.println("cooking");
	}
	@Override
	public void eat() {
		System.out.println("eat");
	}
}
// официант студент, работает 3 часа
// Он имплементирует работника, который не ест.
// (мы НЕ делаем пустую реализацию метода, дабы избежать ошибки при компиляции, А соблюдаем принцип)
class Waiter implements Worker {
	@Override
	public void work() {
		System.out.println("deliver food");
	}
	
	
}


