package exemplos.classes_abstratas.shapes;

public class Cube extends ThreeDimensionsShape {

	private double side;
	
	public Cube (double side) {
		super("Cubo");
		this.side = side;
	}
	
	@Override
	public double calculateVolume() {
		return Math.pow(side, 3);
	}

	@Override
	public double calculateArea() {
		return side*side*6;
	}

}
