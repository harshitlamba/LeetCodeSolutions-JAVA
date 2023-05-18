public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] firstNums = new int[]{3,2,2,3};
        int[] secondNums = new int[]{0,1,2,2,3,0,4,2};
        int[] thirdNums = new int[]{5,2,0};
        System.out.println("The number fo elements not equal to 3 are: " + removeElement(firstNums,3));
        System.out.println("The number fo elements not equal to 2 are: " + removeElement(secondNums,2));
        System.out.println("The number fo elements not equal to 6 are: " + removeElement(thirdNums,6));
    }
}
