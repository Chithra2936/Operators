import java.util.Scanner;
public class AddSubMulDiv{
    public static void main(String[] args){
        int first,second,add,subtract,multiple;
        float divide;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Numbers:");
        first=sc.nextInt();
        second=sc.nextInt();
        sc.close();
        add=first+second;
        subtract=first-second;
        multiple=first*second;
        divide=(float)first/second;

        System.out.println("Sum="+ add);
        System.out.println("Difference="+subtract);
        System.out.println("Multiplication="+multiple);
        System.out.println("Division="+divide);
    }
}