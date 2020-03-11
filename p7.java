import java.util.Scanner;

public class p3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float side;
        Square ob1;
        for(int i=0;i<10;i++){
            System.out.print("Enter Side of "+(i+1)+"st square: ");
            side = in.nextFloat();
            ob1 = new Square(side);
        }
        
 }
}

class Rectangle{
    float length,breadth;
    Rectangle(float length,float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void displayArea(){ 
        System.out.println("Area is "+(length*breadth));
    }
    void displayPrimeter(){ 
        System.out.println("Primeter is "+(2*(length+breadth)));
    }
}

class Square extends Rectangle{
    Square(float s){
        super(s,s);
        super.displayArea();
        super.displayPrimeter();
    }
}