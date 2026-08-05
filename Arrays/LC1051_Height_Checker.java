import java.util.Arrays;

public class LC1051_Height_Checker {

   
    public int heightChecker(int[] height) {
        int [] expected=height.clone();
        Arrays.sort(expected);
        int count=0;
  
             for(int i=0;i<expected.length;i++){
            if(expected[i]!=height[i]){
                count++;
            }
        }
       return count; 
    }
    public static void main(String [] args){
       LC1051_Height_Checker  s= new LC1051_Height_Checker();
        int x=s.heightChecker(new int [] {1,1,4,2,1,3});
        System.out.println(x);

    }
}