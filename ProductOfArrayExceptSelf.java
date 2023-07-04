public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {

        // Approach 1: Multiply and store the multiplication of the entire array in a variable and then iterate
        // over the array. Divide this multiplication by array element i to get the answer at ith location. We will need
        // to handle divide by zero error.

        // Approach 2: The result for the ith array element i is the multiplication of all the elements right to it
        // and elements left to it. We create two arrays left and right that contain the value the values we would
        // obtain by cumulatively multiply the elements to the right and left of the given array and the multiply
        // right and left arrays element-wise to obtain the answer. Example, for nums = [1,2,3,4], the left anf right
        // arrays are: left = [1,1,2,6], right = [24,12,4,1]. The result would be: [24,12,8,6].
        // Time Complexity: O(n) and Space Complexity: O(n).

        // int length = nums.length;
        // int[] result = new int[length];
        // int[] left = new int[length];
        // int[] right = new int[length];

        // for (int i = 0, j = length - 1; i < length & j >= 0; i++, j--) {
        //     if ((i == 0) & (j == length - 1)) {
        //         left[i] = 1;
        //         right[j] = 1;
        //     } else {
        //         left[i] = left[i-1] * nums[i-1];
        //         right[j] = right[j+1] * nums[j+1];
        //     }
        // }
        // for (int i = 0; i < length; i++) {
        //     result[i] = left[i] * right[i];
        // }

        // Approach 3: Same as approach 2 but with space complexity of O(1).

        int length = nums.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            if (i == 0) {
                result[i] = 1;
            } else {
                result[i] = result[i-1] * nums[i-1];
            }
        }

        int right = 1;
        for (int i = result.length - 1; i >= 0 ; i--) {
            result[i] = result[i] * right;
            right = right * nums[i];
        }

        return result;
    }

    public static void print(int[] nums) {
        System.out.println("");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{-1,1,0,-3,3};
        int[] arr3 = new int[]{4,5,1,8,2,10,6};
        print(productExceptSelf(arr1));
        print(productExceptSelf(arr2));
        print(productExceptSelf(arr3));
    }
}
