abstract class Shape {
  String name;
  
  abstract double getArea();

  abstract double getPerimeter();

  public Shape(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
