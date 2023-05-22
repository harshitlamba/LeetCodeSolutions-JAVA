import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        PriorityQueue<Map.Entry> pq = new PriorityQueue(new Comparator<Map.Entry>() {
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                return (int) o2.getValue() - (int) o1.getValue();
            }
        });
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) hash.put(nums[i],hash.get(nums[i])+1);
            else hash.put(nums[i],1);
        }
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            pq.add(entry);
        }
        while(!pq.isEmpty() & k > 0) {
            Map.Entry<Integer, Integer> e = pq.poll();
            result[result.length-k] = e.getKey();
            k--;
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] nums = new int[]{1};
        int[] nums = new int[]{1,1,1,2,2,3};
        int k = 2;
        int[] result = topKFrequent(nums,k);
        System.out.println("Top K Frequent Items: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
