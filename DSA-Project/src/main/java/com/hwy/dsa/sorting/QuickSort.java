
package com.hwy.dsa.sorting;


public class QuickSort {
    public void sort(int[] arr,int start,int end)
    {
        if(start < end)
        {
            int pivotIndex = findPivot(arr, start, end);
            sort(arr,start,pivotIndex-1);
            sort(arr,pivotIndex+1,end);
        }
    }
    
    public int findPivot(int[] arr, int start, int end)
    {
        int pivot = arr[end];
        int i = start-1;
        
        for(int j=start; j<end; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        
        return i+1;
    }
}
