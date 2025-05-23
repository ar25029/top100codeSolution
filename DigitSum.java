public class DigitSum {

    public static int sumOfDigit(int n){
        int sum = 0;
        while(n != 0){
            int rem = n%10;
            sum += rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(sumOfDigit(n));
    }
}
