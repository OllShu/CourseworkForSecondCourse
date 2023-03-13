package coursework_for_second_course;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Objects;

public abstract class Task {

    private String title;
    private String description;
    private TypeTask type;
    private final LocalDateTime dateTime;
    private int id = count;
    private static int count = 1;


    public Task(String title,
                String description,
                TypeTask type,
                LocalDateTime dateTime) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.dateTime = LocalDateTime.now();
        count++;
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

    public TypeTask getType() {
        return type;
    }

    public void setType(TypeTask type) {
        this.type = type;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return id == task.id && Objects.equals(getTitle(), task.getTitle()) && Objects.equals(getDescription(), task.getDescription()) && getType() == task.getType() && Objects.equals(getDateTime(), task.getDateTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDescription(), getType(), getDateTime(), id);
    }

    @Override
    public String toString() {
        return "Title task - " + title + ", description - " + description + ", type - " + type + ", dateTime - " + dateTime +
                ", id - " + id;
    }

    public abstract LocalDateTime appearsin(LocalDateTime dateTime, LocalDate date);
}








