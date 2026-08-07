import java.util.Arrays;

public class LC88_Merge_Sorted_Array {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] mergeArr= new int [m+n];
        for (int i=0; i<m;i++){
           
                mergeArr[i]=nums1[i];
            }
             
             for (int j=0; j<n;j++){
            
                mergeArr[m+j]=nums2[j];
           
        
        }
        Arrays.sort(mergeArr); 
        for(int i = 0; i < mergeArr.length ; i++){
    nums1[i] = mergeArr[i];
    System.out.println(i);


} 
    }
    public static void main(String [] args){
        LC88_Merge_Sorted_Array  s =new LC88_Merge_Sorted_Array ();
        s.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
        
    }
}
   
