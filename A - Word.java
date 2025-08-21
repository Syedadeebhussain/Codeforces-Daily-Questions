import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        int up=0,lo=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                up++;
            }
            else{
                lo++;
            }
        }
        if(up>lo){
              System.out.println(word.toUpperCase());
           
        }
        else{
              System.out.println(word.toLowerCase());
           
        }
    }
}