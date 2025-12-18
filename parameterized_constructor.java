import java.util.Scanner;
class sum{
    int s;
    sum(int n1, int n2){
        this.s=n1+n2;
    }
    void display(int a,int b){
        System.out.print("The sum of "+a+" and "+b+" is = "+s);
    }
}
public class parameterized_constructor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int n1=in.nextInt();
        System.out.print("Enter the 2nd number : ");
        int n2=in.nextInt();
        sum obj = new sum(n1,n2);
        obj.display(n1,n2);
    }
}
