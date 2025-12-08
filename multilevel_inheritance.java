import java.util.Scanner;
    class input{
        int num;
        void inp()
        {
            Scanner in= new Scanner(System.in);
            System.out.print("Enter a number for various check : ");
            num=in.nextInt();
        }
    }
    class even_odd extends input{
        void check_even_or_odd()
        {
            if(num%2==0){
                System.out.println(num+" is a even number.");
            }
            else{
                System.out.println(num+" is a odd number.");
            }
        }
    }
    class palindrome extends even_odd{
        void check_palindrome_or_not()
        {
            int a,rem,sum=0;
            a=num;
            while(a>0){
                rem=a%10;
                sum=(sum*10)+rem;
                a=a/10;
            }
            if(sum==num){
                System.out.println(num+" is a palindrome number.");
            }
            else{
                System.out.println(num+" is not a palindrome number.");
            }
        }
    }
    class armstrong extends palindrome{
        void check_armstrong_or_not(){
            int a,rem1,count1=0,sum1=0;
            a=num;
            while(a>0){
                rem1=a%10;
                count1++;
                a=a/10;
            }
            a=num;
            while (a>0) {
                rem1=a%10;
                sum1= sum1 +(int) Math.pow(rem1, count1);
                a=a/10;
            }
            if(sum1==num){
                System.out.println(num+" is a armstrong number.");
            }
            else{
                System.out.println(num+" is not a armstrong number.");
            }  
        }
    }
    public class multilevel_inheritance {
    public static void main(String[] args) {
        armstrong obj= new armstrong();
        obj.inp();
        obj.check_even_or_odd();
        obj.check_palindrome_or_not();
        obj.check_armstrong_or_not();
    }
}
