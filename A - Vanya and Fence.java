import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int h=sc.nextInt();
         int [] arr=new int [n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         int w=0;
         for(int j=0;j<n;j++){
             if(arr[j]<=h){
                 w+=1;
             }
             else{
              int c = (int) Math.ceil((double) arr[j] / h);
                 w+=c;
             }
         }
         System.out.println(w);
        
    }
}