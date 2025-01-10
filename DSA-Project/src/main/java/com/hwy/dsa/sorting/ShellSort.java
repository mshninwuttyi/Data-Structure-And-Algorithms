
package com.hwy.dsa.sorting;

public class ShellSort implements SortingAlgorithm{
    @Override 
    public void sort(int[] arr){
            int gap = arr.length/2;
            int n = arr.length;
            while(gap>0)
            {
                for(int i=0; i<arr.length; i++)
                {
                    int temp = arr[i];
                    int j;
                    
                    for(j=i; (j>=gap) && (arr[j - gap]>temp); j-=gap)
                    {
                        arr[j]=arr[j-gap];
                    }
                    arr[j] = temp;
                }
                gap= gap/2;
            }
    }   
}
