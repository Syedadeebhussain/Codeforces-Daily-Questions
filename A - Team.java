import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        while(t-->0)
        {
            int co=0;
        int a=sc.nextInt();
         int b=sc.nextInt();
          int c=sc.nextInt();
          if(a==1){
              co++;
          }
          if(b==1){
              co++;
          }
          if(c==1){
             co++;
          }
          if(co>=2){
              count++;
          }
        }
        System.out.println(count);
        
    }
}