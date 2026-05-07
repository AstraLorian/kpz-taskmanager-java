public class Task {
    private int id;
    private String title;
    private String description;
    private boolean isCompleted;

    // Конструктор для створення нового завдання
    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isCompleted = false; // за замовчуванням завдання не виконане
    }

    // Геттери та сеттери (необхідні для доступу до приватних полів)
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

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    // Метод для зручного виведення інформації про завдання в консоль
    @Override
    public String toString() {
        String status = isCompleted ? "[Виконано]" : "[В процесі]";
        return String.format("ID: %d | %s %s: %s", id, status, title, description);
    }
}