package tech.strategio;

import java.time.LocalDate;
import java.util.Objects;

public class ToDo {
    private static int nextId = 1;
    private int id;
    private String name;
    private LocalDate due;
    private String description;
    private Status status;

    public ToDo(){}

    public ToDo(String name, LocalDate due, String description, Status status) {
        this.id = nextId++;
        this.name = name;
        this.due = due;
        this.description = description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDue() {
        return due;
    }

    public void setDue(LocalDate due) {
        this.due = due;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDo toDo = (ToDo) o;
        return id == toDo.id && Objects.equals(name, toDo.name) && Objects.equals(due, toDo.due) && Objects.equals(description, toDo.description) && status == toDo.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, due, description, status);
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", due=" + due +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
