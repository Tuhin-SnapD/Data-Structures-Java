import java.io.*;
import java.util.*;

class Main {
    void sort(int array[]) {
        int size = array.length;
        for (int step = 0; step < size - 1; step++) {
            int mini = step;
            for (int i = step + 1; i < size; i++) {
                if (array[i] < array[mini]) {
                    mini = i;
                }
            }
            int temp = array[step];
            array[step] = array[mini];
            array[mini] = temp;
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