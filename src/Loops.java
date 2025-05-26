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

    }
}

