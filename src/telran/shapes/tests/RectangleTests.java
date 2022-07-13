package telran.shapes.tests;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import telran.shapes.Rectangle;
import telran.shapes.Square;

public class RectangleTests {
@Test
void rectangleTest() {
	int width = 10;
	int height = 5;
	Rectangle rectangle = new Rectangle(width, height);
	assertEquals(width, rectangle.getWidth());
	assertEquals(height, rectangle.getHeight());
	rectangle.draw();
	rectangle.setHeight(7);
	rectangle.setWidth(9);
}
@Test
void squareTest() {
	int width = 5;
	
	Square square = new Square(5);
	assertTrue(square.getHeight() == square.getWidth());
	assertEquals(width, square.getWidth());
	square.draw();
	width = 10;
	square.setWidth(width);
	
}
}
