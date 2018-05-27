import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Andrew on 07-May-18.
 */
public class Main {

    public static void main(String[] args){

        int[] testArray = new int[10];
        int[] testArray2 = new int[10];

        getIntegers(testArray);
        printArray(testArray);
        testArray2 = sortArray(testArray);
        printArray(testArray2);

    }

    public static void getIntegers(int[] arr1){
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<arr1.length;i++){
            System.out.println("Input a number\r");
            arr1[i] = sc.nextInt();
        }
    }

    public static void printArray(int[] arr1){
        for(int i=0; i<arr1.length;i++){
            System.out.println(arr1[i] + "\r");
        }
    }

    public static int[] sortArray(int[] arr){
        int[] returnArr = new int[arr.length];
        returnArr = arr;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < returnArr.length; i++)

            {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i+1; j < returnArr.length; j++)
                    if (arr[j] < arr[min_idx])
                        min_idx = j;

                // Swap the found minimum element with the first
                // element

                int temp = returnArr[min_idx];
                returnArr[min_idx] = returnArr[i];
                returnArr[i] = temp;
                returnArr[i] = arr[min_idx];
            }
return(returnArr);
    }
}
