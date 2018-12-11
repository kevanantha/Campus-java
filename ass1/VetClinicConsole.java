/*  Name : I Putu Kevin Anantha Vijaya
  Student ID : E1600724
  VetClinicConsole class act as the interface
*/

import java.util.*;
import java.text.*;

public class VetClinicConsole {

  // Using static so can be use in all methods
  private static VetClinic clinic;
  private static Scanner sc;

  public static void main(String []args) {
    sc = new Scanner(System.in);
    System.out.print("Enter name of the Clinic: ");
    String clinicName = sc.nextLine();
    clinic = new VetClinic();
    clinic.setName(clinicName);

    int choice;
    do {
      System.out.println("\nWelcome to The " + clinic.getName()+ " Clinic");
      System.out.println("1. Add New");
      System.out.println("2. Delete");
      System.out.println("3. List");
      System.out.println("4. Administered Drugs");
      System.out.println("5. Update");
      System.out.println("6. Quit");
      System.out.print("Input your option: ");
      choice = sc.nextInt();
      sc.nextLine();

      switch(choice) {
        case 1: addNewClient(); break;
        case 2: deleteClient(); break;
        case 3: listClient(); break;
        case 4: administeredDrugClient(); break;
        case 5: updateClient(); break; 
        case 6: System.out.println("Goodbye"); break;
        default: System.out.println("Invalid choice!");
      }
    } while (choice != 6); 
  }

  //addNewClient method to store VetClinic object
  public static void addNewClient() {
    // Try catch to accept Exception while date was input
    try {
      System.out.print("Enter your type of pet: \n1. Cat \n2. Dog \nYour choice: ");
      int type = sc.nextInt();
      sc.nextLine();
      Pet newPet = null;
      System.out.print("Enter your pet's name: ");
      String name = sc.nextLine();
      System.out.print("Enter your pet's weight(kg): ");
      double weight = sc.nextDouble();

      // Using parse to convert String to Date format
      System.out.print("Enter your pet's date of birth(example, 12/11/2016): ");
      String inputDate = sc.next();
      Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(inputDate);

      double accumulateDose = 0.0;
      if (type == 1) { 
        System.out.print("Does your pet have allergies (1. Yes , 2. No): ");
        int inputAllergies = sc.nextInt();
        boolean allergic = false;
        if (inputAllergies == 1) {
          allergic = true;
        } else {
          allergic = false;
        }
        newPet = clinic.addCat(name, weight, dob, accumulateDose, allergic);
      }
      else if (type == 2) {
        System.out.print("Enter your pet's breed: ");
        String breed = sc.next();
        newPet = clinic.addDog(name, weight, dob, accumulateDose, breed);
      }
      if (newPet == null) {
        System.out.println("Pet capacity full. new Pet not added\n");
      } else {
        System.out.println("New Pet added");
        System.out.println("\nPet ID\tName\t\tWeight\tDate of birth\tDose\tAllergic\tBreed\n" + newPet.toString());
      }
    }
    catch(ParseException e) {
      System.out.println("\n++++++++++++++++++++++++++++");
      System.out.print("Something wrong, try again.");
      System.out.println("\n++++++++++++++++++++++++++++");
    }
  }

  // deleteClient method show "toString" and have method to replace object that have been selected 
  public static void deleteClient() {
    System.out.println("List of Pet: \n   Pet ID        Name");
    System.out.println(clinic.viewAllPetShort());

    System.out.print("Input Pet ID: ");
    int numberPet = sc.nextInt();

    System.out.println(clinic.findPet(numberPet).toString());
    System.out.print("Are you sure you want to delete this information? (1. Yes , 2. No) ");
    int choice = sc.nextInt();
    if (choice == 1) {
      clinic.deletePet(numberPet);
      System.out.println("Deleted");
    }
  }

  //listClient method have method that sort objec by orinal oder, administered dose, type and age using input Interger
  public static void listClient() {
    System.out.println("Short by:\n1. Original order\n2. Accumulated dose administered\n3. Pet type and age");
    System.out.print("Input type of shorting: ");
    int choice = sc.nextInt();
    if (choice == 1) {
      System.out.print(clinic.viewAllPet());
    } else if (choice == 2) {
      System.out.print(clinic.sortByDose());
      String prev = clinic.viewAllPet();
    } else if (choice == 3) {
      System.out.print(clinic.sortType());
      String prev = clinic.viewAllPet();
    }
  }

  //administeredDrugClient method use to genered dose using getDose method
  public static void administeredDrugClient(){
    System.out.println("list of Pet: \n   Pet ID        Name");
    System.out.println(clinic.viewAllPetShort());

    System.out.print("input Pet ID: ");
    int numberPet = sc.nextInt();
    System.out.println(clinic.findPet(numberPet).toString());

    System.out.print("Enter name of medition: ");
    String name = sc.next();

    if (clinic.administeredDrug(name, clinic.findPet(numberPet)) == true) {
      System.out.print("The dose of medition that need it is: ");
      System.out.print(clinic.findPet(numberPet).getDose());
    } else {
      System.out.print("Input medition failed");
    }
  }

  // updateClient method use to update object by using udpateCat method
  public static void updateClient() {
    //try catch to accept Exception while date was input
    try {
      System.out.println("List of Pet: \n   Pet ID        Name");
      System.out.println(clinic.viewAllPetShort());

      System.out.print("Input Pet ID: ");
      int numberPet = sc.nextInt();
      System.out.println(clinic.findPet(numberPet).toString());

      System.out.println("Enter new Pet information: ");
      System.out.print("Enter your pet's name: ");
      String name = sc.next();
      System.out.print("Enter your pet's weight(kg): ");
      double weight = sc.nextDouble();


      System.out.print("Enter your pet's date of birth(example, 12/11/2016): ");
      String inputDate = sc.next();
      Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(inputDate);

      double accumulateDose = clinic.findPet(numberPet).getAccumulateDose();

      //using method findPet() to find the type of the Pet
      String comparation = clinic.findPet(numberPet).getName().substring(1,4);

      // using equals to get type of pet
      if (comparation.equalsIgnoreCase("Cat")) { 
        System.out.print("Does your pet have allergies (1. Yes , 2. No): ");
        int inputAllergies = sc.nextInt();
        boolean allergic = false;
        if (inputAllergies == 1) {
          allergic = true;
        } else {
          allergic = false;
        }
        clinic.updateCat(name, weight, dob,accumulateDose, allergic, clinic.findPet(numberPet));
        //System.out.print("Test input success cat");
      } else if (comparation.equals("Dog")) {
        System.out.print("Enter your pet's breed: ");
        String breed = sc.next();
        clinic.updateDog(name, weight, dob,accumulateDose, breed, clinic.findPet(numberPet));
      } else {
        System.out.println("Try again.");
      }
    }
    catch(ParseException e){
      System.out.println("\n++++++++++++++++++++++++++++++");
      System.out.print("Somethin wrong, try again.");
      System.out.println("\n++++++++++++++++++++++++++++++");
    }
  }
}
