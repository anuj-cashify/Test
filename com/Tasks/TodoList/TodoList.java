package com.Tasks.TodoList;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    Scanner scan = new Scanner(System.in);

    private final ArrayList <TaskTitle>  taskList;


    public TodoList() {
        taskList = new ArrayList<>();
    }

    public void readTaskFromUser() {
        System.out.print(" Please Enter  Task ID  : ");
        String ID = scan.nextLine();
        System.out.print(" Please enter Task Title  : ");
        String title = scan.nextLine();
        System.out.print("Please enter  Description: ");
        String desc = scan.nextLine();
        System.out.print(" Please enter Status of tasks : ");
        String status = scan.nextLine();
        taskList.add(new TaskTitle(ID,title,desc,status));
    }
    public void updateStatus() {
        System.out.println("Please enter the Task ID you want to update");
        String ID = scan.nextLine();
        System.out.println("Enter the status you want to add");
        String status = scan.nextLine();
        for(com.Tasks.TodoList.TaskTitle tasks:taskList ) {
            if(tasks.getID().equals(ID)) {
                tasks.setProgress(status);
                System.out.print("press e to exit ");
            }
        }
    }
    public void InProgress() {
        String displayFormat = "%-20s %-35s %-10s %-10s ";
        if (!taskList.isEmpty()) {
            System.out.println(String.format(displayFormat, "TaskID","TITLE","DESCRIPTION","STATUS"));
            for(com.Tasks.TodoList.TaskTitle tasks:taskList ) {
                if(tasks.isInProgress()) {System.out.println(String.format(displayFormat,
                        tasks.getID(),
                        tasks.getTitle(),
                        tasks.getDescription(),
                        tasks.getProgress()
                        ));
                }

            }
        }
    }
    public void IsCompleted() {
        String displayFormat = "%-20s %-35s %-10s %-10s  ";

        if (!taskList.isEmpty()) {
            System.out.println(String.format(displayFormat,"TaskID","TITLE","DESCRIPTION","STATUS","DUE DATE"));
            for(com.Tasks.TodoList.TaskTitle tasks:taskList ) {
                if(tasks.isCompleted()) {
                    System.out.println(String.format(displayFormat, tasks.getID(), tasks.getTitle(), tasks.getDescription(), tasks.getProgress()
                    ));
                }
            }
        }
    }
    public void TODO() {
        String displayFormat = "%-20s %-35s %-10s %-10s";

        if (!taskList.isEmpty()) {
            System.out.println(String.format(displayFormat,"TaskID","TITLE","DESCRIPTION","STATUS"));
            for(com.Tasks.TodoList.TaskTitle tasks:taskList ) {
                if(tasks.isTODO()) {
                    System.out.println(String.format(displayFormat, tasks.getID(), tasks.getTitle(), tasks.getDescription(), tasks.getProgress()
                    ));
                }
            }
        } }
    public void AllTasks() {
        String displayFormat = "%-20s %-35s %-10s %-10s";
        if (!taskList.isEmpty()) {
            System.out.println(String.format(displayFormat,"TaskID","TITLE","DESCRIPTION","STATUS"));
            for(com.Tasks.TodoList.TaskTitle tasks:taskList ) {
                System.out.println(String.format(displayFormat, tasks.getID(), tasks.getTitle(), tasks.getDescription(), tasks.getProgress()
                ));

            }
        }
    }

}