//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";
        String drankje = "Bier";

        Hello();
        positiveOrNegative(number);
        postiveOrZeroOrNegativ(number);
        bartender(name);
        sum(input1, input2);

    }

    private static void Hello() {
        System.out.println("Hello, world!");
    }

    private static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number < 0) {
            System.out.println("This number is negative!");
        }
    }

    private static void postiveOrZeroOrNegativ(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number < 0) {
            System.out.println("This number is negative!");
        } else {
            System.out.println("This number is zero!");
        }
    }

    private static void bartender(String name) {
        String drankje = "Bier";
        switch (drankje) {
            case "Bier":
                System.out.println(name + " drinkt graag " + drankje);
                break;
            case "Wijn":
                System.out.println(name + " drinkt graag " + drankje);
                break;
            default:
                System.out.println(name + " heeft nog geen drankje uitgekozen.");
        }
    }

    private static void sum(int input1, int input2) {
        System.out.println(input1 + input2);
    }

}