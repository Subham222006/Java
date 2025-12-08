import java.util.Scanner;
public class single_inheritance {
    static class even{
             void check1(int num)
             {
                System.out.println(num+" is a even number");
             }
    }
    static class odd extends even{
            void check2(int num)
             {
                System.out.println(num+" is a odd number");
             }
    }
    public static void main(String[] args) {
        odd a = new odd();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check a number is even or odd: ");
        int num=in.nextInt();
        if(num%2==0){
            a.check1(num);
        }
        else{
            a.check2(num);
        }

    }
}
