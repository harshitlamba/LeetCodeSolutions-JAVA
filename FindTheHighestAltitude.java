public class FindTheHighestAltitude {

    public static int largestAltitude(int[] gain) {
        int highestAlt, presentAlt;
        highestAlt = presentAlt = 0;
        for (int i = 0; i < gain.length; i++) {
            presentAlt += gain[i];
            highestAlt = highestAlt < presentAlt ? presentAlt : highestAlt;
        }
        return highestAlt;
    }

    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
        System.out.println(largestAltitude(new int[]{5}));
        System.out.println(largestAltitude(new int[]{0,0}));
        System.out.println(largestAltitude(new int[]{-5,1,1,1,1,1}));
    }
}
