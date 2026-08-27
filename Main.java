import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of the day: ");
        int day = input.nextInt();

        while (day>=0|| day<=31) {
            if(day % 2 == 0){
                System.out.print("Allowed to go out.");
                break;
            }
            else{
                System.out.print("Not allowed to go out.");
                break;
            }
        }
    }
}