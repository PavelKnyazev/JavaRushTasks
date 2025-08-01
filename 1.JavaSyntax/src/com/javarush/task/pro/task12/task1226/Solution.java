package com.javarush.task.pro.task12.task1226;

/* 
Бой гладиаторов
*/

import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Robot amigoRobot = new Robot(Arrays.asList(null, new Core(1), new Core(2), null,
                new Core(4), new Core(5), null, new Core(7), null, new Core(9)));
        Robot diegoRobot = new Robot(Arrays.asList(new Core(0), null, null, new Core(3), null,
                new Core(5), new Core(6), new Core(7), null, null));

        fixRobot(amigoRobot);
        fixRobot(diegoRobot);
        printRobot(amigoRobot);
        printRobot(diegoRobot);
    }

    public static void fixRobot(Robot robot) {
        List<Core> robotCores = robot.getCores();
        for (int i = 0; i < robotCores.size(); i++) {
            Core core = robotCores.get(i);
            if (core == null) {
                robotCores.set(i, new Core(i));
            }
        }
    }

    public static void printRobot(Robot robot) {
        List<Core> robotCores = robot.getCores();
        for (int i = 0; i < robotCores.size(); i++) {
            System.out.println(robotCores.get(i));
        }
    }

}