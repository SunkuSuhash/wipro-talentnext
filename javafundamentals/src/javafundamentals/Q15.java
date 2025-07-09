package javafundamentals;

import java.util.*;
class Q15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    boolean isPrime=true;
		    if(n <= 0) {
		    	isPrime=false;
		    }
		    else {
		    	for(int i=2;i*i <= n;i++) {
		    		if(n% i == 0) {
		    			isPrime=false;
		    			break;
		    		}
		    	}
		    }
		    if(isPrime) {
		    	System.out.println("Prime");
		    }
		    else {
		    	System.out.println("not a prime");
		    }
		    
			}

	}