public class TestShapes {
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

  }
}
