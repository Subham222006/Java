import java.util.Scanner;
class shape{
    void area_circle(double r){
    double area = Math.PI * r * r;        
    System.out.println("The area of the Circle is = "+area);
    }
    void perimeter_circle(double r){
        double perimeter= 2 * Math.PI * r;
        System.out.println("The perimeter of the circle is = "+perimeter);
    }
    void area_square(double side){
        double area = side * side;
        System.out.println("The area of the Square is = "+area);
    }
    void perimeter_square(double side){
        double perimeter = 4 * side;
        System.out.println("The perimeter of the Square is = "+perimeter);
    }
    void area_rectangle(double l, double b){
        double area = l * b;
        System.out.println("The area of the Rectangle is = "+area);

    }
    void perimeter_rectangle(double l, double b){
        double perimeter = 2 * (l + b);
        System.out.println("The perimeter of the Rectangle is = "+perimeter);

    }
}
class circle extends shape{
    void area_perimeter(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of Radius : ");
        double r= in.nextInt();
        area_circle(r);
        perimeter_circle(r);
    }

}
class square extends shape{
    void area_perimeter(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of Side : ");
        double side= in.nextInt();
        area_square(side);
        perimeter_square(side);
    }
}
class rectangle extends shape{
    void area_perimeter(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of length : ");
        double l= in.nextInt();
        System.out.print("Enter the value of breadth : ");
        double b= in.nextInt();
        area_rectangle(l,b);
        perimeter_rectangle(l,b);
    }
}
public class hierarchical_inheritance {

    public static void main(String[] args) {
        while(true){
        System.out.println("Press 1. To find the area and perimeter of Circle ");
        System.out.println("Press 2. To find the area and perimeter of Square ");
        System.out.println("Press 3. To find the area and perimeter of Rectangle ");
        System.out.println("Press 4. To Exit");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your choice : ");
        int ch = in.nextInt();
        switch (ch) {
            case 1:
                circle obj1= new circle();
                obj1.area_perimeter();
                break;
            case 2:
                square obj2= new square();
                obj2.area_perimeter();
                break;
            case 3:
                rectangle obj3= new rectangle();
                obj3.area_perimeter();
                break;
            case 4:
                System.exit(0);
            default:
                break;
        }
       }
    }
}