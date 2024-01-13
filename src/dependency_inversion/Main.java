package dependency_inversion;
// Dependency Iversion - прослойка(интерфейс) между Верхним и Нижним слоем,
// прослойка между клиентами и низкоуровневые классы(например взаимодействующие с бд)
// 
// (ПРОБЛЕМА) Client -> DataAccess
// клиент знает о классе доступ к данным полностью
// (РЕШЕНИЕ) Client -> Interface <- DataAccess
public class Main {

	public static void main(String[] args) {

	}
}
// абстрактный интерфейс к какому-либо типу базы данных или механизму хранения.
interface DAO { // Data Access Object ^
	void execute();
}

class DataAccess implements DAO {
	@Override // (ПРАВИЛЬНО) но не обязательно в плане ошибок при компиляции
	public void execute() {
		System.out.println("execute");
	}
}

class Client {
	DAO dataAccess = new DataAccess();
	
	void doJob() {
		dataAccess.execute();
	}
}



