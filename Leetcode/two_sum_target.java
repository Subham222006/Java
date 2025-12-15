import java.util.Scanner;
public class two_sum_target{
    public static void main(String[] arg){
           Scanner in = new Scanner(System.in);
           System.out.println("How many numbers you want to store : ");
           int n=in.nextInt();
           System.out.println("Enter the array elemnts : ");
           int[] a=new int[n];
           for(int i=0;i<n;i++)
           {
                a[i]=in.nextInt();
           }
           System.out.println("Your entered array elements are : ");
           for(int i=0;i<n;i++)
           {
            System.out.println(a[i]+" ");
           }
           System.out.println("Enter the target element : ");
           int target=in.nextInt();
           int count=0;
           for(int i=0;i<n;i++)
           {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==target)
                {
                    System.out.println("["+ i +", "+j+"]");
                    count=1;
                    break;
                }
            }
           }
           if(count==0)
           {
            System.out.println("Targeted element is not found in array.");
           }

    }
}
