import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s="";
    if(n==1) {
    	System.out.println("I hate it");
    	return ;
    }
    int i=1;
    while(i<=n) {
    	if(i==n && i%2!=0) {
           s+="I hate it" ;   		
    	}
    	else if(i==n && i%2==0) {
    		s+="I love it" ; 
    	}
    	else if(i%2!=0) {
    		s+="I hate that ";
    	}
    	else {
    		s+="I love that ";
    	}
    	i++;
    }
    System.out.println(s);
	}

}
