import java.util.Scanner;
interface A{
    void name();
    void age();
}
interface B{
    void height();
}
interface C{
    void ph_no();
    void address();
    void display();

}
class D implements A,B,C{
Scanner in = new Scanner(System.in);
String name,add_name;
int age;
float hei;
double ph_no;
    public void name(){
        System.out.print("Enter your name : ");
        name = in.nextLine();
    }
    public void age(){
        System.out.print("Enter your age : ");
        age = in.nextInt();
    }
    public void height(){
        System.out.print("Enter your height : ");
        hei = in.nextFloat();
    }
    public void ph_no(){
        System.out.print("Enter your phone number : ");
        ph_no = in.nextInt();
        in.nextLine();
    }
    public void address(){
        System.out.print("Enter your address : ");
        add_name = in.nextLine();

    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Height : "+hei);
        System.out.println("Phone Number : "+ph_no);
        System.out.println("Address : "+add_name);

    }

}
public class multiple_interface_inheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.name();
        obj.age();
        obj.height();
        obj.ph_no();
        obj.address();
        obj.display();
    }
}
