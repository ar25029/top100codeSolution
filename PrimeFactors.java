public class PrimeFactors {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                n = n/i;
            }
        }
    }
}
