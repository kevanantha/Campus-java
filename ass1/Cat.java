import java.util.*;
import java.text.*;

public class Cat extends Pet {
  private boolean allergic;

  public Cat() {
    this("unknown", 0.0, null, 0.0, true);
  }

  public Cat(String name, double weight, Date dob, double accumulateDose, boolean allergic) {
    super(name, weight, dob, accumulateDose);
    this.allergic = allergic;
  }

  // setter
  public void setAllergic(boolean allergic) {
    this.allergic = allergic;
  }

  // getter
  public boolean getAllergic() {
    return this.allergic;
  }

  //method
  @Override
  public double getDose() {
    double dose;
    if (allergic != false) {
      dose = 0;
    } else if (super.findAge() > 3 && super.getWeight() > 0.5) {
      dose = 7 + 0.61 * super.getWeight();
    } else {
      dose = 0.81 * super.getWeight();
    }

    if (super.getAccumulateDose() > 500) {
      dose = 0;
    }
    return dose;
  }

  public String toString() {
    String date = new SimpleDateFormat("dd/MM/yyyy").format(super.getDob());
    String detail = super.getPetId() + "\t" + super.getName() + "\t" + String.format("%.2f", super.getWeight()) + "\t" + date + "\t" + String.format("%.2f", super.getAccumulateDose()) + "\t" + this.allergic+ "\t\t -";
    return detail;
  }
}
