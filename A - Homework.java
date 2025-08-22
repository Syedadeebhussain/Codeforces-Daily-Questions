import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int al=sc.nextInt();
            String s1=sc.next();
            StringBuilder st1=new StringBuilder(s1);
            int bl=sc.nextInt();
            String s2=sc.next();
            String order =sc.next();
        for(int i=0;i<bl;i++){
            char ch=s2.charAt(i);
            if(order.charAt(i)=='D'){
                st1.append(ch);
            }
            else{
                st1.insert(0,ch);
                
            }
        }
        System.out.println(st1);
        }
    }
}