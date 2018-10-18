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
      Project newProj = new Project(projectName);
      TPCProjects[numberOfProjects++] = newProj;
      return newProj;
    }
  }
}
