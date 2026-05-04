package introduction.composition_and_aggregation.mini_project;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TodoItem {

    private static int nextId = 1;

    private final int id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private TodoStatus status;
    private TodoImportance importance;
    private LocalDateTime createdAt = LocalDateTime.now();
    private boolean completed;
    private LocalDateTime completedAt;

    public TodoItem(String title, String description, LocalDate dueDate, TodoStatus status, TodoImportance importance, boolean completed, LocalDateTime completedAt) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.importance = importance;
        this.completed = completed;
        this.completedAt = completedAt;
        this.id = nextId++;
    }

    public TodoItem(String title, String description) {
        this(title, description, null, TodoStatus.DRAFT, TodoImportance.MEDIUM, false, null);
    }

    public TodoItem(String title, String description, LocalDate dueDate) {
        this(title, description, dueDate, TodoStatus.DRAFT, TodoImportance.MEDIUM, false, null);
    }

    public TodoItem(String title) {
        this(title, null, null, TodoStatus.DRAFT, TodoImportance.MEDIUM, false, null);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public TodoStatus getStatus() {
        return status;
    }

    public void setStatus(TodoStatus status) {
        this.status = status;
    }

    public TodoImportance getImportance() {
        return importance;
    }

    public void setImportance(TodoImportance importance) {
        this.importance = importance;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void toggleCompleted() {
        this.completed = !this.completed;

        if (this.completed) {
            this.completedAt = LocalDateTime.now();
        } else {
            this.completedAt = null;
        }
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }


    public String toRow() {
        return String.format("|%3d|%50s|%10s|%20s|%2s|%n",
                this.id,this.title,this.dueDate,this.importance,
                this.completed ? "✅":"x");
    }
}









