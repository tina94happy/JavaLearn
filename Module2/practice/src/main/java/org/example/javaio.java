package org.example;
import java.io.*;
import java.util.Scanner;

public class javaio {
    public static void main(String[] args) throws IOException{
        System.out.println(3); // OK
        System.out.println(3.2); // OK
        System.out.println("The answer is " + 3.2); // OK

        // then, in your main() function:
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in), 1);


        // then, to get a line of user input
        //as a string:
        String s = stdin.readLine();
        System.out.println(s);
        // ... or to read an integer
        // int i = Integer.parseInt(stdin.readLine());


        System.out.println("Input an integer");
        BufferedReader std = new BufferedReader(new InputStreamReader(System.in), 1);
        int number = Integer.parseInt(std.readLine());
        System.out.println(number);




    }
}
