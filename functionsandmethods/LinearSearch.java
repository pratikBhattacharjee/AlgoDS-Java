// This program and searching algorithm has a time complexity is O(n)
public class LinearSearch {
    public static int linear_search(int[] arr, int key){
        //Returns the index is the key is present at, if not found returns -1
        for (int i = 0;i< arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] number = {2, 3, 4, 5, 6, 7, 9, 12, 14, 18};
        int key = 42;
        // Lets call the linear search function
        System.out.println(linear_search(number, key));

    }
}
