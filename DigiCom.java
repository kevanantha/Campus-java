import java.util.Scanner;

public class DigiCom {
  public static void main(String[] args) {
    double hourlyRate = 0;
    int hoursWorked = 0;
    double weeklyWage = 0;
    double totalWage = 0;
    Scanner sc = new Scanner(System.in);
    
    final double OVERTIMERATE = 1.5;
    final int NORMALHOURS = 40;
    final int NUMOFWORKERS = 5;

    for (int i = 1; i <= NUMOFWORKERS; i ++) {
      System.out.print("Hourly rate worker " + i + ": ");
      hourlyRate = sc.nextDouble();

      System.out.print("Hours worked worker " + i +": ");
      hoursWorked = sc.nextInt();

      if (hoursWorked > NORMALHOURS) {
        weeklyWage = (NORMALHOURS * hourlyRate) + ((hoursWorked - NORMALHOURS) * hourlyRate * OVERTIMERATE);
      } else {
        weeklyWage = hourlyRate * hoursWorked;
      }
      totalWage += weeklyWage;
      System.out.println("Your wage :" + weeklyWage);
    }
    System.out.println("Total Weekly Wage = " + totalWage);
  }
}



