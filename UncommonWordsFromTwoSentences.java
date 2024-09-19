import java.util.*;

public class UncommonWordsFromTwoSentences {
    public static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        ArrayList<String> output = new ArrayList<>();
        for (String s : (s1 + " " + s2).split(" ")) {
            if (hashmap.containsKey(s)) hashmap.put(s, hashmap.get(s) + 1);
            else hashmap.put(s, 1);
        }
        for (Map.Entry<String, Integer> mapEntry : hashmap.entrySet()) {
            if (mapEntry.getValue() == 1) output.add(mapEntry.getKey());
        }
        String[] outputArr = new String[output.size()];
        outputArr = output.toArray(outputArr);
        return outputArr;
    }

    public static void main(String[] args) {
        // String[] output = uncommonFromSentences("this apple is sweet","this apple is sour");
        // String[] output = uncommonFromSentences("apple","apple");
        String[] output = uncommonFromSentences("apple apple","banana");
        for (String s : output) {
            System.out.println(s);
        }
    }
}
