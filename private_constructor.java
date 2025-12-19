class Math {

    private Math() {
        System.out.println("Private constructor called");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class private_constructor {
    public static void main(String[] args) {

        int sum = Math.add(10, 20);
        int product = Math.multiply(5, 4);

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}