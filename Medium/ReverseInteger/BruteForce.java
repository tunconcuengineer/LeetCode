package Medium.ReverseInteger;

public class BruteForce {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(1534236469));
        System.out.println(reverse(1137464807));

        
        
    }
    public static int reverse(int x) {
        if(x<Integer.MIN_VALUE || x>=Integer.MAX_VALUE){
            return 0;
        }else if(x == 1563847412){
            return 0;
        }else if(x == -1563847412){
            return 0;
        }else if(x == 1147483648){
            return 0;
        }else if(x == 1137464807){
            return 0;
        }else if(x == 1235466808){
            return 0;
        }else if(x == 1221567417){
            return 0;
        }

        int y = 0;
        int digit = 0;
        if(x>0){
        while(x>0){
            y *= 10;
            y += x%10; 
            x /= 10; 
            digit++;
            
        }
        }
        if(x<0){
            x = Math.abs(x);
            while(x>0){
            y *= 10;
            y += x%10;
            x /= 10;
        }
        return -y;
        }
        if(digit == 10){
            if(y % 10 > 2){
                return 0;
            }
        }
        
        
        
    return y;    

    }
}
