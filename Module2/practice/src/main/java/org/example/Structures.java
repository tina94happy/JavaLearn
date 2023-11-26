package org.example;

import java.util.Scanner;

public class Structures {
    public static void main(String[] args){
        // for
        int i, j;
        for (i=1;i<10;i++){
            for (j=1;j<10;j++){
                System.out.print(i + "x" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }

        // switch & break
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = input.nextInt();

        switch (userInput){
            case 0:
                System.out.println(0);break;
            case 1:
                System.out.println(1);break;
            default:
                System.out.println("not 0 or 1");break;
        }

        //goto
        // Cannot use goto as a variable name
        /*
        int goto = 0;
        System.out.println(goto);
         */


    }

}
