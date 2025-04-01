public class Boolean {
    public static void main(String[] args) {
        boolean a, b, c, d;
        a = true;
        b = true;
        c = true;
        d = true;

        if (a || b && c){
            System.out.println("a || b && c");
        }
        if ((a || b) && c){
            System.out.println("(a || b) && c");
        }
        if (a && b || c && d){
            System.out.println("a && b || c && d");
        }
        if ((a && b) || (c && d)){
            System.out.println("(a && b) || (c && d)");
        }
    }
}
