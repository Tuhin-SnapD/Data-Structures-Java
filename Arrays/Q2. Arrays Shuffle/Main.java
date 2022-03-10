import java.io.*;		
import java.util.*;		

class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt ();
    int N=x+x;
    int[] ar;
    ar = new int[N];
    
    int[] arx;
    arx = new int[x];
    
    int[] ary;
    ary = new int[x];
    
    for (int i = 0; i < x; i++)
      {
	    arx[i] = sc.nextInt ();
      }
      
      for (int i = 0; i < x; i++)
      {
	    ary[i] = sc.nextInt ();
      }

      for (int i = 0; i < x; i++)
      {
        System.out.print(arx[i]+" "+ary[i]+" ");
      }
}  
}
