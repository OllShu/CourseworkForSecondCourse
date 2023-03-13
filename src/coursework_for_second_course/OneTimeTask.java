package coursework_for_second_course;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OneTimeTask extends Task {
    public OneTimeTask(String title,
                       String description,
                       TypeTask type,
                       LocalDateTime dateTime) {
        super(title, description, type, dateTime);
    }

    @Override
    public LocalDateTime appearsin(LocalDateTime dateTime, LocalDate date) {
        return null;
    }
}
