public class TestShapes {
  // add a static method that receives an array of Type Scalable, and a scale factor

  public static void scaleShapes(Scalable[] shapes, double factor) {
    for (Scalable shape : shapes) {
      shape.scale(factor);
    }
  }
  public static void main(String[] args) {
    // Store shapes in an array of type Shape
    Shape[] shapes = new Shape[4];
    
    Circle c1 = new Circle("Circle1", 5);
    shapes[0] = c1;
    
    Ellipse e1 = new Ellipse("Ellipse1", 5, 3);
    shapes[1] = e1;

    Triangle t1 = new Triangle("Triangle1", 3, 4, 5);
    shapes[2] = t1;

    EquilateralTriangle et1 = new EquilateralTriangle("EquilateralTriangle1", 5);
    shapes[3] = et1;

    // Print the shapes

    for (Shape shape : shapes) {
      System.err.println("");
      System.out.println(shape);
      System.out.println("Area: " + shape.getArea());
      System.out.println("Perimeter: " + shape.getPerimeter());
    }

    // Scale the shapes by a factor of 2
    scaleShapes(shapes, 2);
    System.err.println("\nAfter scaling by a factor of 2:\n");

    // Print the shapes again

    for (Shape shape : shapes) {
      System.err.println("");
      System.out.println(shape);
      System.out.println("Area: " + shape.getArea());
      System.out.println("Perimeter: " + shape.getPerimeter());
    }

  }
}
