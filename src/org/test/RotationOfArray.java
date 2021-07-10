package org.test;

public class RotationOfArray {
	public static void main(String[] args) {
		int[]a= {1,12,5,6,7};
		int count=3 ,temp=0;
		for (int i = 0; i < count; i++) {
			temp=a[0];
			for (int j = 1; j < a.length; j++) {
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}

}
