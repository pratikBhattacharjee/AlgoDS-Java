public class Binaryseach {

    public static int binarysearch(int[] arr, int key){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (arr[mid] == key){
                return mid;
            }else if(arr[mid]<key){
                start= mid+1;
            }else{
                end = mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {2, 4, 6, 9,12, 15 };
        int key = 12;
        System.out.println(binarysearch(nums, key));
    }
}
