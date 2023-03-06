package task_bilet;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
      int x = scanner.nextInt();
      int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
            if (x%array[i]==0) {
                System.out.println(array[i]);
            }
        }

    }
}
