public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if ((nums.length == 0) | (nums == null)) {
            return 0;
        }
        int masterPtr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[masterPtr] != nums[i]) {
                masterPtr++;
                nums[masterPtr] = nums[i];
            }
        }
        return (masterPtr + 1);
    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.print("Deduped Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
