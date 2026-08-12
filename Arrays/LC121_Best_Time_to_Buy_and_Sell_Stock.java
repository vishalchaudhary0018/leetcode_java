

public class LC121_Best_Time_to_Buy_and_Sell_Stock {

   

    public int maxProfit(int[] price) {
        int maxProfit=0;
        int minPrice=price[0];
        for (int i=0; i<price.length;i++){
            
            if (price[i]<minPrice){
                minPrice=price[i];
         
            }
              int profit=price[i]-minPrice;
              if(profit>maxProfit){
                maxProfit=profit;
              }
        }
        return maxProfit;
        
    }
    public static void main(String[] args){
       LC121_Best_Time_to_Buy_and_Sell_Stock  s= new LC121_Best_Time_to_Buy_and_Sell_Stock ();
        int x=s.maxProfit(new int []{7,1,5,3,6,4});
        System.out.println(x);
    }
}