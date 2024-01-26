import java.util.*;

public class FindTheDifferenceOfTwoArrays {
//    Approach 1
//    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//        HashSet<Integer> set_n1 = new HashSet<>();
//        HashSet<Integer> set_n2 = new HashSet<>();
//        List<List<Integer>> answer = new ArrayList<>();
//        for (int i : nums1) {
//            set_n1.add(i);
//        }
//        for (int i : nums2) {
//            set_n2.add(i);
//        }
//        answer.add(new ArrayList<>());
//        answer.add(new ArrayList<>());
//        for (int i : set_n1) {
//            if (!set_n2.contains(i)) {
//                answer.get(0).add(i);
//            }
//        }
//        for (int i : set_n2) {
//            if (!set_n1.contains(i)) {
//                answer.get(1).add(i);
//            }
//        }
//        return answer;
//    }

//    Approach 2
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set_n1 = new HashSet<>();
        HashSet<Integer> set_n1_copy = new HashSet<>();
        HashSet<Integer> set_n2 = new HashSet<>();
        List<List<Integer>> answer = new ArrayList<>();
        for (int i : nums1) {
            set_n1.add(i);
            set_n1_copy.add(i);
        }
        for (int i : nums2) {
            set_n2.add(i);
        }
        set_n1.removeAll(set_n2);
        set_n2.removeAll(set_n1_copy);
        answer.add(set_n1.stream().toList());
        answer.add(set_n2.stream().toList());
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3}, new int[]{2,4,6}));
        System.out.println(findDifference(new int[]{1}, new int[]{1}));
    }
}
