package ch06.sec08.exam04;

public class Calculator {
	//메소드 오버로딩
	
	
	//정사각형의 넓이 
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width1, double height) {
		return width1 * height;
	}
}
