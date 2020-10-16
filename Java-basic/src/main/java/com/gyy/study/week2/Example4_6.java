package com.gyy.study.week2;

/**
 * @ClassName Example4_6
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/16
 **/
public class Example4_6 {
    static public class Computer{
        public double getResult(double a, int ... x){
            double result = 0;
            int sum = 0;
            for(int i = 0; i < x.length; i++){
                sum = sum + x[i];
            }
            result = a * sum;
            return result;
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        double result = computer.getResult(1.0/3,10,20,30);
        System.out.println("10,20,30的平均数：" + result );
        result = computer.getResult(1.0/6,66,12,89,2,51);
        System.out.println("66,12,5,89,2,51的平均数:" + result);
    }
}
