public class Console {
  public static void main(String[] args) {
    Employee e = new FullTimeEmployee();
    e.introduce();

    e = new Employee();
    e.introduce();
  }
}
