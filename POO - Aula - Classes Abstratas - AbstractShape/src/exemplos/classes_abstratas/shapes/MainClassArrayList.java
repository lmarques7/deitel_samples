package exemplos.classes_abstratas.shapes;

import java.util.ArrayList;

public class MainClassArrayList {

    public static void main(String[] args) {
        Shape p = new Rectangle(3, 2);
        Shape p2 = new Circle(3);
        Shape p3 = new Square(5);
        
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(p);
        shapes.add(p2);
        shapes.add(p3);
        
        shapes.add(new Cube(5));
        
        for (Shape s : shapes) {
            System.out.println(s.calculateArea());
            
            if (s instanceof ThreeDimensionsShape) {
                System.out.println(((ThreeDimensionsShape) s).calculateVolume());
            }
        }

    }

}
