import java.util.Scanner;
public class rounding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double x = a / b;
            int c;
            if (x >= 0)
                c = (int)(x + 0.5);
            else
                c = (int)(x - 0.5);
            System.out.print(c + " ");
        }
    }
}