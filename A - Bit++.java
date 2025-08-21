import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=0;
        while(t-->0)
        {
          String s=sc.next();
        if(s.equals("X++")){
            n++;
        }  
        else if(s.equals("--X")){
            n--;
        }
        else if(s.equals("X--")){
            n--;
        }
        else{
            n++;
        }
        
        }
        System.out.println(n);
    }
}