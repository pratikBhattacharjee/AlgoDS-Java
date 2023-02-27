public class BinarySearch {
    //This has a time complexity of O(log(n))
    public static int binary_search(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start<= end){
            int mid = (start+end)/2;
            if( arr[mid] == key){
                return mid;
            }else if( arr[mid]<key){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] numbers = {12, 23, 45, 91, 83, 98, 62};
            // Find the number using binary search number
            System.out.println(binary_search(numbers, 23));
    }
}
