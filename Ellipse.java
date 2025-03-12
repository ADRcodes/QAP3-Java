public class Ellipse extends Shape {
  private double majorAxis;
  private double minorAxis;
  
  public Ellipse(String name, double majorAxis, double minorAxis) {
    super(name);
    this.majorAxis = majorAxis;
    this.minorAxis = minorAxis;
  }
  
  public double getMajorAxis() {
    return majorAxis;
  }
  
  public void setMajorAxis(double majorAxis) {
    this.majorAxis = majorAxis;
  }
  
  public double getMinorAxis() {
    return minorAxis;
  }
  
  public void setMinorAxis(double minorAxis) {
    this.minorAxis = minorAxis;
  }
  
  @Override
  double getArea() {
    return Math.PI * majorAxis * minorAxis;
  }
  
  @Override
  double getPerimeter() {
    return 2 * Math.PI * Math.sqrt((majorAxis * majorAxis + minorAxis * minorAxis) / 2);
  }
  
  @Override
  public String toString() {
    return "Ellipse named " + super.toString() + " with major axis = " + majorAxis + " and minor axis = " + minorAxis;
  }

  @Override
  public void scale(double factor) {
    this.majorAxis *= factor;
    this.minorAxis *= factor;
  }
}
