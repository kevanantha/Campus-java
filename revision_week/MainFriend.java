public class MainFriend {
  public static void main(String[] args) {
    Friend f = new Friend("Joseph", 'M', 21);
    System.out.println(f);

    f.setName("Josep");
    f.setGender('M');
    f.setAge(21);
    System.out.println(f.getName());
  }
}
