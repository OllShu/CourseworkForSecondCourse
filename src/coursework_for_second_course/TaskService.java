package coursework_for_second_course;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TaskService {
    Scanner scanner = new Scanner(System.in);
    //   public static void main(String[] args) {
//    }

    public Task addTask() {
        Task task = null;
        String title = titleReceipt();
        String description = descriptionReceipt();
        TypeTask type = typeReceipt();
        int periodicity = periodicityNumberReceipt();

        switch (periodicityNumberReceipt()) {
            case 1:
                OneTimeTask oneTimeTask = new OneTimeTask(title, description, type, LocalDateTime.now());
                task = oneTimeTask;
            case 2:
                DailyTask dailyTask = new DailyTask(title, description, type, LocalDateTime.now());
                task = dailyTask;
            case 3:
                WeeklyTask weeklyTask = new WeeklyTask(title, description, type, LocalDateTime.now());
                task = weeklyTask;
            case 4:
                MonthlyTask monthlyTask = new MonthlyTask(title, description, type, LocalDateTime.now());
                task = monthlyTask;
            case 5:
                YearlyTask yearlyTask = new YearlyTask(title, description, type, LocalDateTime.now());
                task = yearlyTask;
        }
        return task;
    }

    public void deleteTask() {
        System.out.println("Введите id задачи для удаления");
        int id = scanner.nextInt();
    }

    public LocalDate getDayForTask () {
        System.out.println("Введите дату как dd.MM.yyyy:");
        String date = scanner.next();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(date, dateFormatter);
    }
    public void getTasksForDay () {

    }

    public String titleReceipt() {
        System.out.println("Введите название");
        return (scanner.nextLine());
    }

    public String descriptionReceipt() {
        System.out.println("Описание задачи");
        return (scanner.nextLine());

    }

    public TypeTask typeReceipt() {
        TypeTask type = null;
        System.out.println("Выберите тип задачи и введите цифру: 1 - рабочая, 2 - личная");
        if (scanner.nextInt() == 1) {
            type = TypeTask.work;
        } else if (scanner.nextInt() == 2) {
            type = TypeTask.personal;
        } else {
            try {
                throw new IncorrectArgumentException("Ошибка ввода");
            } catch (IncorrectArgumentException e) {
                System.out.println("Ошибка ввода");
            }
        }
            return type;
    }
    public int periodicityNumberReceipt() {
        System.out.println("Выберите периодичность выполнения задачи и введите цифру: " +
                "1 - однократно, 2 - ежеденевно, 3 - еженедельно, 4 - ежемесячно, 5 - ежегодно");
        if (scanner.hasNextInt() && (scanner.nextInt() >= 1 || scanner.nextInt() <= 5)) {
            int periodicity = scanner.nextInt();
        } else
            try {
                throw new IncorrectArgumentException("Ошибка ввода");
            } catch (IncorrectArgumentException e) {
                System.out.println("Ошибка ввода");
            }
        return scanner.nextInt();
    }
}
