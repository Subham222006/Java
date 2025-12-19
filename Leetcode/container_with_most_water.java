import java.util.Scanner;
public class container_with_most_water{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers you want to store : ");
        int n=in.nextInt();
        int[] a;
        a=new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Your entered the elements are : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+", ");
        }
        int left,right,max=0,s;
        for(int i=0;i<n;i++){
            left=a[i];
            for(int j=i+1;j<n;j++){
                right=a[j];
                if(left<right){
                    s=left*(j-i);
                }
                else{
                    s=right*(j-i);
                }
                if(max<s){
                    max=s;
                }
            }
        }
        System.out.println("\nMaximum water container area = " + max);


    }
}