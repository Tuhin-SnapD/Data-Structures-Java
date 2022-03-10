import java.io.*;
import java.util.*; 
class Main {
	public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt ();
    int[] ar= new int[x];
    int temp=1;
    for (int i = 0; i < x; i++){
	    ar[i] = sc.nextInt ();
      }
    int check=ar[0];
    for (int i = 1; i < x; i++)
      {
      if(ar[i]>check){
        check=ar[i];
        temp=temp+1;
      }
	}
  System.out.print(temp);
}
}