package org.example;
import java.lang.String;
public class recursiveString {
    public static void main(String[] args) {
        String s = "wwwrunoobcom";
        String after = reverse(s);
        System.out.println(after);
    }

    static String reverse(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);

    }
}
