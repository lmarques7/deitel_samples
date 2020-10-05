package exemplos.classes_abstratas.shapes;

public class Square extends TwoDimensionsShape {

	public Square(double side) {
		super("Quadrado");
		sideDimensions = new double[] {side, side};
	}
	
	@Override
	public double calculateArea() {
		return sideDimensions[0]*sideDimensions[1];
	}

}
