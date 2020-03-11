public class p1{
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();
        System.out.println("By object of parent class: ");
        ob1.display();
        System.out.println("By object of child class: ");
        ob2.show();
        System.out.println("By object of child class: ");
        ob2.display();
        
}
}

class A{
    void display(){ 
        System.out.println("This is parent class");
    }
}

class B extends A{
    void show(){ 
        System.out.println("This is child class");
    }
}