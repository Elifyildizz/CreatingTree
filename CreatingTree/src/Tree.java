import java.util.*;

public class Tree {
    public static void main(String[] args) {
        //Creating a tree (*) by using number

        Scanner scanner = new Scanner(System.in);
        String answer;
        int rows;
        do {
            System.out.println("Enter a number: ");
            try {
                rows = Integer.parseInt(scanner.next());
            } catch (NumberFormatException nfe) {
                System.out.println("Try again !");
                rows = 0;
            }

            int space = rows - 1;
            int stars = 1;

            if (rows <= 0) {
                System.out.println("Enter a positive number");
            } else {
                for (int r = 1; r <= rows; r++) {
                    for (int sp = 1; sp <= space; sp++) {
                        System.out.printf(" ");
                    }
                    space--;

                    for (int st = 1; st <= stars; st++) {
                        System.out.printf("*");
                    }
                    stars = stars + 2;
                    System.out.println("\n");
                }
            }

            System.out.println("Do you want to continue? \nPlease write yes or no: ");
            answer = scanner.next();
        }
        while (answer.equalsIgnoreCase("yes"));
    }
}
