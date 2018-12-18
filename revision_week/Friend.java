public class Friend {
  private String name;
  private char gender;
  private int age;

  public Friend(String name, char gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    age = age;
  }
}
