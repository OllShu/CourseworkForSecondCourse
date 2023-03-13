package coursework_for_second_course;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;

public class MonthlyTask extends Task {
    public MonthlyTask(String title,
                       String description,
                       TypeTask type,
                       LocalDateTime dateTime) {
        super(title, description, type, dateTime);
    }

    @Override
    public LocalDateTime appearsin(LocalDateTime dateTime, LocalDate date) {
        if (date.isBefore(ChronoLocalDate.from(dateTime))) {
            dateTime = dateTime.plusMonths(1);
        }
        return dateTime;
    }
}
