package functional_task;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String string = scanner.nextLine();
        String[] stringArray = string.split(" ");
        System.out.println("Количество слов в тексте "+stringArray.length);

        Map<String, Integer> wordWithCountMention = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : Arrays.stream(stringArray)
                .collect(Collectors.groupingBy(s -> s)).entrySet()) {
            String k = entry.getKey();
            List<String> v = entry.getValue();
            Integer put = wordWithCountMention.put(k, v.size());
        }
    //    wordWithCountMention.entrySet().stream().forEach(System.out::println);

        wordWithCountMention.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
//        wordWithCountMention.entrySet().stream()
  //              .sorted(Map.Entry.comparingByKey())
    //            .sorted(Map.Entry.comparingByValue().reversed())



    }
}
