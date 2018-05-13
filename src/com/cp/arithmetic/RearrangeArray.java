//Every second element should be greater then its left and right elements.

package com.cp.arithmetic;

import java.util.Arrays;

public class RearrangeArray {

	public static void main(String[] args) {
		int A[]= {3,2,7,5,9,1,6};
		Rearrange(A);
			System.out.println(Arrays.toString(A));
		
	}
	
	public static void swap(int A[],int i,int j)
	{
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}
	
		public static void Rearrange(int A[])
	{
		
		for(int i=1;i<A.length;i+=2)
		{
			if(A[i-1]>A[i])
			{
				swap(A,i-1,i);
				
			}
			if(A[i]<A[i+1])
			{
				swap(A,i+1,i);
			}
			
		}
		
		
	}
}
	


