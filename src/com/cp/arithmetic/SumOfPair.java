package com.cp.arithmetic;

public class SumOfPair {

	public static void main(String[] args) {
		
		int arr[]= {2,1,9,6,4,7,3,8};
		int sum=11;
		FindPair(arr,sum);
	}
	
	public static void FindPair(int []A,int sum)
	{
		for(int i=0;i<A.length-1;i++)
		{
			for(int j=0;j<A.length-1;j++)
			{
				if(A[i]+A[j]==sum)
				{
					System.out.println("index of i "+i+"and "+j);
					return;
				}
			  }
			}
		System.out.println("Pair not found");
		}

}
