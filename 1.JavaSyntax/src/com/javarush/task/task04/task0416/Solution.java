package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String line = console.readLine();
        double number = Double.parseDouble(line);

        if (number % 5 < 3.0) {
            System.out.println("зелёный");
        } else if (( number % 5 >= 3.0) && (number % 5 < 4.0)) {
            System.out.println("жёлтый");
        } else {
            System.out.println("красный");
        }

    }
}