public class IncreasingTripletSubsequence {

    public static boolean increasingTriplet(int[] nums) {
        if (nums.length >= 3) {
            int firstMin, secondMin;
            firstMin = secondMin = Integer.MAX_VALUE;
            for (int num : nums) {
                if (num <= firstMin) {
                    firstMin = num;
                } else if (num <= secondMin) {
                    secondMin = num;
                } else  {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{2,1,5,0,4,6}));
        System.out.println(increasingTriplet(new int[]{1}));
        System.out.println(increasingTriplet(new int[]{-1,-2,0,1,8}));
        System.out.println(increasingTriplet(new int[]{1,2,3,4,5}));
        System.out.println(increasingTriplet(new int[]{5,4,3,2,1}));
        System.out.println(increasingTriplet(new int[]{0,4,2,1,0,-1,-3}));
        System.out.println(increasingTriplet(new int[]{5,2,4,1,5,2,2}));
        System.out.println(increasingTriplet(new int[]{20,100,10,12,5,13}));
        System.out.println(increasingTriplet(new int[]{1,1,1,1}));
    }
}
