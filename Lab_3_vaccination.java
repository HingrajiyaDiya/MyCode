package MyPackage;

import java.util.Scanner;

abstract class Vaccine {
    int age;
    String nationality;
    boolean firstDoseTaken = false;

    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    public void firstDose() {
        if (nationality.equals("Indian") && age >= 18) {
            firstDoseTaken = true;
            System.out.println("Your First dose Successfully Done. Now you have to pay 250 Rs");
        } else {
            System.out.println("Not eligible for first dose.");
        }
    }

    public void secondDose() {
        if (firstDoseTaken) {
            System.out.println("Your Second dose Successfully Done");
        } else {
            System.out.println("Complete first dose first.");
        }
    }

    abstract public void boosterDose();
}

class vaccinationSuccessful extends Vaccine {
    vaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose() {
        System.out.println("Your Booster dose Successfully Done");
    }
}

public class Lab_3_vaccination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nationality: ");
        String nationality = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        
        vaccinationSuccessful vs = new vaccinationSuccessful(age, nationality);
        vs.firstDose();
        vs.secondDose();
        vs.boosterDose();
        
        sc.close();  
    }
}