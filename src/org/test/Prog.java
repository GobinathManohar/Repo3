package org.test;

public class Prog {
	public static void main(String[] args) {
		int[]a= {1,12,5,611,7000};
		int temp=0 ,temp1=0,temp3=0;
		for (int i = 0; i < a.length; i++) {
			if(temp<a[i]) {
				temp3=temp1=temp=a[i];
				//temp1=temp;
				//temp=a[i];
			}
		}
		System.out.println("1st Maximum :"+temp+" 2nd Maximum :"+temp1+"third maximum"+temp3);
	}

}
