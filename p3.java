
import java.util.Scanner;


public class p3{
    public static void main(String[] arg){
        Student ob = new Student();
        ob.displayinfo();
        Scanner in = new Scanner(System.in);
        int age;
        String name,address;
        System.out.println("Enter student name: ");
        name = in.nextLine();
        System.out.println("Enter age name: ");
        age = in.nextInt();
        ob.setinfo(name,age);
        ob.displayinfo();
        in.nextLine();
        System.out.println("Enter address name: ");
        address = in.nextLine();
        ob.setinfo(name,age,address);
        ob.displayinfo();
    }
}
class Student{
    int age;
    String name,address;
    Student(){
        age = 0;
        name = "Unknown";
        address = "Not available";
    }
    void setinfo(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    } 
    void setinfo(String name,int age){
        this.name = name;
        this.age = age;
    }
    void displayinfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
    }
}