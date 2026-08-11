
public class LC268_Missing_Number {

   
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int i=0;i<nums.length;i++ ) {
           actualSum=actualSum+nums[i];
        }

        return expectedSum-actualSum;
}
public static void main(String [] args){
   LC268_Missing_Number s= new LC268_Missing_Number();
    int x=s.missingNumber(new int []{3,0,1});
    System.out.println(x);
}
}
