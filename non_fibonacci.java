package clg_assignment;
import java.util.Scanner; 
public class non_fibonacci {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n term of non fibonacci series : ");
        int n=in.nextInt();
        non_fibo(n);
    }
    static void non_fibo(int n){
        int a = 0, b = 1, c = a + b,count = 0 ,flag = 1;
        System.out.println("Non-Fibonacci numbers upto " + n + " are: ");
        while (flag<n) 
		{
            while (flag == c) 
			{
                a = b;
                b = c;
                c = a + b;
                flag++;
            }
            while(flag<c && flag<=n)
            {
            System.out.println(flag + ", ");
            flag++;
            } 
        }
    }
}
