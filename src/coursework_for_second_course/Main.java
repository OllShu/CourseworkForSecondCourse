package coursework_for_second_course;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    TaskService taskService = new TaskService();

    ArrayList<Task> taskArrayList = new ArrayList<>();
        taskArrayList.add(taskService.addTask());


        System.out.println(taskArrayList.toString());

    }
}


