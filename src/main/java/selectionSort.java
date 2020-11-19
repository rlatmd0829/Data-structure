import java.util.Scanner;

public class selectionSort {
    static int []arr = new int[]{7, 6, 2, 4, 3, 9, 1};
    public static void main(String[] args) {
        selectionSort(arr);

    }


        public static void selectionSort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                int stay = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[stay] > arr[j]) stay = j;
                }

                int temp = arr[stay];
                arr[stay] = arr[i];
                arr[i] = temp;

                Print(arr);

            }
        }
        public static void bubbleSort(int[] arr){

        }

        public static void Print(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }


}
