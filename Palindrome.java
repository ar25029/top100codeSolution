public class Palindrome{

    // we can check by returning the  reverse number 
    public static int reverse(int num){
        int rev = 0;
        while (num!=0) {
            int rem = num % 10;
            rev = rev*10+rem;
            num = num/10;
        }
        return rev;
    }

    // or we can check here directly and then return boolean value
    public static boolean isPalindrome(int n){
        int temp = n;

        int rev =0;
        while(temp!=0){
            int rem = temp%10;
            rev = rev  * 10 + rem;
            temp=temp/10;
        }

        if(n==rev){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if(n== reverse(n)){
            System.out.println(n+" is palindrome");
        }
        else{
            System.out.println(n+" is not palindrome");
        }

        // if(isPalindrome(n)){
        //      System.out.println(n+" is palindrome");
        // }
        // else{
        //     System.out.println(n+" is not palindrome");
        // }

    }
}