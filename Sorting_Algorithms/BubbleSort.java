public class BubbleSort{
    public static void main(String[] args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for (int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex>0;lastUnsortedIndex--){
            for (int i = 0;i<lastUnsortedIndex;i++){
                if (intArray[i] > intArray[i+1]){
                    int temp =  intArray[i];
                    intArray[i] =   intArray[i+1];
                    intArray[i+1] = temp;
                }
            }
        }
        for(int j =0;j<intArray.length;j++){
            System.out.println(intArray[j]);
        }
    }
    public static void main(String[] args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for (int i = )
    }
}