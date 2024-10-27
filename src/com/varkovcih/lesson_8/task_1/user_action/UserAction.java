package com.varkovcih.lesson_8.task_1.user_action;

import java.util.Scanner;

public class UserAction {

    public static String getFilePath() {
        Scanner console = new Scanner(System.in);
        boolean isCycleRunning = true;
        String filePath = "";

        while (isCycleRunning) {
            System.out.print("Enter file path: ");
            filePath = console.nextLine();

            if (filePath.equals("")) {
                System.out.println("It must not be an empty line, try again!");
                continue;
            }
            if (!filePath.contains(".")) {
                System.out.println("There must be a file extension");
                continue;
            }

            isCycleRunning = false;
        }

        return filePath;
    }
}
