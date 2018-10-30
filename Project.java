public class Project {
  private String projectName;
  private int projectNum;
  // used to generate project numbers
  private static int nextProjectNo = 0;

  public Project(String inProjectName) {
    setProjectName(inProjectName);
    setProjectNum(nextProjectNo++);
  }

  // setter
  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public void setProjectNum(int nextProjectNo) {
    this.projectNum = nextProjectNo;
  }

  // getter
  public String getProjectName() {
    return this.projectName;
  }

  public int getProjectNum() {
    return this.projectNum;
  }

  // toString
  public String toString() {
    return "Project: " + this.projectName;
  }

}

