import java.util.*;

public class LargestNumber {
        public static void main(String[] args){
            int[] numbers = {12, 23, 45, 91, 83, 98, 62};
            // Find the largest number
            System.out.println(return_largest(numbers));
        }
        public static int return_largest(int[] arr){
            if (arr.length < 1){
                return -1;
            }
            int largest = Integer.MIN_VALUE;
            for(int i = 0;i< arr.length;i++){
                if( arr[i]> largest){
                    largest = arr[i];
                }
            }
            return largest;
        }
}
