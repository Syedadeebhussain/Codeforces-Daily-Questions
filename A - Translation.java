import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String s1=sc.next();
         String s2=sc.next();
         StringBuilder st=new StringBuilder(s2);
         st.reverse();
         if(s1.equals(st.toString())){
             System.out.println("YES");
         }
         else{
             System.out.println("NO");
         }
        
    }
}