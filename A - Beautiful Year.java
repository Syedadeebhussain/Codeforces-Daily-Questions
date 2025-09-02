
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num>0){
            num++;
            if(find(num)){
                System.out.println(num);
                return ;
            }
        }
    }
    public static boolean find(int num){
        boolean[] seen = new boolean[10]; 

        while (num > 0) {
            int digit = num % 10;
            if (seen[digit]) {
                return false; 
            }
            seen[digit] = true;
            num /= 10;
        }
        return true;
    }
}