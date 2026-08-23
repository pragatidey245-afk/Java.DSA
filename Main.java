import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //input height.
        System.out.print("Enter the value of height: ");
        int height = input.nextInt();

        //input base.
        System.out.print("Enter the value of base: ");
        int base = input.nextInt();
        //output area.

        int area = height * base;

        System.out.print("The area of parallelogram is: " + area );
    }
}