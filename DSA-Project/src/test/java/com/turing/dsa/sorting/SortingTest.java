
package com.turing.dsa.sorting;

import com.hwy.dsa.sorting.BubbleSort;
import com.hwy.dsa.sorting.SortingAlgorithm;
import org.junit.jupiter.api.Test;
import com.hwy.dsa.util.Util;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortingTest {
    Util util = new Util();
    SortingAlgorithm sortingAlgo = new BubbleSort();
    
    @Test
    public void testEmptyElement(){
    int[] arr = {};
    sortingAlgo.sort(arr);
    assertTrue(util.isArraySorted(arr));
}
}
