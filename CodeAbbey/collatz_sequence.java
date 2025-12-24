import java.util.Scanner;
public class collatz_sequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int count=0,a1;
            while(a!=1){
                if(a%2==0){
                    a=a/2;
                    count++;
                }
                else{
                    a=3*a+1;
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}