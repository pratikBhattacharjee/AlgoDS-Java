public class ReverseArray {
    public static int[] reverse_array(int[] arr){
        if (arr.length < 1){
            return null;
        }
        //allocating 1 pointer to the 0 index and another to the last index
        int pointer1 = 0;
        int pointer2 = arr.length-1;
        int temp;
        while(pointer1<pointer2){
            //Swap the values pointed to by each pointer
            temp = arr[pointer1];
            arr[pointer1] = arr[pointer2];
            arr[pointer2] = temp;

            pointer1++;
            pointer2--;

        }
        return arr;
    }  
    public static void main(String[] args){
        int[] numbers = {23, 45, 68, 29, 29, 79};
        reverse_array(numbers);
        for(int i = 0;i< numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
