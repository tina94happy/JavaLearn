package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Module2HW {
    public static void main(String[] args) {
        System.out.print("Enter the number of Strings to sort: ");
        int numStrings = 0;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            numStrings = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading input. Exiting.");
            System.exit(1);
        }

        String[] strings = new String[numStrings];
        for (int i = 0; i < numStrings; i++) {
            try {
                System.out.print("Enter String " + (i + 1) + ": ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                strings[i] = reader.readLine();
            } catch (IOException e) {
                System.err.println("Error reading input. Exiting.");
                System.exit(1);
            }
        }

        sortStrings(strings);

        System.out.println("\nSorted Strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }

    private static void sortStrings(String[] strings) {
        int n = strings.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (strings[i - 1].compareTo(strings[i]) > 0) {
                    // Swap strings[i-1] and strings[i]
                    String temp = strings[i - 1];
                    strings[i - 1] = strings[i];
                    strings[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
