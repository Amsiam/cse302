import java.util.Scanner;
public class p2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Teacher ob1 = new Teacher();
        Student ob2 = new Student();
        System.out.println("Enter Teacher info: ");
        System.out.print("Enter name: ");
        ob1.name =  in.nextLine();
        System.out.print("Enter Age: ");
        ob1.age = Integer.parseInt(in.nextLine());
        //in.nextLine();
        System.out.print("Enter Qualification: ");
        ob1.qualification = in.nextLine();
        ob1.displayTeacherInfo();
        System.out.println("Enter Student info: ");
        System.out.print("Enter name: ");
        ob2.name = in.nextLine();
        System.out.print("Enter Age: ");
        ob2.age = in.nextInt();
        System.out.print("Enter Roll: ");
        ob2.roll = in.nextInt();
        ob2.displayStudentInfo();
        
    }
}
class Person{
    String name;
    int age;
}
class Teacher extends Person{
    String qualification;
    void displayTeacherInfo(){ 
        System.out.println("Name:"+name+"\nAge: "+age+"\nQualification: "+qualification);
    }
}

class Student extends Person{
    int roll;
    void displayStudentInfo(){ 
        System.out.println("Name:"+name+"\nAge: "+age+"\nRoll: "+roll);
    }
}