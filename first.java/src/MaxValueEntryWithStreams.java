import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MaxValueEntryWithStreams {
    public static void main(String[] args) {
        // Example map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);
        map.put("D", 25);

        // Finding the entry with the maximum value using streams
//        Optional<Map.Entry<String, Integer>> maxEntry = map.entrySet()
//                .stream()
//                .max(Map.Entry.comparingByValue());


        Map.Entry<String, Integer> maxv = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();



        System.out.println(maxv);
        System.out.println("Key with maximum value: " + maxv.getKey());
        System.out.println("Maximum value: " + maxv.getValue());}
}


