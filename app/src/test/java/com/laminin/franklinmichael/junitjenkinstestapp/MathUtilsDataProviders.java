package com.laminin.franklinmichael.junitjenkinstestapp;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.internal.convert.StringConverter;

import org.junit.Before;

/**
 * Created by franklin.michael on 22/05/16.
 */

public class MathUtilsDataProviders {

    @DataProvider
    public static Object[][] testAddData(){
        int data1[] = {1, 2}; // {input1, input2}
        int data2[] = {5, 2};
        int data3[] = {5, 5};
        return new Object[][] {
                {data1, 3}, // {input collection, output}
                {data2, 7},
                {data3, 11}
        };
    }

    @DataProvider
    public static Object[][] testSubtractData(){
        int data1[] = {3, 2};
        int data2[] = {5, 2};
        int data3[] = {5, 5};
        return new Object[][] {
                {data1, 1},
                {data2, 3},
                {data3, 1}
        };
    }

    @DataProvider
    public static Object[][] testMultiplyData(){
        int data1[] = {1, 2};
        int data2[] = {5, 2};
        int data3[] = {5, 5};
        return new Object[][] {
                {data1, 2},
                {data2, 10},
                {data3, 20}
        };
    }

    @DataProvider
    public static Object[][] testDivideData(){
        int data1[] = {2, 1};
        int data2[] = {6, 2};
        int data3[] = {5, 5};
        return new Object[][] {
                {data1, 2},
                {data2, 3},
                {data3, 0}
        };
    }
}
