public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int masterPtr = m+n-1;
        int i = m-1; int j = n-1;
        while((i>=0) & (j>=0)) {
            if (nums1[i] < nums2[j]) {
                nums1[masterPtr] = nums2[j];
                j--;
            } else {
                nums1[masterPtr] = nums1[i];
                i--;
            }
            masterPtr--;
        }
        while(j>=0) {
            nums1[masterPtr] = nums2[j];
            masterPtr--;
            j--;
        }
    }

    public void print(int[] nums1){
        for (int i : nums1) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{0,0};
        int[] nums2 = new int[]{1,2};
        int m = 0; int n = 2;
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, m, nums2, n);
        mergeSortedArray.print(nums1);
    }
}
