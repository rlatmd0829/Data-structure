import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    static int []arr = new int[]{13, 5, 6, 14, 38, 33, 2};
    static int []sorted = new int[7];
    static int count;
    public static void main(String[] args) {
        //selectionSort(arr);
        //bubbleSort(arr);
        //insertSort(arr);
        //mergeSort(arr, 0, arr.length-1);
        //quickSort(arr, 0, arr.length-1);
        heapSort(arr);
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

                System.out.print((i+1)+" 단계 : ");
                print(arr);


            }

        }
        public static void bubbleSort(int[] arr){
            for (int i=0; i<arr.length-1; i++){
                for (int j = 0; j < arr.length-i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }

                }
                System.out.print((i+1)+" 단계 : ");
                print(arr);
            }

        }

        public static void insertSort(int [] arr){ // 기준 값에 앞에 값들과 비교하면서 기준값을 오른쪽으로 이동시킨다.
            for(int i=1; i<arr.length; i++){ // insertSort는 배열안에 2번째 인덱스부터 앞에 인덱스와 비교하면서 정렬을 한다.
                int standard = arr[i];       // 기준값
                int index = i-1;             // 기준값 보다 왼쪽 한칸 앞에값

                while ((0 <= index) && standard < arr[index]){ // 기준값 보다 왼쪽 앞에 값이 더 크고 왼쪽 앞에 값에 인덱스가 0보다 크면 반복문에 들어간다.
                    arr[index+1] = arr[index];  // 왼쪽 앞에 값이 더 크므로 왼쪽 앞에 값을 오른쪽으로 한칸 이동시킨다.
                    index--; // 한칸더 왼쪽으로 가기 위해 --
                }
                arr[index+1] = standard; // 기준값에 위치를 확정시키고 다음 루프를 돈다.
                System.out.print((count+1)+" 단계 : ");
                print(arr);
                count++;
            }

        }

        public static void mergeSort(int[] arr, int left, int right){   // 배열을 나눈다
            if(left < right){
                int mid = (left + right) / 2;

                mergeSort(arr, left, mid);
                mergeSort(arr, mid+1, right);
                merge(arr, left, mid, right);
            }
        }

        public static void merge(int [] arr, int left, int mid, int right){
            int i, j, k, l, z;
            i = left;
            j = (mid + 1);
            k = left;


            while (i <= mid && j <= right ){ // 왼쪽 부분 배열과 오른쪽 부분 배열을 비교하면서
                if(arr[i] < arr[j])          // 각각의 원소중에서 작은 원소가 sorted 배열에 들어간다
                    sorted[k++] = arr[i++];  // 왼쪽 혹은 오른쪽 배열 중 하나의 배열이라도 모든 원소가 sorted 배열에 들어간다면
                else{                        // 반복문 조건이 만족하지 않기 때문에 빠져 나온다.
                    sorted[k++] = arr[j++];  // sorted 배열에 들어가지 못한 부분 배열은 아래 쪽에서 채워진다.
                }
            }

            if(mid < i){ // mid < i 인 순간, i는 왼쪽 부분 배열의 인덱스를 관리하므로 왼쪽 부분 배열이 sorted에 모두 채워졌음을 의미한다.
                for (l = j; l <= right; l++){ // 따라서 남아 있는 오른쪽 부분 배열의 값을 일괄 복사한다.
                    sorted[k++] = arr[l];
                }
            }else{ // mid > i 인 순간, 오른쪽 배열 부분이 sorted 배열에 정렬된 상태로 모두 채워졌음을 의미한다.
                for(l = i; l<= mid; l++){ // 따라서 왼쪽 부분 배열의 값을 일괄 복사한다.
                    sorted[k++] = arr[l];
                }
            }

            for(l=left; l<=right; l++){
                arr[l] = sorted[l]; // sorted 배열에 들어간 정리된 배열을 다시 arr 배열로 가져온다.
            }

            System.out.print((count+1)+" 단계 : ");
            print(arr);
            count++;
        }

        public static void quickSort(int[] arr, int left, int right){
            int L = left;
            int R = right;
            int pivot = arr[(left + right) / 2];  // 피벗을 배열의 가운데 위치한 요소로 설정

            while(L <= R){
                while (arr[L] < pivot) L++; // 피벗 왼쪽에는 피벗보다 작은 원소들이 위치해야 하고, 큰 원소가 있다면 반복문을 나온다.
                while (arr[R] > pivot) R--; // 피벗 오른쪽에는 피벗보다 큰 원소들이 위치해야 하고, 작은 원소가 있다면 반복문을 나온다.

                if(L <= R){  // 반복문을 도중에 빠져나온 L에는 피벗보다 큰값이 들어 있고, 반복문을 도중에 빠져나온 R에는 피벗보다 작은 값이 들어있다.
                    if(L != R){ // L 과 R이 같지 않은경우 스왑한다.
                        swap(arr, L, R);
                    }
                    L++;
                    R--;
                }
                System.out.print((count+1)+" 단계 : ");
                print(arr);
                count++;
            }
            // while문을 빠져나온경우는 L 과 R이 역전된 경우이다.
            // 이 경우 남아 있는 부분 배열이 정렬이 안되잇을 경우가 있다. 다시 퀵정렬을 돌린다.
            if(left < R) quickSort(arr, left, R);
            if(L < right) quickSort(arr, L, right);

        }

        public static void heapSort(int[] arr){
            heapify(arr, arr.length); // max heap으로 만든다. max 힙은 완전히 정렬된 상태는 아님 => 이런상태 ( 38, 14, 33, 5, 13, 6, 2)
                                      // 그래서 밑에서 루트 노드와 맨 마지막 값을 바꾼후에 heapify를 해줘서 루트 노드에 올라온값에 위치를 찾아주기 위해 한번더 heapify를 해줘야함.

            for(int i=arr.length-1; i>= 0; i--){ // max heap 을 배열로 만들기 위해 정렬
                swap(arr, 0, i); // max heap은 루트 노드가 가장 크기 때문에 루트노드와 제일 마지막 값과 바꿔준다.
                //heapify(arr, i); // 제일 마지막 값과 루트 노드를 바꿔준 뒤에는 루트 노드에 올라온 값에 위치를 찾아줘야 하기 때문에 heapify를 돌린다.
            }

            System.out.print("Quick Sort : ");
            print(arr);
        }

        public static void heapify(int[] arr, int idx){ // heap을 만든다.
            for(int i=1; i<idx; i++){
                int child = i;

                while(child > 0) { // child 값이 루트노드가 될때가지 계속 비교
                    int parent = (child -1)/2;  // 부모노드 위치는 (자식-1)/2 이다.
                    if(arr[child] > arr[parent]){  // 자식 노드에 값이 부모 노드보다 크면 스왑한다.
                        swap(arr, child, parent);
                    }
                    child = parent; // 인덱스 0이 될때까지 자식 노드와 부모노드를 비교하기 위해  child에 parent 값(인덱스)를 넣는다.
                }
            }
        }

        public static void swap(int[] arr, int left, int right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        public static void print(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }


}
