//Check a number is even or odd
package clg_assignment;
import java.util.Scanner;
public class demo{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);   //this is use take input from keyboard
       System.out.print("Enter the value of n term of fibonacci series : ");    //here i don't use println because if i use println then the taking input postion is the next line
       int n=in.nextInt();    //take input 
       System.out.println("The fibonacci sereis is : ");
       int a=0,b=1,c;
    //    if(a%2==0){
    //     System.out.println( " The number "+ a + " is a even number");
    //    }
    //    else{
    //     System.out.println( a + " is a odd number");
    //    }
        System.out.print(  a + "," + b);
        for(int i=2;i<n;i++){
            c =a+b;
            System.out.print("," +c);
            a=b;
            b=c;

        }
    }
}