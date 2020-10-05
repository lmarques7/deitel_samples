package exemplos.classes_abstratas.shapes;

public abstract class ThreeDimensionsShape extends Shape {

	public ThreeDimensionsShape(String nome) {
		super(nome);
	}
	
	public abstract double calculateVolume();

}
