import java.io.*;
import java.util.*;
class Main {
    void sort(int array[]) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int q = sc.nextInt();

            int arr[] = new int[q];
            for (int num = 0; num < q; num++) {
                arr[num] = sc.nextInt();
            }
            Main ob = new Main();
            ob.sort(arr);
            for (int k = 0; k < q; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}