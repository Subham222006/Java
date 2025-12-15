import java.util.Scanner;
public class median_of_two_sorted_arrays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("How many numbers you to store in 1st array : ");
        int n1=in.nextInt();
        System.out.println("How many numbers you to store in 2nd array : ");
        int n2=in.nextInt();
        int[] a1;
        a1=new int[n1+n2];
        System.out.println("Enter th elements of the 1st array : ");
        for(int i=0;i<n1;i++){
            a1[i]=in.nextInt();
        }

        System.out.println("Enter th elements of the 2nd array : ");
        for(int i=n1;i<n1+n2;i++){
            a1[i]=in.nextInt();
        }

        System.out.println("Now the sorted & merge array of 1st and 2nd arrray is : ");
        for(int i=0;i<n1+n2-1;i++){
            for(int j=i+1;j<n1+n2;j++){
                if(a1[i]>a1[j]){
                    int temp=a1[i];
                    a1[i]=a1[j];
                    a1[j]=temp;
                }
            }
        }
        for(int i=0;i<n1+n2;i++){
            System.out.print(a1[i]+", ");
        }
        int k=(n1+n2);
        if(k%2==0){
            int q=k/2;
            int i=q;
            float sum=(a1[i]+a1[i-1])/2.0f;
            System.out.println("The median of the two sorted arrays is : "+sum);
            }
        else{
            int q=k/2;
            System.out.println("The median of the two sorted arrays is : "+a1[q]);

        }
            
    }
}


