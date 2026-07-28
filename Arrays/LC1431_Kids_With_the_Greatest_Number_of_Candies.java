 import java.util.ArrayList;
import java.util.List;
public class LC1431_Kids_With_the_Greatest_Number_of_Candies {
  



    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = candies[0];

        
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {

            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {

      LC1431_Kids_With_the_Greatest_Number_of_Candies s = new LC1431_Kids_With_the_Greatest_Number_of_Candies();

        List<Boolean> answer =
                s.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);

        for (boolean value : answer) {
            System.out.println(value);
        }
    }
}

