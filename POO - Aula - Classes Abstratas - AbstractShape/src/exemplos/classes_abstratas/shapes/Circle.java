package exemplos.classes_abstratas.shapes;

public class Circle extends TwoDimensionsShape {

	public Circle(double radium) {
		super("C�rculo");
		sideDimensions = new double[] {radium};
	}
	
	@Override
	public double calculateArea() {
		return Math.PI * sideDimensions[0]*sideDimensions[0];
	}
	
}
