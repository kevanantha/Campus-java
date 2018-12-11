// VetClinic.java
import java.util.*;
import java.text.*;

public class VetClinic {
  private String name;

  private Pet[] Client;
  private static int numberPet;
  private final int MAX = 50;

  public VetClinic() {
    Client = new Pet[MAX];
    numberPet = 0;
  }

  // Setter
  public void setName(String name) {
    this.name = name;
  }

  public void setNumPet(int num) {
    this.numberPet = num;
  }

  // Getter
  public String getName() {
    return this.name;
  }

  public int getNumPet() {
    return this.numberPet;
  }

  public Cat addCat(String name, double weight, Date dob, double accumulateDose, boolean allergic) {
    if (numberPet == Client.length)
      return null;
      String newName = "(Cat) " + name;
      Cat newCat = new Cat(newName, weight, dob, accumulateDose, allergic);
      Client[numberPet++] = newCat;
      return newCat;
  }
  
  public Dog addDog(String name,double weight, Date dob, double accumulateDose, String breed) {
    if (numberPet == Client.length)
      return null;
      String newName = "(Dog) " + name;
      Dog newDog = new Dog(newName, weight, dob, accumulateDose, breed);
      Client[numberPet++] = newDog;
      return newDog;
  }

  public String viewAllPetShort() {
    String foundPet = "";
    for (int i = 0; i < this.numberPet; i++){
      foundPet = foundPet + "   " + Client[i].getPetId() + "           " +  Client[i].getName() + "\n";
    }
    return foundPet;
  }

  public String viewAllPet() {
    Pet[] objPet = Client;
    String foundPet = "\nPet ID\tName\t\tWeight\tDate of birth\tDose\tAllergic\tBreed\n";
    for (int i = 1; i < numberPet; i++) {
          for (int x = 0; x < numberPet - i; x++) {
              if (objPet[x].getPetId() > objPet[x+1].getPetId()) {
                //swap movies[b] with movies[b+1]
                Pet temp = objPet[x];
                objPet[x] = objPet[x+1];
                objPet[x+1] = temp;
              }
          }
      }
    for (int i = 0; i < this.numberPet; i++){
      foundPet = foundPet + Client[i].toString() + "\n";
    }
    return foundPet;
  }

  public String sortByDose() {
    Pet[] objPet = Client;
    String foundPet = "\nPet ID\tName\t\tWeight\tDate of birth\tDose\tAllergic\tBreed\n";
    for (int i = 1; i < numberPet; i++) {
          for (int x = 0; x < numberPet - i; x++) {
              if (objPet[x].getAccumulateDose() > objPet[x + 1].getAccumulateDose()) {
                //swap movies[b] with movies[b+1]
                Pet temp = objPet[x];
                objPet[x] = objPet[x+1];
                objPet[x+1] = temp;
              }
          }
      }
      for (int z = 0; z < this.numberPet; z++) {
      foundPet = foundPet + objPet[z].toString() + "\n";
    }
    return foundPet;
  }

  public Pet deletePet(int numberPet) {
    for (int j = numberPet; j < this.numberPet - 1; j++) {
      Client[j] = Client[j + 1];
    }
    setNumPet(this.numberPet - 1);
    return null;
  }

  public Pet findPet(int numberPet) {
    for (int i = 0; i < this.numberPet; i++)
      // if the project number matches, return the project at position i of the array
      if (Client[i].getPetId() == numberPet)
        return Client[i];
    // finished looping, didn't return anything
    return null;
  }

  public boolean administeredDrug(String name, Pet obj) {
    Date date = new Date();
    double doseInGrams;
    for (int i = 0; i < this.numberPet; i++) {
      if (Client[i] == obj) {
        doseInGrams = Client[i].getDose();
        if (Client[i].addDose(name, date, doseInGrams) == true) {
          Client[i].setAccumulateDose(doseInGrams);
          return true;
        } else {
          return false;
        }
      }
    }
    return false;
  }

  public void updateCat(String name, double weight, Date dob, double accumulateDose, boolean allergic, Pet obj) {
    for (int i = 0; i < this.numberPet; i++) {
      if (Client[i] == obj) {
        String newName = "(Cat) " +name;
        Cat newCat = new Cat(newName, weight, dob, accumulateDose, allergic);
        Client[i] = newCat;
        Client[i].setPetId(i);
      }
    }
  }

  public void updateDog(String name, double weight, Date dob, double accumulateDose, String breed, Pet obj) {
    for (int i = 0; i < this.numberPet; i++) {
      if (Client[i] == obj) {
        String newName = "(Dog) " + name;
        Dog newDog = new Dog(newName, weight, dob, accumulateDose, breed);
        Client[i] = newDog;
        Client[i].setPetId(i);
      }
    }
  }

  public String sortType() {
    Pet[] objPet = Client;
    Pet temp;
    String foundPet = "\nPet ID\tName\t\tWeight\tDate of birth\tDose\tallergic\tbreed\n";
    for (int i = 1; i < numberPet; i++) {
      for (int x = 0; x < numberPet - i; x++) {
        if (objPet[x].getName().compareTo(objPet[x + 1].getName()) > 0) {
          temp = objPet[x];
          objPet[x] = objPet[x + 1];
          objPet[x + 1] = temp;
          if (objPet[x].findAge() > objPet[x + 1].findAge()) {
            temp = objPet[x];
            objPet[x] = objPet[x + 1];
            objPet[x + 1] = temp;
          }
        }
      }
    }
    for (int z = 0; z < this.numberPet; z++) {
      foundPet = foundPet + objPet[z].toString() + "\n";
    }
    return foundPet;
  }
}
