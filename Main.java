import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] arr = {23,65,87,90};
        swap( arr,2,3);
        System.out.print(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index2, int index3){
        int temp = arr[index2];
        arr[index2] = arr [index3];
        arr[index3] = temp;
    }
    
}