import java.io.*;

public class EmployeeTest {

  public static void main(String []args) {
    // Create two objs using contructor.
    Employee empOne = new Employee("Josep");
    Employee empTwo = new Employee("Tomi");

    // Invoking methods for each objs created.
    empOne.empAge(21);
    empOne.empDesignation("Senior Software Engineer");
    empOne.empSalary(1000);
    empOne.printEmployee();

    empTwo.empAge(19);
    empTwo.empDesignation("Software Engineer");
    empTwo.empSalary(5000);
    empTwo.printEmployee();
  }

}
