
public class LC724_Find_Pivot_Index {

  
    public int pivotIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int leftsum=0;
            int rightsum=0;
            for(int j=0;j<i;j++){
                leftsum=leftsum+nums[j];
            }
            
              for(int j=i+1;j<nums.length;j++){
                rightsum=rightsum+nums[j];
            }

            if(leftsum==rightsum){
                return i;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        LC724_Find_Pivot_Index  s= new LC724_Find_Pivot_Index ();
        int x=s.pivotIndex(new int []{1,7,3,6,5,6});
        System.out.println(x);
    }
}

