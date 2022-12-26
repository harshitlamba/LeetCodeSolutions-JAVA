import java.util.HashMap;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int index[] = new int[2];
        HashMap<Integer, Integer> track = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (track.containsKey(complement)) {
                index[0] = track.get(complement);
                index[1] = i;
                return index;
            }
            track.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        int i = 0;
        if (result==null) {
            System.out.println("null");
        } else {
            System.out.print("[");
            for (; i < result.length-1; i++) {
                System.out.print(result[i]+",");
            }
            System.out.println(result[i]+"]");
        }
    }
}
