public class InsertionSort {
    public static void main(String[] args){
        int[] intArray = {2, 3, 4,6,23, -4, 54};
        //We divide the list into a sorted and unsorted partition
        //When we begin the unsortedPartition index is 1
        for(int unsortedPartitionIndex = 1;unsortedPartitionIndex<intArray.length;unsortedPartitionIndex++){
            //now we'll find the index with which we will switch the inserting element
            //now we'll find traverse the sorted partition from right to left
            int current = intArray[unsortedPartitionIndex];
            int checkIndex = unsortedPartitionIndex -1;
            while(checkIndex>=0 && intArray[checkIndex]>current){
                intArray[checkIndex+1] = intArray[checkIndex];
                checkIndex = checkIndex-1;
            }

            intArray[checkIndex+1]= current;
        }
        /*Printing the array completely */
        for(int j =0;j<intArray.length;j++){
            System.out.println(intArray[j]);
        }
    }
}
