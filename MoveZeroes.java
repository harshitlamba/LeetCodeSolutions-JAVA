public class MoveZeroes {
    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public static void moveZeroes(int[] nums) {
        int i,j;
        i=j=0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                j++;
            } else {
                swap(nums,i,j);
                i++;
                j++;
            }
        }
//        int k = 0;
//        for (;k < nums.length - 1; k++) {
//            System.out.print(nums[k] + " ");
//        }
//        System.out.print(nums[k]);
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
        System.out.println("");
        moveZeroes(new int[]{1,0});
        System.out.println("");
        moveZeroes(new int[]{0});
        System.out.println("");
        moveZeroes(new int[]{-5,4,0,2,-1});
    }
}
