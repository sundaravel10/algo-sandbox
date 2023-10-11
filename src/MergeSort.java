import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {8,2,4,7,3,10,9,5,6,1};
        System.out.println("Elements of Array Before Sorting " + Arrays.toString(array));
        mergeSort(array);
        System.out.println("Elements of Array After Sorting " + Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {
        int arrLength = array.length;
        if(arrLength <= 1){
            return;
        }

        int middle = arrLength / 2;
        int rightLength = arrLength - middle;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[rightLength];
        System.arraycopy(array,0,leftArray,0, middle);
        System.arraycopy(array, middle,rightArray,0,rightLength);

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array,leftArray,rightArray);
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < leftArray.length && j < rightArray.length){
            if(leftArray[i] <= rightArray[j]){
                array[k++] = leftArray[i++];
            }else{
                array[k++] = rightArray[j++];
            }
        }

        while(i < leftArray.length){
            array[k++] = leftArray[i++];
        }

        while(j < rightArray.length){
            array[k++] = rightArray[j++];
        }
    }
}