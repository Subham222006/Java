import java.util.Scanner;
class copy{
    String n;
    int a;
    copy(String name, int age){
        this.n=name;
        this.a=age;
    }
    copy(copy obj){
        this.n=obj.n;
        this.a=obj.a;
    }

}

public class copy_constructor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name=in.nextLine();
        System.out.print("Enter Age : ");
        int age=in.nextInt();
        copy object1=new copy(name,age);
        System.out.println("Your Name is "+object1.n);
        System.out.println("Your age is "+object1.a);
        System.out.println();
        System.out.println("*/Copy Constructor/*");
        copy object2=new copy(object1);
        System.out.println("Your Name is "+object2.n);
        System.out.println("Your age is "+object2.a);
    }
}
