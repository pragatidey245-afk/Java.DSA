import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //input diagonals.
        System.out.print("Enter the value of first diagonal: ");
        int d1 = input.nextInt();

        System.out.print("Enter the value of second diagonal: ");
        int d2 = input.nextInt();

        int area = (d1 * d2) / 2;

        System.out.print("The area of Rhombus is: " + area);
    }
}