public class SumNaturalRange {

    public static int sumNatural(int n1, int n2){
        return (n2*(n2+1)/2) - (n1 * (n1+1)/2);
    }
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        System.out.println(sumNatural(n1, n2));
    }
}
