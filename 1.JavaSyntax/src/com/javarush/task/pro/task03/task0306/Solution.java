package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        //напишите тут ваш код

        Scanner console = new Scanner(System.in);
        int number1 = console.nextInt();
        int number2 = console.nextInt();
        int number3 = console.nextInt();

        if (number1 < (number2 + number3) && number2 < (number1 + number3) && number3 < (number1 + number2)) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }

    }
}
