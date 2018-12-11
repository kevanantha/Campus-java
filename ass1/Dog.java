import java.util.*;
import java.text.*;

public class Dog extends Pet {
  private String breed;

  public Dog() {
    this("unknown", 0.0, null, 0.0, "unknown");
  }

  public Dog(String name, double weight, Date dob, double accumulateDose, String breed) {
    super(name, weight, dob, accumulateDose);
    this.breed = breed;
  }

  // setter
  public void setBreed(String breed) {
    this.breed = breed;
  }

  // getter
  public String getBreed() {
    return this.breed;
  }

  //method
  @Override
  public double getDose() {
    double dose;
    if (super.findAge() < 3) {
      dose = 0;
    }

    if (super.findAge() > 12 && super.getWeight() > 2) {
      dose = 6 + 0.75 * super.getWeight();
    } else {
      dose = 12 + 0.65 * super.getWeight();
    }

    if (super.getAccumulateDose() > 750) {
      dose = 0;
    }

    return dose;
  }

  public String toString() {
    String date = new SimpleDateFormat("dd/MM/yyyy").format(super.getDob());
    String detail = super.getPetId() + "\t" + super.getName() + "\t" + String.format("%.2f", super.getWeight()) + "\t" + date + "\t" + String.format("%.2f", super.getAccumulateDose()) + "\t -\t\t" + this.breed;
    return detail;
  }
}
