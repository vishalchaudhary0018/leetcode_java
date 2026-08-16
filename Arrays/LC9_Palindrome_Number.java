/**
 * LC9_Palindrome_Number
 */
public class LC9_Palindrome_Number {

  
    public boolean isPalindrome(int x) {
        boolean result=false;
        int original=x;

        int reverse=0;
        int digit=0;
     
       while(x>0){
             digit=x%10;
        reverse=(reverse*10)+digit;
             x=x/10;
           
       }
         if(original==reverse){
                result=true;
             }
       return result;
    }
    public static void main(String[] args) {
      LC9_Palindrome_Number s= new LC9_Palindrome_Number();
      boolean r=s.isPalindrome(121);
      System.out.println(r);
    }
}
