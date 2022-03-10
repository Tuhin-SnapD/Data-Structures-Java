import java.io.*;
import java.util.*; 

class Main {
	public static void main (String[] args) {
	Scanner sc = new Scanner (System.in);
	int n= sc.nextInt();
	for(int z=0;z<n;z++){
    int x = sc.nextInt();
	int ix = 0;
	int iy = 0;
	int[] arx;
	arx = new int[x];
	for (int i=0; i < x; i++) {
		int q = sc.nextInt();
		if (q != 0) {
			arx[ix++] = q;           
		}
	}
	for (int i=0; i < arx.length; i++) {
		System.out.print(arx[i] + " ");
	}
	System.out.println();
		}
	}
}