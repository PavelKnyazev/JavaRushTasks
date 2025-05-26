package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код

        Scanner console = new Scanner(System.in);
        int number1 = console.nextInt();
        int number2 = console.nextInt();
        int number3 = console.nextInt();
        System.out.println((number1 + number2 + number3) / 3);

    }
}
