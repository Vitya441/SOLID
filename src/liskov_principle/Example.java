package liskov_principle;
// Класс наследник должен уметь делать то, что и родительский класс, 
// Родителя можно заменить потомком и программа должна работать исправно.
public class Example {
	public static void main(String[] args) {
		
		Shape someShape = new Shape();
		someShape.setWidth(5);
		someShape.setHeight(10);
		System.out.println("area: " + someShape.calculateArea());
		
		Shape square = new Square();
		square.setWidth(5);
		square.setHeight(5);
		System.out.println("square area: " + square.calculateArea());
		System.out.println("Программа работает корректно как с супер классом, так и с производными");
	}
}

class Shape {
	protected int width;
	protected int height;
	
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int calculateArea() {
		return width * height;
	}
}

class Rectangle extends Shape {
	// Площадь считается по дэфолтной реализации
}

class Square extends Shape { // в этом классе длина и ширина это одна сущность , но всё же переопределяем 2 метода
	@Override
	public void setWidth(int width) {
		this.height = width;
		this.width = width;
	}
	@Override
	public void setHeight(int height) {
		this.height = height;
		this.width = height;
	}
}







