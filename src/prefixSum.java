import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class prefixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
      int  sum=0;
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
          sum+=arr[i];
          System.out.println(sum);
      }


    }
}