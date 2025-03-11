public class TestPeople {
  public static void main(String[] args) {
    Person person1 = new Person
    ("John", 20, "Male");
    System.out.println(person1);
    
    Student student1 = new Student
    ("Blobby", 87, "NA", "123456", 3.5);
    System.out.println(student1);
    
    CollegeStudent collegeStudent1 = new CollegeStudent
    ("Gamble", 11, "Girl", "122456", 0.5, "Computer Science", 2028);
    System.out.println(collegeStudent1);
    
    Teacher teacher1 = new Teacher
    ("Funkle", 39, "Male", "Computer Science", 100000000);
    System.out.println(teacher1);

    
  }

}
