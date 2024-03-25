import java.util.Arrays;
import java.util.Scanner;
class Solution{
    public static void main(String[] main){
        Scanner input = new Scanner(System.in);
        int arrayLength = input.nextInt();

        //store in an array as per instruction
        int[] arr = new int[arrayLength];
        for (int i = 0;i<arrayLength;i++){
            arr[i] = input.nextInt();
        }
        int sum = Arrays.stream(arr).sum();
        System.out.print(sum);

    }
}