package com.cp.arithmetic;

import java.util.Arrays;

public class DutchNationalFlagProblem 
{
	public static void partition(int A[],int end)
	{
	int start=0,mid=0,flag=1;
	                                              
     
     while (mid <= end)
     {
         if (A[mid] < flag)         
         {
             swap(A, start, mid);
             ++start;
             ++mid;
         }
         else if (A[mid] > flag)    
         {
             swap(A, mid, end);
             --end;
         }
         else                      
             ++mid;
     }
 }

 private static void swap(int[] A, int i, int j) {
     int temp = A[i];
     A[i] = A[j];
     A[j] = temp;
 }

 public static void main (String[] args)
 {
     int A[] = { 0, 1, 2, 2, 1,2,1,0,2,2, 0, 0, 2, 0, 1, 1, 0 };

     partition(A, A.length - 1);
     System.out.println(Arrays.toString(A));
    		 

 
 
 }


}
