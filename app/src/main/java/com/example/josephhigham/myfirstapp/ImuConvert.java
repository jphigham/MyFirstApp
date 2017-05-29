package com.example.josephhigham.myfirstapp;

import android.opengl.Matrix;

/**
 * Created by joe on 5/17/2017.
 */

public class ImuConvert {
    float[] sm;

    public ImuConvert() {
        sm = new float[16];
        Matrix.setIdentityM(sm, 0);
    }

    public float[] getSm() {return sm;}
}
