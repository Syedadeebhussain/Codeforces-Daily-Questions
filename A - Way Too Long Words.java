import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
           String word=sc.next();
        String s="";
        if(word.length()<=10){
            System.out.println(word);
        }
        else{
            s+=word.charAt(0)+""+(word.length()-2)+""+word.charAt(word.length()-1);
            System.out.println(s);
        } 
        }
        
    }
}