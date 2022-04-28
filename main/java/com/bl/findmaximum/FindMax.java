package com.bl.findmaximum;
/*
@Author: Rajesh Pal
Finding the maximum among the three given strings and running test cases for that.
 */
public class FindMax {
    public String findMaximum(String x , String y , String z){
        String max = x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }
}
