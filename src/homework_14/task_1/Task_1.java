package homework_14.task_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Enter programming language: ");
        String language = scanner.next();
         // используй шаблон String.format() %s, %d
        System.out.println("Hello, my name is " + name + "." + " I'm " + language + " developer and I'm glad to became a part of your company.");
    }
}
