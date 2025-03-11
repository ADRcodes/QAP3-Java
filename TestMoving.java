public class TestMoving {
  public static void main(String[] args) {
    MovablePoint m1 = new MovablePoint(5, 6, 10, 15);
    System.out.println(m1);
    m1.move();
    System.out.println(m1);
    
    MovablePoint m2 = new MovablePoint(2, 1, 20, 15);
    System.out.println(m2);
    m2.move();
    System.out.println(m2);
  }
}
