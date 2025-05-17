public class SumNatural {

    // public static int sumNNatural(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     return n + sumNNatural(n-1);
    // }

    public static int sumNNatural(int n){
        return n * (n+1) /2;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(sumNNatural(n));
    }
}
