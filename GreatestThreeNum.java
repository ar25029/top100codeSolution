public class GreatestThreeNum{
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        // System.out.println(Math.max(n1, Math.max(n2, n3)));
        if(n1>n2 && n1>n3){
            System.out.println(n1+" is greatest");
        }else if(n2>n1 && n2>n3){
            System.out.println(n2+" is greatest");
        }else{
            System.out.println(n3+" is greatest");
        }
    }
}