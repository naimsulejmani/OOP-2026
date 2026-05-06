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
                case FIND_ALL_BY_IMPORTANCE -> findAllByImportance();
            }
            showMenu();
            option = Integer.parseInt(reader.nextLine());
            selectedMenu = TodoMenu.values()[option - 1];
        }

        System.out.println("Exiting the application. Goodbye!");
    }

    private void findAllByImportance() {
        System.out.println("Ju keni zgjedhur ti shfaqni sipas importances");
        System.out.println("Zgjidhni njeren nga importancat: ");
        System.out.println("---------------------------");
        for (TodoImportance importance : TodoImportance.values()) {
            System.out.println(importance);
        }
        System.out.println("---------------------------");
        String importanceStr = reader.nextLine().toUpperCase();
        TodoImportance importance = TodoImportance.valueOf(importanceStr);

        for (TodoItem item : TodoService.findAll()) {
            if (item.getImportance() == importance) {
                System.out.println(item.toRow());
            }
        }

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
        int size = TodoService.findAll().size();
        if (size == 0) {
            System.out.println("No todos found.");
            return;
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-3s|%-50s|%-10s|%-20s|%-2s|%n", "ID", "Title", "Due Date", "Importance", "Completed");
        for (TodoItem item : TodoService.findAll()) {
            System.out.println(item.toRow());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.printf("Total todos: %d%n", TodoService.findAll().size());
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }

    private void findTodo() {
        System.out.println("You Selected to find a todo");
        findAllTodos();
        System.out.print("Enter todo ID: ");
        int todoId = Integer.parseInt(reader.nextLine());
        TodoItem foundTodo = TodoService.findById(todoId);
        if (foundTodo == null) {
            System.out.println("Todo with id: " + todoId + " not found.");
            return;
        }
        System.out.println("Ju keni zgjedhur: ");
        System.out.println("--------------------------------");
        System.out.printf("ID: %d%n", foundTodo.getId());
        System.out.printf("Title: %s%n", foundTodo.getTitle());
        System.out.printf("Description: %s%n", foundTodo.getDescription());
        System.out.printf("Due Date: %s%n", foundTodo.getDueDate());
        System.out.printf("Importance: %s%n", foundTodo.getImportance());
        System.out.printf("Status: %s%n", foundTodo.getStatus());
        System.out.printf("Completed: %s%n", foundTodo.isCompleted() ? "Yes" : "No");
        System.out.println("--------------------------------");
    }

    private void deleteTodo() {
        System.out.println("You Selected to delete a todo");
        findAllTodos();
        System.out.print("Enter todoId for delete: ");
        int todoId = Integer.parseInt(reader.nextLine());
        TodoService.deleteById(todoId);
    }

    private void editTodo() {
        System.out.println("You Selected to edit a todo");
        findAllTodos();
        System.out.print("Enter todoId for update: ");
        int todoId = Integer.parseInt(reader.nextLine());
        TodoItem currentItem = TodoService.findById(todoId);
        if (currentItem == null) {
            System.out.println("Item with id " + todoId + " not found.");
            return;
        }
        System.out.println("A deshironi me ndryshu emrin (Y/N): ");
        String answer = reader.nextLine().toUpperCase();
        if (answer.equals("Y")) {
            System.out.print("Enter new title: ");
            String title = reader.nextLine();
            currentItem.setTitle(title);
        }

        System.out.println("A deshironi me ndryshu pershkrimin (Y/N): ");
        answer = reader.nextLine().toUpperCase();
        if (answer.equals("Y")) {
            System.out.print("Enter new description: ");
            String description = reader.nextLine();
            currentItem.setDescription(description);
        }

        System.out.println("A deshironi me ndryshu duedaten (Y/N): ");
        answer = reader.nextLine().toUpperCase();
        if (answer.equals("Y")) {
            System.out.print("Enter new due date: ");
            String strDueDate = reader.nextLine();
            LocalDate dueDate = LocalDate.parse(strDueDate);
            currentItem.setDueDate(dueDate);
        }

        System.out.println("A deshironi me ndryshu statusin (P/J): ");
        answer = reader.nextLine().toUpperCase();
        if (answer.equals("P")) {
            System.out.println("Zgjidh njeren nga statuset: ");
            System.out.println("----------------------------------");
            for (TodoStatus status : TodoStatus.values()) {
                System.out.println(status);
            }
            System.out.println("----------------------------------");
            System.out.println("Enter new status: ");
            String strStatus = reader.nextLine().toUpperCase();
            TodoStatus newStatus = TodoStatus.valueOf(strStatus);
            if (newStatus == currentItem.getStatus()) {
                System.out.println("Status has not changed.");
            } else {
                currentItem.setStatus(newStatus);
            }
        }

        System.out.println("A deshironi me ndryshu rendesine (P/J): ");
        answer = reader.nextLine().toUpperCase();
        if (answer.equals("P")) {
            System.out.println("Zgjidh njeren nga rendesite: ");
            System.out.println("----------------------------------");
            for (TodoImportance importance : TodoImportance.values()) {
                System.out.println(importance);
            }
            System.out.println("----------------------------------");
            System.out.println("Enter new importance: ");
            String strImportance = reader.nextLine().toUpperCase();
            TodoImportance newImportance = TodoImportance.valueOf(strImportance);
            if (newImportance == currentItem.getImportance()) {
                System.out.println("Importance has not changed.");
            } else {
                currentItem.setImportance(newImportance);
            }
        }

        System.out.println("A deshironi te nderroni completed (P/J): ");
        answer = reader.nextLine().toUpperCase();
        if (answer.equals("P")) {
            currentItem.toggleCompleted();
        }

        TodoService.updateById(todoId, currentItem);
        System.out.println("Todo updated successfully.");


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
