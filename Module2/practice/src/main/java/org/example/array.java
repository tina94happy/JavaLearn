package org.example;

public class array {
    public static void main(String[] args) {
        // create an array
        int[] myArray = new int[10];
        myArray[0] = 1;
        myArray[5] = 99;
        System.out.println(myArray[0]);

        int x = myArray[3]; // output: 0
        System.out.println(x);

        // definite number of elements
        System.out.println("myArray has " +
                myArray.length +
                " elements.");

        // print all elements inside array
        for (int i=0; i<10; i++)
            System.out.println("myArray[" + i +
                    "] is " + myArray[i]);

        // error if we set eleventh element
        // myArray[10] = 0;

        // the variable merely refers to (points to) the array
        int[] arrayA = new int[10];
        int[] arrayB = arrayA;
        arrayA[3] = 87;
        System.out.println(arrayB[3]);

        // set array value
        String [] s = { "one", "two", "three" };

        // multidimensional
        int [][] matrix = new int[10][10];

        // increase set array size
        int [] temp = new int[30];
        System.out.println("before modify myArray.length: " + myArray.length);
        System.arraycopy(myArray, 0, temp, 0, myArray.length);
        myArray = temp;
        System.out.println("after modify myArray.length: " + myArray.length);

        //===========================================================//
        // print square
        String[][] square = new String[10][];

        // 初始化 square 陣列
        for (int i = 0; i < 10; i++) {
            square[i] = new String[10];
        }

        // 在 square 陣列中填充數值
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                square[i][j] = "*  ";
            }
        }

        // 印出正方形
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(square[i][j]);
            }
            System.out.println(); // 換行
        }

        //===========================================================//
        // print triangle
        int [][] triangle= new int[10][];
        for (int i=0; i<10; i++)
            triangle[i] = new int[i +1];
        // 在 triangle 陣列中填充數值（1 代表印出星號）
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = 1;
            }
        }

        // 印出三角形
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (triangle[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // 換行
        }

    }
}
