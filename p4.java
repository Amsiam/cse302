import java.util.Scanner;
public class p4{
    public static void main(String[] arg){
        Sum ob = new Sum();
        Scanner in = new Scanner(System.in);
        int m,n,o;
        System.out.println("Enter two number: ");
        m = in.nextInt();
        n = in.nextInt();
        ob.sum(m, n);
        System.out.println("Enter Three number: ");
        m = in.nextInt();
        n = in.nextInt();
        o = in.nextInt();
        ob.sum(m, n, o);
    }
}
class Sum{
    void sum(int n, int m){
        System.out.println(n+" + "+m+" = "+(m+n));
    }
    void sum(int n, int m,int o){
        System.out.println(n+" + "+m+" + "+o+" = "+(m+n+o));
    }
}