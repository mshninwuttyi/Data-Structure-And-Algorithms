/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hwy.dsa.search;

import com.hwy.dsa.LinearSearch;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class LinearTestSearch {
    LinearSearch isAlgo = new LinearSearch();
    int[]input = {1,2,3,4,10,-1};
       
    @parameterizedTest
    @CsvSource(value = {
            "1,0",
            "120,-1",
            "-1,5"})
    
    public void testSearchWithParameterizedTest(int item, int expected)
    {
        System.out.println("Item" +item+ " Expected " +expected);
        
        int index = isAlgo.Search(input, item);
        assertEquals(expected, index);
    }
    
    @parameterizedTest
    @MethodSource("RectangleAreaProvider")
    void testRectangleArea(int lenght, int width, int expectedArea)
    {
        assertEquals(expectedArea, calculateRectangleArea(length, width));
    }
    
    private static Stream<Arguments> rectangleAreaProvider(){
        return Stream.of(
        Arguments.of(1,2,2),
        Arguments.of(3,4,12),
        Argguments.of(5,6,30)
        );     
    }
    
    private int calculateRectangleArea(int length, int width)
    {
        return length * width;
    }
}
