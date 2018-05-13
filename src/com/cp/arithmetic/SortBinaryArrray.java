package com.cp.arithmetic;

import java.util.Arrays;

public class SortBinaryArrray {

	public static void main(String[] args) {
	   int A[]= {0,1,1,0,0,0,1,0,1,1};
	   Sort(A);
	   System.out.println(Arrays.toString(A));
	}
	
	public static void Sort(int A[])
	{
		int count=0;
		for(int i=0;i<A.length-1;i++)
		{
			if(A[i]==0)
			{
				count++;
			}
		}
			
		int k=0;
		while(count-- !=0)
			{
				A[k++]=0;
			}
			
		while(k<A.length)
			{
				A[k++]=1;
			}
		
		 }

		
		}


