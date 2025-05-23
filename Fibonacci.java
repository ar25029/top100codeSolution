public class Fibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        int next = 0;
        for (int i = 2; i <= n; i++) {
            next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
