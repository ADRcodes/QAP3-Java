public class Triangle extends Shape {
  private double side1;
  private double side2;
  private double side3;
  
  public Triangle(String name, double side1, double side2, double side3) {
    super(name);
    
    if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
      throw new IllegalArgumentException("Invalid triangle sides");
    }

    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }
  
  public double getSide1() {
    return side1;
  }
  
  public void setSide1(double side1) {
    this.side1 = side1;
  }
  
  public double getSide2() {
    return side2;
  }
  
  public void setSide2(double side2) {
    this.side2 = side2;
  }
  
  public double getSide3() {
    return side3;
  }
  
  public void setSide3(double side3) {
    this.side3 = side3;
  }
  
  @Override
  double getArea() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }
  
  @Override
  double getPerimeter() {
    return side1 + side2 + side3;
  }
  
  @Override
  public String toString() {
    return "Triangle named " + super.toString() + " with sides = " + side1 + ", " + side2 + ", " + side3;
  }

  @Override
  public void scale(double factor) {
    side1 *= factor;
    side2 *= factor;
    side3 *= factor;
  }
  
}
