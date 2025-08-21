import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int a=0;
        int d=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='A'){
                a++;
            }
            else{
                d++;
            }
        }
        if(a>d){
            System.out.println("Anton");
        }
        else if(d>a){
             System.out.println("Danik");
        }
        else{
             System.out.println("Friendship");
        }
        
    }
}