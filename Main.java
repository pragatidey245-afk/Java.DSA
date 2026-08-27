import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of number: ");
        int number = input.nextInt();

        System.out.println("The armstrong number is: " + fun(number));
    }

    static boolean fun(int num){
        int sum = 0;
        int original = num;
        int digits = String.valueOf(num).length();
        while(num > 0){
            int last = num % 10;
            sum += (int)Math.pow(last,digits);
            num /= 10;
        }

        return original == sum;
    }
}