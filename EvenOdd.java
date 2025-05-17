public class EvenOdd {
    public static boolean isEven(int n){
        return n%2==0;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if(n==0){
            System.out.println("Num is zero");
            return;
        }
        System.out.println("Num is "+ (isEven(n) ? "Even" : "Odd"));
    }
}
