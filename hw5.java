import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;









import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
 
public class hw5 {
    public static void main(String[] args) {
        String sentence = "Иван, Петр, Александр, Иван, Алексей, Максим, Максим";
 
        List<String> words = new ArrayList<>();
        for (String s : sentence.split(" ")) {
            words.add(s.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", "").toLowerCase());
        }
 
        Map<String, Long> frequency = countDuplicates(words);
        System.out.println(frequency);
    }
 
    public static Map<String, Long> countDuplicates(List<String> inputList) {
        return inputList.stream().collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
    }
}