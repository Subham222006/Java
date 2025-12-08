import java.lang.*;
class CommandlineTest{
    public static void main(String[] args) {
        int count, i=0;
        String string;
        count = args.length;
        System.out.println("No. of arguments is = "+count);
        while(i<count){
            string = args[i];
            i++;
            System.out.println(i+" : Argument is "+string);
        }
    }

}