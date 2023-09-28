package Easy.PalindromeNumber;

public class PalindromeNumber{
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if( x == 0){
            return true;
        }
        int num = 0;
        int temp = x;
        while(x != 0){
            num *= 10;
            num += x % 10;
            x /= 10;
            if(num == temp){
                return true;
            }
        }
        
        return false;
    }
}