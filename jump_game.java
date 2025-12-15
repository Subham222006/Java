import java.util.Scanner;
public class jump_game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a;
        a=new int[10];
        System.out.println("How many numbers you want to store : ");
        int n=in.nextInt();
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Your entered array elements are : \n");
         for(int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }
        int maxIndex=0;
        for(int i=0;i<n;i++){
            if(i>maxIndex){
                System.out.println(false);
                return;   
            }
            if (i + a[i] > maxIndex)
            maxIndex=i+a[i];
        }
        System.out.println(true);
    }
}
