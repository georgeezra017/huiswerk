//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//      De bartender-methode print aan de hand van een switch statement, het drankje dat deze persoon graag drinkt;
//      test

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