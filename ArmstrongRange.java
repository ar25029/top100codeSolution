public class ArmstrongRange {
    public static int checkLen(int n) {
        int len = 0;

        while (n != 0) {
            len++;
            n = n / 10;
        }
        return len;
    }

    public static int isArmstrong(int n) {
        int lenth = checkLen(n);
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + (int) Math.pow(rem, lenth);
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        for (int i = n1; i <= n2; i++) {
            if (i == isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
