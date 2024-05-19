package ReDrag;

import java.util.Scanner;

public class FormattedName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of names: ");
        int numNames = sc.nextInt();
        sc.nextLine();  // Consume newline left-over

        String[] names = new String[numNames];
        for (int i = 0; i < numNames; i++) {
            System.out.print("+ Name " + (i + 1) + ": ");
            String name = sc.nextLine();
            names[i] = toTitleCase(name);
        }

        System.out.println("\n*FORMATTED NAMES:");
        for (int i = 0; i < numNames; i++) {
            System.out.println("+ Name " + (i + 1) + ": " + names[i]);
        }
    }

    private static String toTitleCase(String name) {
        String[] words = name.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            }
        }
        return String.join(" ", words);
    }
}
