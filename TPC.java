import java.util.*;

public class TPC {
  private int numberOfProjects;
  private Project[] TPCProjects;
  private final int MAX = 50; // max no.project;

  //constructor
  public TPC() {
    TPCProjects = new Project[MAX];
    numberOfProjects = 0;
  }

  public Project addProject(String ProjectName) {
    if (numberOfProjects == TPCProjects.length) {
      return null;
    } else {
      Project newProj = new Project(projectName);
      TPCProjects[numberOfProjects++] = newProj;
      return newProj;
    }
  }

  // override method
  public Project findProject(int projectNum) {
    return TPCProjects[projectNum - 1];
  }

  public String findProject(String searchString) {
    for (int i = 0; i < TPCProjects.length; i++) {
      if (TPCProjects[i].getProjectName().equals(searchString)) {
        return TPCProjects[i].toString();
      }
    }
    return "Project with keyword " + searchString + " not found";
  }

  public String showAllProjects() {
    String retValue = "";
    for (int i = 0; i < TPCProjects.length; i++) {
      retValue = retValue + (i + ". " + TPCProjects[i].toString());
    }
  }

}
