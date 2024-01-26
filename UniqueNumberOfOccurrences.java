import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean result = false;
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i,map.get(i)+1);
            } else {
                map.put(i,1);
            }
        }
        HashSet<Integer> count = new HashSet<>();
        count.addAll(map.values());
        if (count.size() == map.values().size()) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}));
        System.out.println(uniqueOccurrences(new int[]{1,2}));
        System.out.println(uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }
}
