import java.io.*; 
import java.util.*;
class Main {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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