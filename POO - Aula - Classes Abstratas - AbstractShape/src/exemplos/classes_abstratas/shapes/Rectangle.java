package exemplos.classes_abstratas.shapes;

public class Rectangle extends TwoDimensionsShape {

	public Rectangle(double width, double height) {
		super("Ret�ngulo");
		sideDimensions = new double[] {width, height};
	}
	
	@Override
	public double calculateArea() {
		return sideDimensions[0]*sideDimensions[1];
	}

}
