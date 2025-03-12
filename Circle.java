public class Circle extends Shape {
  private double radius;
  
  public Circle(String name, double radius) {
    super(name);
    this.radius = radius;
  }
  
  public double getRadius() {
    return radius;
  }
  
  public void setRadius(double radius) {
    this.radius = radius;
  }
  
  @Override
  double getArea() {
    return Math.PI * radius * radius;
  }
  
  @Override
  double getPerimeter() {
    return 2 * Math.PI * radius;
  }
  
  @Override
  public String toString() {
    return "Circle named " + super.toString() + " with radius = " + radius;
  }
}
