
package com.hwy.dsa.sorting;

import com.hwy.dsa.util.Util;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class QuickSortTest {
    Util util = new Util();
     QuickSort algo = new QuickSort();
    
   // @Test
    public void testPartitionIssue()
    {
        
        int[] arr = {50, 60, 70, 10, 20, 30, 40};
        int pivotIndex = algo.findPivot(arr,2,arr.length-1);
        
        System.out.println("Pivot "+arr[pivotIndex]);
	System.out.println("Partitoned "+util.arrayToString(arr));
                
        assertPivotIsCorrect(arr,pivotIndex,2,arr.length-1);
    }
    
    //@Test 
    public void testPartitionBoundaryCase(){
    int[] arr = {50, 60, 70, 10, 20, 30, 40};
    int pivotIndex = algo.findPivot(arr,0,arr.length-1);
    
    System.out.println("Pivot :" + arr[pivotIndex]);
    System.out.println("Partitioned :"+ util.arrayToString(arr));

    assertPivotIsCorrect(arr,pivotIndex,0,arr.length-1);
    
    }
    
   // @Test
    public void testPartitionOnRandomData(){
        int[] arr = util.createRandomArray(7);
        
        System.out.println("Before "+util.arrayToString(arr));
        int pivotIndex = algo.findPivot(arr,0,arr.length-1);
        
        System.out.println("Pivot :" + arr[pivotIndex]);
        System.out.println("Partitioned :"+ util.arrayToString(arr));
    
        assertPivotIsCorrect(arr,pivotIndex,0,arr.length-1);
    }
    
    @Test
    public void testQuickSort(){
        int[] arr = util.createRandomArray(5);
        System.out.println("Before "+util.arrayToString(arr));
        
        algo.sort(arr, 0, arr.length-1);
        System.out.println("After "+util.arrayToString(arr));
        assertTrue(util.isArraySorted(arr));
    }
    
    public void assertPivotIsCorrect(int[] arr, int pivotIndex, int start, int end)
    {
        int pivot = arr[pivotIndex];
        for(int i=start; i<=pivotIndex; i++)
        {
            assertTrue(arr[i]<=pivot);
        }
        for(int i=pivotIndex+1; i<end; i++)
        {
            assertTrue(arr[i]>=pivot);
        }
    }
}
