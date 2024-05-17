package com.techelevator;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        todoVersionAndy();
    }

    public static void todoVersionAndy() {
        System.out.println("** WELCOME TO THE TODO LIST **");

        Scanner scanner = new Scanner(System.in);

        boolean stay = true;

        List<Todo> todoList = new ArrayList<>();

        while (stay) {

            System.out.println("1 to view list, 2 to add new item, 3 to mark complete, and Q to quit");
            String userInput = scanner.nextLine();

            if (userInput.equals("q") || userInput.equals("Q")) {
                System.out.println("Quitting the To Do List");
                stay = false;
            } else if (userInput.equals("1")) {
                // View the list...
                System.out.println("Here is the todo list");
                // Loop through the list and print it's description..
                for (Todo todo : todoList) {
                    System.out.println(todo.getDescription() + ". Done: " + todo.isDone());
                }

            } else if (userInput.equals("2")) {
                // Add a new item...
                System.out.println("Add a new item: ");
                // Prompt the user for input...
                String toDoDescription = scanner.nextLine();
                // Create a new todo object...
                Todo todoItem = new Todo(toDoDescription);
                // Add the new object to the list...
                todoList.add(todoItem);
            } else if (userInput.equals("3")) {
                // Mark an item complete...
                System.out.println("Which item is complete?");
            } else {
                System.out.println(userInput + " is an invalid option.");
            }
        }

        scanner.close();
        System.out.println("Program finished");
    }

    void toDoVersionChris() {
        System.out.println("** WELCOME TO THE TODO LIST **");

        Scanner scanner = new Scanner(System.in);

        boolean stay = true;

        Map<String, Boolean> todoMap = new HashMap<>();

        while (stay) {

            System.out.println("1 to view list, 2 to add new item, 3 to mark complete, and Q to quit");
            String userInput = scanner.nextLine();

            if (userInput.equals("q") || userInput.equals("Q")) {
                System.out.println("Quitting the To Do List");
                stay = false;
            } else if (userInput.equals("1")) {
                // View the list...
                System.out.println("Here is the todo list");
                Set<String> todoKeys = todoMap.keySet();
                for (String key : todoKeys) {
                    System.out.println("Item: " + key + " is complete: " + todoMap.get(key));
                }
            } else if (userInput.equals("2")) {
                // Add a new item...
                System.out.println("Add a new item: ");

                // Prompt the user for the item to add.
                String itemInput = scanner.nextLine();
                String itemInputLowerCase = itemInput.toLowerCase();
                todoMap.put(itemInputLowerCase, false);
                System.out.println("Item added: " + itemInput + " Completed: " + todoMap.get(itemInputLowerCase));
            } else if (userInput.equals("3")) {
                // Mark an item complete...
                System.out.println("Which item is complete?");
                String completeItemInput = scanner.nextLine();
                String completeItemInputLowerCase = completeItemInput.toLowerCase();
                String completeInputLowerCase = completeItemInput.toLowerCase();



                if (completeInputLowerCase.equals("yes")) {

                }
            } else {
                System.out.println(userInput + " is an invalid option.");
            }
        }

        scanner.close();
        System.out.println("Program finished");
    }
}
