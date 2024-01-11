public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxArea = Integer.MIN_VALUE;
        while (i < j) {
            int length = j-i;
            int breadth = Math.min(height[i],height[j]);
            int newArea = length*breadth;
            if (newArea > maxArea) {
                maxArea = newArea;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,1}));
        System.out.println(maxArea(new int[]{1,0}));
        System.out.println(maxArea(new int[]{0,1,1,0,1}));
        System.out.println(maxArea(new int[]{1,110,6,2,100,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,3,2,5,25,24,5}));
    }
}
