import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            List<Long> ll=new ArrayList<>();
            long ten=10;
            long n=sc.nextLong();
            for(int k=1;k<=18;k++){
                long d=1+ten;
              if(n%d==0){
                ll.add(n/d);
            }
            ten*=10;
            }
            if(ll.size()==0){
                System.out.print(0);
            }
            else{
                Collections.sort(ll);
                System.out.println(ll.size());
                for(int i=0;i<ll.size();i++){
                    System.out.print(ll.get(i)+" ");
                }
            }
            System.out.println();
            
        }
    }
}