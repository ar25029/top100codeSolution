public class PrimeRange {

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
        int n1= Integer.parseInt(args[0]);
        int n2= Integer.parseInt(args[1]);

        while(n1<=n2){
            if(isPrime(n1)){
                System.out.print(n1+" ");
            }
            n1++;
        }
    }
}
