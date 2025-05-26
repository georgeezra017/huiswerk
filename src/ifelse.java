import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        opdracht1();
        System.out.println("Nu komt opdracht 2...");
        opdracht2();
        System.out.println("Nu komt opdracht 3...");
        opdracht3();
        System.out.println("Nu komt opdracht 4...");
        opdracht4();
        System.out.println("Nu komt opdracht 5...");
        opdracht5();
        System.out.println("Nu komt opdracht 6...");
    }

    private static void opdracht1() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Voer Getal In ");

        String number = myObj.nextLine();  // Read user input
        try {
            if ((Integer.parseInt(number) % 2) == 0) { //number
                System.out.println("Getal is: even"); //even
            } else {
                System.out.println("Getal is: oneven"); //odd
            }
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormat Exception: invalid input string");
        }
    }

    private static void opdracht2() {
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Voer jouw cijfer in: ");
        String cijfer = myObj2.nextLine();
        try {
            // if (Integer.parseInt(cijfer) >= 1 && Integer.parseInt(cijfer) <= 10) {
            //     System.out.println("Jouw cijfer is tussen 1 en 10");
            // }
            if (Integer.parseInt(cijfer) == 1) {
                System.out.println("Jouw cijfer is 1, dat komt overeen met een F-");
            } else if (Integer.parseInt(cijfer) == 2) {
                System.out.println("Jouw cijfer is 2, dat komt overeen met een F");
            } else if (Integer.parseInt(cijfer) == 3) {
                System.out.println("Jouw cijfer is 3, dat komt overeen met een D-");
            } else if (Integer.parseInt(cijfer) == 4) {
                System.out.println("Jouw cijfer is 4, dat komt overeen met een D");
            } else if (Integer.parseInt(cijfer) == 5) {
                System.out.println("Jouw cijfer is 5, dat komt overeen met een C-");
            } else if (Integer.parseInt(cijfer) == 6) {
                System.out.println("Jouw cijfer is 6, dat komt overeen met een C");
            } else if (Integer.parseInt(cijfer) == 7) {
                System.out.println("Jouw cijfer is 7, dat komt overeen met een B-");
            } else if (Integer.parseInt(cijfer) == 8) {
                System.out.println("Jouw cijfer is 8, dat komt overeen met een B");
            } else if (Integer.parseInt(cijfer) == 9) {
                System.out.println("Jouw cijfer is 9, dat komt overeen met een A-");
            } else if (Integer.parseInt(cijfer) == 10) {
                System.out.println("Jouw cijfer is 10, dat komt overeen met een A");
            } else {
                System.out.println("Jouw cijfer staat er niet tussen");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormat Exception: invalid input string");
        }
    }

    private static void opdracht3() {
        Scanner myObj3 = new Scanner(System.in);
        System.out.println("Voer jouw getal in: ");
        String ingevoerdeGetal1 = myObj3.nextLine();
        System.out.println("Voer nog een getal: ");
        String ingevoerdeGetal2 = myObj3.nextLine();
        try {
            if (Integer.parseInt(ingevoerdeGetal1) > Integer.parseInt(ingevoerdeGetal2)) {
                System.out.println("Het eerste ingevoerde getal is groter dan het tweede getal.");
            } else if (Integer.parseInt(ingevoerdeGetal1) < Integer.parseInt(ingevoerdeGetal2)) {
                System.out.println("het eerste ingevoerde getal is kleiner dan het tweede getal.");
            } else if (Integer.parseInt(ingevoerdeGetal1) == Integer.parseInt(ingevoerdeGetal2)) {
                System.out.println("De getallen zijn even groot.");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormat Exception: invalid input string");
        }
    }

    private static void opdracht4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer een getal in: ");
        int number = scanner.nextInt();
        try {
            if (number > 0) {
                System.out.println("Getal is positief");
            } else if (number < 0) {
                System.out.println("Getal is negatief");
            } else if (number == 0) {
                System.out.println("Getal is nul");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormat Exception: invalid input string");
        }
    }

    private static void opdracht5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer jouw leeftijd in: ");
        int number1 = scanner.nextInt();
        try{
            if (number1 >= 0 && number1 <= 10) {
                System.out.println("Jij bent een kind");
            } else if (number1 >= 10 && number1 <= 18) {
                System.out.println("Jij bent een puber");
            } else if (number1 >= 18 && number1 <= 45) {
                System.out.println("Jij bent een senior");
            }
        }catch (NumberFormatException nfe) {
            System.out.println("NumberFormat Exception: invalid input string");
        }
    }
    private static void opdracht6() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
    }
}
}


