import java.util.*;

public class TPCConsole {
  private static TPC tpc;
  private static Scanner sc;

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    tpc = new TPC();
    for ( int i = 0; i < 3; i++) {
      addNewProject();
    }
  }

  public static void addNewProject() {
    System.out.println("Enter name of project: ");
    String projName = tpc.addProject(projName);
    if ((newProj) == null) {
      System.out.println("TPC capacity full");
    } else {
      System.out.println("New project created:");
      System.out.println("newProj.getProjectNum()");
      System.out.println("newProj.getProjectName()");
    }
  }
}
