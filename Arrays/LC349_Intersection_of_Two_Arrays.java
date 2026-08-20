/**
 * LC349_Intersection_of_Two_Arrays
 */
 import java.util.HashSet;
import java.util.Set;
public class LC349_Intersection_of_Two_Arrays {

  


    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }
        
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }
        
        return result;
    }

public static void main(String[] args) {
LC349_Intersection_of_Two_Arrays s=new LC349_Intersection_of_Two_Arrays();
int [] arr=s.intersection(new int[]{1,2,2,1},new int[]{2,2});
for (int i : arr) {
   System.out.println(i);
}
}
}