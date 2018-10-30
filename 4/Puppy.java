public class Puppy {

  int puppyAge;

  public Puppy(String name) {
    // This constructor has one paramater, name.
    System.out.println("Passed name is: " + name);
  }

  public void setAge(int age) {
    puppyAge = age;
  }

  public int getAge() {
    System.out.println("Puppy's age is: " + puppyAge);
    return puppyAge;
  }

  public static void main(String []args) {
    Puppy myPuppy = new Puppy("Josep");
    myPuppy.setAge(2);
    myPuppy.getAge();
    System.out.println("Variable value: " + myPuppy.puppyAge);
  }

}
