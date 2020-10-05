package exemplos.classes_abstratas.shapes;

public class MainClassArray {

	public static void main(String[] args) {
		Shape shapeAr[] = new Shape[] {
		    new Square(3), 
		    new Rectangle(3, 10),
			new Circle(15),
			new Cube(4),
			new Square(5),
			new Circle(10),
			new Cube(5)				
		};
		
		for (Shape x : shapeAr) {
			System.out.println("Nome: " + x.nome 
					         + "Área: " + x.calculateArea());
			
			if (x instanceof ThreeDimensionsShape) {
				System.out.println("    Volume: " 
						+ ((ThreeDimensionsShape) x).calculateVolume());
			}
		}
	}

}
