public class Student extends Person {
  protected String id;
  protected double gpa;

  public Student(String name, int age, String gender, String id, double gpa) {
    super(name, age, gender);
    this.id = id;
    this.gpa = gpa;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public double getGpa() {
    return gpa;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  @Override
  public String toString() {
    return super.toString() + " with ID: " + id + " and GPA: " + gpa;
  }

}


