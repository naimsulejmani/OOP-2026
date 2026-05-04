package introduction.composition_and_aggregation.mini_project;

import java.time.LocalDate;
import java.util.Scanner;

public class TodoAppUi {
    private static Scanner reader = new Scanner(System.in);

    public void showMenu() {
        System.out.println("Todo App Menu:");
        for (TodoMenu menu : TodoMenu.values()) {
            System.out.println(menu.ordinal() + 1 + ". " + menu);
        }
        System.out.println("\nPlease select an option: ");
    }

    public void showApplication() {
        showMenu();
        int option = Integer.parseInt(reader.nextLine());
        TodoMenu selectedMenu = TodoMenu.values()[option - 1];

        while (selectedMenu != TodoMenu.EXIT) {
            switch (selectedMenu) {
                case NEW -> newTodo();
                case EDIT -> editTodo();
                case DELETE -> deleteTodo();
                case FIND_ONE -> findTodo();
                case FIND_ALL -> findAllTodos();
                case COMPLETE_TODO -> completeTodo();
            }
            showMenu();
            option = Integer.parseInt(reader.nextLine());
            selectedMenu = TodoMenu.values()[option - 1];
        }

        System.out.println("Exiting the application. Goodbye!");
    }

    private void completeTodo() {
        System.out.println("You have selected to complete a todo, check from the list above");
        findAllTodos();
        System.out.print("Select todo based on ID: ");
        int todoId = Integer.parseInt(reader.nextLine());
        TodoItem selectTodo = TodoService.findById(todoId);

        if (selectTodo == null) {
            System.out.println("Item with id " + todoId + " not found.");
            return;
        }

        selectTodo.toggleCompleted();
        TodoService.updateById(todoId, selectTodo);
        System.out.println("Todo changed completed successfully.");

    }

    private void findAllTodos() {
        System.out.println("You Selected to find all todos");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-3s|%-50s|%-10s|%-20s|%-2s|%n", "ID", "Title", "Due Date", "Importance", "Completed");
        for (TodoItem item : TodoService.findAll()) {
            System.out.println(item.toRow());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }

    private void findTodo() {
        System.out.println("You Selected to find a todo");
    }

    private void deleteTodo() {
        System.out.println("You Selected to delete a todo");
    }

    private void editTodo() {
        System.out.println("You Selected to edit a todo");
    }

    private void newTodo() {
        System.out.println("You have selected to add a new todo");
        System.out.println("------------------------------------");
        System.out.print("Enter todo title: ");
        String title = reader.nextLine();
        System.out.print("Enter todo description: ");
        String description = reader.nextLine();
        System.out.print("Enter duedate: ");
        String strDueDate = reader.nextLine();
        LocalDate dueDate = LocalDate.parse(strDueDate);
        TodoItem newTodo = new TodoItem(title, description, dueDate);
        TodoService.add(newTodo);
        System.out.println("-----------------------------------------");
        System.out.println("Todo added successfully.");
        System.out.println("-----------------------------------------");
    }

    static void main() {
        TodoAppUi app = new TodoAppUi();
        app.showApplication();
    }


}
