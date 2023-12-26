import java.util.Scanner;

public class TextAdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself at a crossroads. What do you want to do?");
        System.out.println("1. Go left");
        System.out.println("2. Go right");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            leftPath(scanner);
        } else {
            rightPath(scanner);
        }

        scanner.close();
    }

    private static int getUserChoice(Scanner scanner, int maxChoice) {
        int choice = -1;
        while (choice < 1 || choice > maxChoice) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice < 1 || choice > maxChoice) {
                    System.out.println("Invalid input. Please enter a valid choice.");
                }
            } else {
                scanner.next(); // consume invalid input
                System.out.println("Invalid input. Please enter a valid choice.");
            }
        }
        return choice;
    }

    private static void leftPath(Scanner scanner) {
        System.out.println("You chose to go left. You encounter a mysterious cave.");
        System.out.println("What will you do?");
        System.out.println("1. Enter the cave");
        System.out.println("2. Ignore the cave and continue");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            System.out.println("As you enter the cave, you find a hidden treasure!");
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("You decide to ignore the cave and continue your journey.");
            System.out.println("Unfortunately, you encounter a dragon and it's game over.");
        }
    }

    private static void rightPath(Scanner scanner) {
        System.out.println("You chose to go right. You come across a bridge.");
        System.out.println("What will you do?");
        System.out.println("1. Cross the bridge");
        System.out.println("2. Jump into the river and swim");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            System.out.println("You successfully cross the bridge and continue your adventure.");
            System.out.println("You encounter friendly villagers who offer to guide you further.");
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("You jump into the river, but the current is too strong.");
            System.out.println("You get swept away, and unfortunately, it's game over.");
        }
    }
}