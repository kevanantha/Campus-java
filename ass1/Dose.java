import java.util.*;

public class Dose {
  private String nameOfDrug;
  private Date date;
  private double doseInGrams;

  public Dose() {

  }

  public Dose(String nameOfDrug, Date date, double doseInGrams) {
    this.nameOfDrug = nameOfDrug;
    this.date = date;
    this.doseInGrams = doseInGrams;
  }

  //setter
  public void setNameOfDrug(String nameOfDrug) {
    this.nameOfDrug = nameOfDrug;
  }

  public void setDate (Date date) {
    this.date = date;
  }

  public void setDoseInGrams (double doseInGrams) {
    this.doseInGrams = doseInGrams;
  }

  //getter
  public String getNameOfDrug() {
    return this.nameOfDrug;
  }

  public Date getDate() {
    return this.date;
  }

  public double getDoseInGrams() {
    return this.doseInGrams;
  }
}
