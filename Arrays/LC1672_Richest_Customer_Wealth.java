public class LC1672_Richest_Customer_Wealth {
   public int maximumWealth(int[][] account) {
      int max = 0;
      for (int i = 0; i < account.length; i++) {
         int innerSum=0;
         for (int j = 0; j < account[i].length; j++) {
            innerSum = innerSum + account[i][j];
         }
        
         if(max < innerSum){
             max=innerSum;
         }
      }

 return max;
    
   }

   public static void main(String[] args) {
      LC1672_Richest_Customer_Wealth c = new LC1672_Richest_Customer_Wealth();
      int richCustomer = c.maximumWealth(new int[][] { { 1,2,1 }, { 1, 2, 3 } });
      System.out.println(richCustomer);
   }
}
