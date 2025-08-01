package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерия
*/

public class Solution {

    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        System.out.println(waitingEmployees);
        paySalary("Гунигерд");
        System.out.println(waitingEmployees);
    }


    public static void paySalary(String name) {
        //напишите тут ваш код
        if (name == null) {
            return;
        }

        if (waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            int index = waitingEmployees.indexOf(name);
            waitingEmployees.set(index, null);
        }




    }
}
