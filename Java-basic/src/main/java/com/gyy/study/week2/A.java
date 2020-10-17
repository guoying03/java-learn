package com.gyy.study.week2;

/**
 * @ClassName A
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/17
 **/
 class A {
    int x,y,z;
    static int getContinueSum(int start , int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum = sum + i;

        }
        return sum;
    }
}
