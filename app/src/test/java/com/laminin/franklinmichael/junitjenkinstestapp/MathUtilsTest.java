package com.laminin.franklinmichael.junitjenkinstestapp;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by franklin.michael on 20/05/16.
 */
@RunWith(DataProviderRunner.class)
public class MathUtilsTest {

    private MathUtils mathUtils;

    @Before
    public void setup(){
        mathUtils = new MathUtils();
    }

    @Test
    @UseDataProvider(value = "testAddData", location = MathUtilsDataProviders.class)
    public void add(int inputData[], int expectedOutput) throws Exception {
        assertTrue(mathUtils.add(inputData[0], inputData[1]) == expectedOutput);
    }

    @Test
    @UseDataProvider(value = "testSubtractData", location = MathUtilsDataProviders.class)
    public void subtract(int inputData[], int expectedOutput) throws Exception {
        assertTrue(mathUtils.subtract(inputData[0], inputData[1]) == expectedOutput);
    }

    @Test
    @UseDataProvider(value = "testMultiplyData", location = MathUtilsDataProviders.class)
    public void multiply(int inputData[], int expectedOutput) throws Exception {
        assertTrue(mathUtils.multiply(inputData[0], inputData[1]) == expectedOutput);
    }

    @Test
    @UseDataProvider(value = "testDivideData", location = MathUtilsDataProviders.class)
    public void divide(int inputData[], int expectedOutput) throws Exception {
        assertTrue(mathUtils.divide(inputData[0], inputData[1]) == expectedOutput);
    }

}