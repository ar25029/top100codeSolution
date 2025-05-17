public class GreatestTwo {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        if(n1==n2){
            System.out.println("euqal number");
        }
        else if(n1>n2){
            System.out.println(n1+" is greatest");
        }
        else{
            System.out.println(n2+" is greatest");
        }
    }
}
