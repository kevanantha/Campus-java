public class IncrementDecrement {
  public static void main(String[] args) {
    System.out.println("a++");
    int a = 10;
    System.out.println("a = " + a);
    int b = a++;
    System.out.println("b = " + b);
    System.out.println("a = " + a);

    System.out.println("++a");
    int c = 10;
    System.out.println("c = " + c);
    int d = ++c;
    System.out.println("c = " + c);
    System.out.println("d = " + d);
  }
}
