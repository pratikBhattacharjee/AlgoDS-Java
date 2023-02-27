public class SelectionSort {
    public static void main(String[] args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int largest;
        int temp;
        for(int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            largest = 0;
            for(int i = 1;i<=lastUnsortedIndex;i++){
                if(intArray[i]>intArray[largest]){
                    largest = i;
                }
            }
            if(largest != lastUnsortedIndex){
                temp = intArray[largest];
                intArray[largest] = intArray[lastUnsortedIndex];
                intArray[lastUnsortedIndex] = temp;
            }
        }
        /*Printing the array completely */
        for(int j =0;j<intArray.length;j++){
            System.out.println(intArray[j]);
        }
    }
}
