import java.util.*;
import java.text.*;

public abstract class Pet {
  private int petId;
  private String name;
  private double weight;
  private Date dob;
  private double accumulateDose;
  private static int numDose;
  private Dose[] Medition;

  public Pet() {
    petId = numDose++;
    name = "unknown";
    weight = 0.0;
    dob = null;
    accumulateDose = 0.0;
    numDose = 0;
    Medition = new Dose[50];
  }

  public Pet(String name, double weight, Date dob, double accumulateDose) {
    petId = numDose++;
    this.name = name;
    this.weight = weight;
    this.dob = dob;
    this.accumulateDose = accumulateDose;
    Medition = new Dose[50];
  }

  // getter
  public int getPetId() {
    return this.petId;
  }

  public String getName() {
    return this.name;
  }

  public double getWeight() {
    return this.weight;
  }

  public Date getDob() {
    return this.dob;
  }

  public double getAccumulateDose() {
    return this.accumulateDose;
  }

  public int getNumDose() {
    return this.numDose;
  }

  //setter
  public void setPetId(int petId) {
    this.petId = petId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setDob (Date dob) {
    this.dob = dob;
  }

  public void setAccumulateDose(double accumulateDose) {
    this.accumulateDose = accumulateDose;
  }

  public void setNumDose(int numDose) {
    this.numDose = numDose;
  }

  //method
  public abstract double getDose();

  public int hashcode() {
    return petId + name.hashCode();
  }

  public int findAge() {
    Date currentDate = new Date();
    int year = currentDate.getYear() - this.dob.getYear();
    int month = currentDate.getMonth() - this.dob.getMonth();
    int day = currentDate.getDate() - this.dob.getDate();
    if (day < 1) {
      day = 1;
    } else {
      day = 0;
    }
    int age = (year * 12) + month + day; 
    return age;
  }

  public boolean addDose(String nameOfDrug, Date date, double doseInGrams){
    if (Medition.length == numDose)
      return false;
      Dose newDose = new Dose(nameOfDrug, date, doseInGrams);
      Medition[numDose++]  = newDose;

    return true;
  }

  public abstract String toString();
}
