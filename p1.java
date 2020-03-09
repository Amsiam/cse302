
import java.util.Scanner;

public class p1{
    public static void main(String[] arg){
        Display ob = new Display();
        Scanner in = new Scanner(System.in);
        int n;
        String c;
        System.out.println("Enter an integer and a char: ");
        n = in.nextInt();
        in.nextLine();
        c = in.nextLine();
        ob.display(n,c);
        ob.display(c,n);
    }
}
class Display{
    void display(int n, String c){
        System.out.println(n+"=>"+c);
    }
    void display(String c,int n){
        System.out.println(c+"=>"+n);
    }
}