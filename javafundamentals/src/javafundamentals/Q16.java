package javafundamentals;

import java.util.*;
class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isPrime=true;
		if(n <= 1) {
			isPrime=false;
		}
		else {
			for(int i=2 ;i * i<=n;i++) {
				if( n % i == 0) {
					isPrime=false;
				}
			}
		}
		if(isPrime) {
			System.out.println("prime" +n);
		}
		else {
			System.out.println("not prime ");
		}

	}



	}