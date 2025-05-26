package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println(sum);
    }
}


//for (int i = 0; i < 4; i++) {       // 4 строки
//        for (int j = 0; j < 5; j++) {   // 5 звёздочек в каждой
//        System.out.print("*");
//    }
//            System.out.println();
//}

//for (int i = 1; i <= 5; i++) {    // строка от 1 до 5
//        for (int j = 1; j <= i; j++) {
//        System.out.print("*");
//    }
//            System.out.println();
//}