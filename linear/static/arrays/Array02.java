// 2D Array

public class Array02 {
    public static int printArr(int[][] arr, int i, int j) {
        if (i >= arr.length)
            return 1;
        if (j >= arr[i].length)
            return 0;

        System.out.print(arr[i][j] + " ");

        if (printArr(arr, i, j + 1) == 1)
            return 1;

        return printArr(arr, i + 1, 0);
    }

    public static void main(String[] args) {
        int[][] arr1 = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 }
        };
        printArr(arr1, 0, 0);

    }
}
