public class Armstrong {

    public static int checkLen(int n){
        int len = 0;

        while(n!=0){
            len++;
            n=n/10;
        }
        return len;
    }

    public static int isArmstrong(int n){
        int lenth = checkLen(n);
        int sum =0;
        while(n!=0){
            int rem = n % 10;
            sum = sum + (int)Math.pow(rem, lenth);
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        
        // armstrong if 371 = 3^n + 7^n + 1^n here n is length of digits like 3^3 + 7^3 + 1^3
        int n = Integer.parseInt(args[0]);

        if(n==isArmstrong(n)){
            System.out.println(n+ " is Armstrong");
        }
        else{
            System.out.println(n+" is not Armstrong");
        }
    }
}
