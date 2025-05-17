class CheckPositiveNegative{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String result = n == 0 ? "Num is zero" : n>0 ? "Num is positive": "Num is negative";
        System.out.println(result);
    }
}