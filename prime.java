package clg_assignment;
import java.util.Scanner;
public class prime{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number check the number is prime or not : ");
        int num = in.nextInt();
        int i=2;
        int a=num;
        while(i<= num/2)
        {
            if(num%i==0)
            {
                System.out.print(num + " is not a prime number.");
                break;
            }
            i++;
        }
        if(i>num/2)
        {
             System.out.print(num + " is a prime number."); 
        }

    }
}