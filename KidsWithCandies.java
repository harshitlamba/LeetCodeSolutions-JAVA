import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] candies = new int[]{12,1,12};
        int extraCandies = 15;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
