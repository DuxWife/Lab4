package m4;
import java.io.*;
public class M4 {
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n,k,i,j,m,q,s=0;
      System.out.print("Введите количество элементов в первой последовательности:");
      n=Integer.parseInt(br.readLine ());
      int[] a= new int [n];
      for (i=0;i<n;i++){
          System.out.print("a["+(i+1)+"]=");
          a[i]=Integer.parseInt(br.readLine ());
      }
      System.out.print("Введите количество элементов во второй последовательности:");
      k=Integer.parseInt(br.readLine ());
      int[] c= new int [k];
      for (i=0;i<k;i++){
          System.out.print("c["+(i+1)+"]=");
          c[i]=Integer.parseInt(br.readLine ());          
      }
      for (i=0;i<=n-k;i++){
          m=i;q=0;
          for (j=0;j<k;j++){
              if (a[m]==c[j]) q++;
              m++;
          }
          if (q==k) s++;
      }
      if (s>0)  System.out.print("Последовательность с является подпоследовательностью а");
      else System.out.print("Последовательность с не является подпоследовательностью а");
    }    
}
