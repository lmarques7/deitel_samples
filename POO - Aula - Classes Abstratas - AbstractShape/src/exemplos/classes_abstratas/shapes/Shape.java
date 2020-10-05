package exemplos.classes_abstratas.shapes;

public abstract class Shape {

	protected String nome;
	
	public Shape(String nome) {
		this.nome = nome;
	}
	
	public abstract double calculateArea();
	
}
