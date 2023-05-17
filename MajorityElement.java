public class MajorityElement {
    public static int majorityElement(int[] nums) {
        // Approach 1: Using HashMap
        // int max = 0;
        // int majority = nums[0];
        // HashMap<Integer, Integer> hash = new HashMap<>();
        // for (int i = 1; i < nums.length; i++) {
        //     if (hash.containsKey(nums[i])) {
        //         hash.put(nums[i], hash.get(nums[i]) + 1);
        //         if (hash.get(nums[i]) > nums.length/2) {
        //             majority = nums[i];
        //             break;
        //         }
        //     } else {
        //         hash.put(nums[i], 1);
        //     }
        // }
        // return majority;

        // Approach 2.1: Using Sorting
        // int count = 0;
        // int timesAppears = (int) nums.length/2;
        // int i = 1;
        // Arrays.sort(nums);
        // for (; i < nums.length; i++) {
        //     if (nums[i] == nums[i-1]) {
        //         count++;
        //         if (count == timesAppears) break;
        //     } else {
        //         count = 0;
        //     }
        // }
        // return nums[i-1];

        // Approach 2.2: Using Sorting with Condensed Code
        // Arrays.sort(nums);
        // int len = nums.length;
        // return nums[len/2];

        // Approach 3: Using Moore's Voting Algorithm
        int majority = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
            }
            if (majority == nums[i]) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        int[] firstNums = new int[]{3,2,3};
        int[] secondNums = new int[]{1};
        int[] thirdNums = new int[]{7,7,5,7,5,1,5,7,5,5,7,7,5,5};
        System.out.println("The majority element in firstNums is: " + majorityElement(firstNums));
        System.out.println("The majority element in secondNums is: " + majorityElement(secondNums));
        System.out.println("The majority element in thirdNums is: " + majorityElement(thirdNums));
    }
}
