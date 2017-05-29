package com.example.josephhigham.myfirstapp;

import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class ApplicationTest {

    @Test
    public void dummyTest() {
        boolean dummy = true;
        assertTrue(dummy);
    }

    @Test
    public void imuConvertTest() {
        double [] expected = new double[16];
        expected[0] = expected[5] = expected[10] = expected[15] = 1.;
        ImuConvert imuConvert = new ImuConvert();
        float [] factual = imuConvert.getSm();
        double [] dactual = new double[16];
        for (int i = 0; i < 16; i++)
            dactual[i] = factual[i];
        assertArrayEquals(expected, dactual, 0.);
    }
}