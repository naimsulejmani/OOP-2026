package introduction.composition_and_aggregation.mini_project;

import java.util.ArrayList;
import java.util.List;

//kjo tregon se cfare sherbime mundemi me kry me modelin tone todoitem
// zakonisht CRUD-i
public class TodoService {
    private static final List<TodoItem> todoItems = new ArrayList<>();


    public static void add(TodoItem item) {
        todoItems.add(item);
    }

    public static TodoItem findById(int id) {
        for (TodoItem item : todoItems) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public static List<TodoItem> findAll() {
        //return new ArrayList<>(todoItems);
        return todoItems;
    }

    public static void deleteById(int id) {
        //todoItems.removeIf(item -> item.getId() == id);
        TodoItem foundItem = findById(id);
        if (foundItem == null) {
            System.out.println("Item with id " + id + " not found.");
            return;
        }
        todoItems.remove(foundItem);
    }

    public static void updateById(int id, TodoItem updatedItem) {
        TodoItem currentItem = findById(id);
        if (currentItem == null) {
            System.out.println("Item with id " + id + " not found.");
            return;
        }
        todoItems.remove(currentItem);
        todoItems.add(updatedItem);
//        currentItem.setTitle(updatedItem.getTitle());
//        currentItem.setDescription(updatedItem.getDescription());
    }
}
