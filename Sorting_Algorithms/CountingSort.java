class CountingSort{
    public static void countingSort(int[] arr){
        //first get the largest number
        int largest = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int[] count = new int[largest+1];
        //add the count to index
        for(int i = 0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //insert into original array
        int j = 0;//for original array indexing
        for(int i = 0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
    public static void main(String[] args){
        int[] arr = {2, 4, 5,2, 9,4,6,3,6,9};
        //note the range of numbers is quite small here
        countingSort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}