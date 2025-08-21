import java.util.Scanner;
public class leap_year {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year to check the year is leap year or not : ");
        int year = in.nextInt();
        leap(year);
    }
    static void leap(int year){
    if(year%100==0){
        if(year%400==0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
    else{
        if(year%4==0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}
}

