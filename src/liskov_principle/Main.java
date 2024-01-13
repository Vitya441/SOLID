//package liskov_principle;
//// Принцип Барабара Лисков
//// При наследованни мы не должны изменять поведение нашего класса
//
//// Тупой пример, нужно именно 
//public class Main {
//	
//	public static void main(String[] args) {
//	
//		Square sq = new Square();
//		sq.setHeight(5);
//		sq.setWidth(4);
//		System.out.println(sq.getSquare());
//	
//	}
//	
//	
//}
//
//interface Shape {
//	int getSquare(); // площадь
//}
//
//class Rectangle implements Shape {
//	int width;
//	int height;
//	
//	public void setWidth(int width) {
//		this.width = width;
//	}	
//	public void setHeight(int height) {
//		this.height = height;
//	}
//	@Override
//	public int getSquare() {
//		return width * height;
//	}
//}
//
//class Square implements Shape {
//	int width;
//	int height;
//	
//	public void setWidth(int width) {
//		this.width = width;
//	}
//	public void setHeight(int height) {
//		this.height = width;
//	}
//	
//	@Override
//	public int getSquare() {
//		return width * width;
//	} 
//	
//}