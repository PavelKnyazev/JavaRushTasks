package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Scanner console = new Scanner(System.in);
        int number1 = console.nextInt();
        int number2 = console.nextInt();
        int number3 = console.nextInt();

        if (number1 == number2 && number2 == number3) {
            System.out.println(number1 + " " + number2 + " " + number3);
        } else if (number1 == number2) {
            System.out.print(number1 + " " + number2);
        } else if (number1 == number3) {
            System.out.println(number1 + " " + number3);
        } else if (number2 == number3) {
            System.out.println(number2 + " " + number3);
        }

    }
}
