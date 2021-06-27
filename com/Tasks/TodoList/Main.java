package com.Tasks.TodoList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        String p = " ";
        do {
            Statement.mainMenu();

            Scanner switchC = new Scanner(System.in);

            p = switchC.next();

            switch (p) {
                case "1" -> todoList.readTaskFromUser();
                case "2" -> {
                    todoList.InProgress();
                    ;
                }
                case "3" -> {
                    todoList.IsCompleted();
                    ;
                }
                case "4" -> todoList.TODO();
                case "5" -> todoList.AllTasks();
                case "6" -> todoList.updateStatus();
                case "e" -> System.exit(0);
                default -> Statement.unknownMessage();
            }
        }while (!p.equals("e"));


    }

}
