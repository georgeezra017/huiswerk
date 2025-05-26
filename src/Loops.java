public class Loops {
    public static void main(String[] args) {
        opdracht1();
        System.out.println("nu komt opdracht 2");
        opdracht2();
        System.out.println("nu komt opdracht 3");
        opdracht3();
        System.out.println("nu komt opdracht 4");
        opdracht4();
        System.out.println("nu komt opdracht 5");
        opdracht5();
        System.out.println("nu komt opdracht 6");
        opdracht6();
        System.out.println("nu komt opdracht 7");
        opdracht7();
        System.out.println("nu komt opdracht 8");
        opdracht8();
        System.out.println("nu komt opdracht 9");
        opdracht9();
        System.out.println("nu komt opdracht 10");
        opdracht10();
    }

    private static void opdracht1() {

        int n = 100;
        int evenSum = 0;
        int oddSum = 0;

        for (
                int i = 1;
                i <= 2 * n; i++) {

            if ((i & 1) == 0)
                evenSum += i;
            else
                oddSum += i;
        }
        System.out.println("De sommatie van de eerste" + n
                + " even getallen = " + evenSum);

        // sum of odd numbers less than 17
        System.out.println("De sommatie van de eerste " + n
                + " oneven getallen = " + oddSum);
    }

    private static void opdracht2() {
        int a = 1;
        while (a < 1000) {
            a = a * 2;
            System.out.println(a);
        }
    }

    private static void opdracht3() {
        int[] num = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};
        int toFind = 43;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(toFind + " is gevonden.");
        else
            System.out.println(toFind + " is niet gevonden.");
    }

    private static void opdracht4() {
        int[] myArray = {12, 5, 7, 2, 18, 3, 9, 12};
        int sum = 0;
        int i;

// Loop through the array elements and store the sum in the sum variable
        for (i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        System.out.println("The sum is: " + sum);
    }

    private static void opdracht5() {
        String[] strings = {"Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren", "", "Deze", "student", "haalde", "goede", "cijfers"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
            if (strings[i] == "") {
                break;
            }
        }
    }

    private static void opdracht6() {
        int num = 100;  // Define the upper limit
        int count;  // Initialize counter for divisibility checks

        // Iterate from 1 up to 'num' to identify prime numbers
        for (int i = 1; i <= num; i++) {
            count = 0;  // Reset counter for each 'i'

            // Check for divisibility from 2 up to i/2
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;  // Increment if 'i' is divisible by 'j'
                    break;  // Exit loop if a divisor is found
                }
            }

            // If the count is 0, 'i' is prime
            if (count == 0) {
                System.out.println(i);  // Output the prime number
            }
        }
    }

    private static void opdracht7() {
        int[] integerArray = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};
        //int elementsLargerThan45 = 0;
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] > 45) {
                System.out.println(integerArray[i]);
                //elementsLargerThan45++;
            }
        }
    }

    private static void opdracht8() {
        int getal = 10;
        while (getal != 0) {
            System.out.println(getal);
            getal--;
        }
    }

    private static void opdracht9() {
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Reeks van " + n + " fibonacci nummers:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
    private static void opdracht10() {
        int n = 5; // number of rows
        int spc = n-1; // initial space count
        int str = 1; // initial star count
        // loop to print the pyramid
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= spc; j++) { // spaces
                System.out.print("\t");
            }
            spc--; // decrementing spaces
            for(int k = 1; k <= str; k++) { // stars
                System.out.print("*\t");
            }
            str += 2; // incrementing stars
            System.out.println();
        }
    }
}


