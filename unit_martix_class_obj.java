import java.util.Scanner;

public class unit_martix_class_obj {

static class matrix{

    void unit(int r,int c){

        Scanner in = new Scanner(System.in);

        int mat[][] = new int[r][c];

        System.out.println("Enter the elements if the matrix: ");

        for(int i=0; i<r; i++){

            for(int j=0; j<c; j++){

                mat[i][j]=in.nextInt();

            }

        }

        System.out.println("Your entered elements of the matrix are : ");

        for(int i=0; i<r; i++){

            for(int j=0; j<c; j++){

               System.out.print(mat[i][j]+" ");

            }

            System.out.println();

        }

        int count=0;

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
               if(i==j && mat[i][j]==1 || i!=j && mat[i][j]==0){
                    count++;
               }                

            }
        }
        if(count==r*r){
            System.out.println("Tme matrix is Unit Matrix");
        }
        else{
            System.out.println("The matrix is not Unit Matrix");
        }
    }
}
public static void main(String[] args) {

    matrix obj = new matrix();

    Scanner in = new Scanner(System.in);

    System.out.print("Enter the number of rows of the marix : ");

    int r=in.nextInt();

    System.out.print("Enter the number of columns of the marix : ");

    int c=in.nextInt();

    if(r==c){

        obj.unit(r,c);

    }

    else{

        System.out.print("Row and Columns are not same of the matrix so the Unit Matrix is not possible.");

    }
  }
}