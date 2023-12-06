package org.example;

public class Strings {
    public static void main(String[] args) {
        // not string use String
        String s = "hallo world"; // 11 include spaces
        int length = s.length();
        System.out.println(length);
        System.out.println("hallo world".length());

        String emptyString = "";
        // i gets "0"
        int i = emptyString.length();
        System.out.println(i);
        String nullString = null;
        /*
        // runtime error!
        int j = nullString.length();
         */

        int answer = 42;
        String message = "The answer is " + answer;
        System.out.println(message);
        // oops!
        String message2 = "Three plus four is " + 3 + 4;
        System.out.println(message2);

        String message3 = "something";
        if (message3.equals("something else"))
            System.out.println("thisDoesntGetExecuted");
        else
            System.out.println("thisDoes");

        /*
        String comes before the second one alphabetically;
        0 if they are equal;
        and is a positive integer if the first String is alphabetically greater than the second.
         */
        String a = "Albert Aligator";
        if (a.compareTo("Zachary Zebra") < 0)
            System.out.println("thisGetsExecuted");
        System.out.println(a.compareTo("Zachary Zebra"));


    }
}
