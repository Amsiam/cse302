
import java.util.Scanner;

public class p2{
    public static void main(String[] arg){
        Area ob = new Area();
        Scanner in = new Scanner(System.in);
        int n,a,b;
        System.out.println("Enter Side of square: ");
        n = in.nextInt();
        ob.area(n);
        System.out.println("Enter two Side of rectangular: ");
        a = in.nextInt();
        b = in.nextInt();
        ob.area(a,b);
    }
}
class Area{
    void area(int n){
        System.out.println("Area of square is : "+n*n);
    }
    void area(int a,int b){
        System.out.println("Area of Rectangle is : "+a*b);
    }
}