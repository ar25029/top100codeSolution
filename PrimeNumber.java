public class PrimeNumber {

    public static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }

        if(n==2){
            return true;
        }

        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if(isPrime(n)){
            System.out.println(n+" is prime");
        }
        else{
            System.err.println(n+" is not prime");
        }
    }
}
