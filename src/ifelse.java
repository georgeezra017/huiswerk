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
        opdracht6();
        System.out.println("Nu komt opdracht 7...");
        opdracht7();
        System.out.println("Nu komt opdracht 8...");
        opdracht8();
        System.out.println("Nu komt opdracht 9...");
        opdracht9();
        System.out.println("Nu komt opdracht 10...");
        opdracht10();

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
        try {
            if (number1 >= 0 && number1 <= 10) {
                System.out.println("Jij bent een kind");
            } else if (number1 >= 10 && number1 <= 18) {
                System.out.println("Jij bent een puber");
            } else if (number1 >= 18 && number1 <= 45) {
                System.out.println("Jij bent een senior");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormat Exception: invalid input string");
        }
    }

    private static void opdracht6() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Voer jouw text in");
        String text = myObj.nextLine();  // Read user input
        try {
            if (text.length() < 10) {
                System.out.println("Jouw text is: " + text + " karakters lang, en dus kort.");
            } else if (text.length() >= 10 && text.length() <= 20) {
                System.out.println("Jouw text is: " + text.length() + " karakters lang, en dus middellang.");
            } else if (text.length() > 20) {
                System.out.println("Jouw text is: " + text.length() + " karakters lang, en dus lang.");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormat Exception: invalid input string");
        }
    }

    private static void opdracht7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer jouw jaar in: ");
        int year = scanner.nextInt();
        // year to be checked
        boolean leap = false;
        // if the year is divided by 4
        if (year % 4 == 0) {
            // if the year is century
            if (year % 100 == 0) {
                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        } else
            leap = false;
        if (leap)
            System.out.println(year + " is een schrikkeljaar.");
        else
            System.out.println(year + " is geen schrikkeljaar.");
    }

    private static void opdracht8() {
        Scanner myObjA = new Scanner(System.in);
        System.out.println("Voer jouw getal in: ");
        String ingevoerdeGetalA = myObjA.nextLine();

        System.out.println("Voer nog een getal in: ");
        String ingevoerdeGetalB = myObjA.nextLine();

        System.out.println("Voer nog een getal in: ");
        String ingevoerdeGetalC = myObjA.nextLine();

        try {
            if (Integer.parseInt(ingevoerdeGetalA) >= Integer.parseInt(ingevoerdeGetalB) && Integer.parseInt(ingevoerdeGetalA) >= Integer.parseInt(ingevoerdeGetalC)) {
                System.out.println(Integer.parseInt(ingevoerdeGetalA) + " is het grootste getal.");
            } else if (Integer.parseInt(ingevoerdeGetalB) < Integer.parseInt(ingevoerdeGetalA) && Integer.parseInt(ingevoerdeGetalB) >= Integer.parseInt(ingevoerdeGetalC)) {
                System.out.println(Integer.parseInt(ingevoerdeGetalB) + " is the largest number.");
            } else {
                System.out.println(Integer.parseInt(ingevoerdeGetalC) + "is het grootste getal.");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormat Exception: invalid input string");
        }
    }

    private static void opdracht9() {
        Scanner myObjA = new Scanner(System.in);
        System.out.println("Voer een zijde in: ");
        String zijde1 = myObjA.nextLine();

        System.out.println("Voer nog een zijde in: ");
        String zijde2 = myObjA.nextLine();

        System.out.println("Voer nog een zijde in: ");
        String zijde3 = myObjA.nextLine();

        // Check for equilateral triangle
        if (zijde1 == zijde2 && zijde2 == zijde3)
            System.out.println("Gelijkbenige driehoek");

            // Check for isosceles triangle
        else if (zijde1 == zijde2 || zijde2 == zijde3 || zijde3 == zijde1)
            System.out.println("Ongelijkzijdige driehoek");
            // Otherwise scalene triangle
        else
            System.out.println("gelijkzijdige driehoek");
    }

    private static void opdracht10() {
        // Stores two numbers
        double num1, num2;

        // Take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Voer uw getallen in:");

        // Take the inputs
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println("Voer uw operatoren in (+,-,*,/):");

        char op = sc.next().charAt(0);
        double o = 0;

        switch (op) {
            // case to add two numbers
            case '+':
                o = num1 + num2;
                break;

            // case to subtract two numbers
            case '-':
                o = num1 - num2;
                break;

            // case to multiply two numbers
            case '*':
                o = num1 * num2;
                break;

            // case to divide two numbers
            case '/':
                o = num1 / num2;
                break;

            default:
                System.out.println("U heeft de verkeerde input ingevoerd");
        }

        System.out.println("Het eindresultaat:");
        System.out.println();

        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                + " = " + o);
    }
}




