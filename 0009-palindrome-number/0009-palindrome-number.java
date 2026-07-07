import java.util.Scanner;
public class Solution {
    public static boolean isPalindrome(int x) {
        if (x<0){
         return false ;
        }
       int original = x;
        int revnum = 0; 
        int sign = x<0?-1:1;
         x = Math.abs(x);
           while(x>0){
             int ld =x%10;
            if (revnum > (Integer.MAX_VALUE - ld) / 10) {
                return false; 
            }
            revnum=(revnum*10)+ld;
            x=x/10;
        }
 return original == revnum;
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int x =sc.nextInt();
        sc.close();
     if (isPalindrome(x)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}