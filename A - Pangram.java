import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     String s=sc.next();
     s=s.toLowerCase();
     int [] freq=new int[26];
     for(int i=0;i<s.length();i++) {
    	 freq[s.charAt(i)-'a']++;
     }
     for(int i=0;i<26;i++) {
    	 if(freq[i]==0) {
    		 System.out.println("NO");
    		 return ;
    	 }
     }
     System.out.println("YES");
	}

}
