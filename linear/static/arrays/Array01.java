// 1D Array

public class Array01 {
    public static void printArr(int[] arr, int currentIdx) {
        if (currentIdx == arr.length) {
            return;
        } else {
            System.out.print(arr[currentIdx] + " ");
            printArr(arr, currentIdx + 1);
        }
    }

    public static void main(String[] args) {

        // int array
        int[] arr1 = { 1, 2, 3, 4, 5 };
        printArr(arr1, 0);

        System.out.println();

        int[] arr2 = new int[10];
        arr2[0] = 0;
        arr2[1] = 1;
        arr2[2] = 2;
        arr2[3] = 3;
        printArr(arr2, 0);
    }
}