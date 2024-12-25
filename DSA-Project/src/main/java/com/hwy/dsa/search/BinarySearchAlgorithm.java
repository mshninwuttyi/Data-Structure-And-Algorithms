package com.hwy.dsa.search;

import com.hwy.dsa.searching.SearchAlgorithm;

public class BinarySearchAlgorithm implements SearchAlgorithm {
    @Override
    public int Search(int[]arr, int item)
    {
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end)
        {
            int middle = (start + end)/2;
            if(arr[middle] == item)
            {
                return middle;
            }
            else if(arr[middle] > item)
            {
                end = middle - 1;
            }
            else if(arr[middle] < item)
            {
                start = middle + 1;
            }
        }
        return -1;
    }
}
