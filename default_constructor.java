import java.util.Scanner;
class sum{
    int n1,n2,s;
    sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        n1=in.nextInt();
        System.out.print("Enter the 2nd number : ");
        n2=in.nextInt();
        s=n1+n2;
    }
    void display(){
        System.out.println("The sum of "+n1+" and "+n2+" is = "+s);
    }

}
public class default_constructor {
    public static void main(String[] args) {
        sum obj = new sum();
        obj.display();
    }
}
