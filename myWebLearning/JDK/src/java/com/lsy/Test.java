package com.lsy;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        double a = 0.001;
        double b = 0.0011;
        BigDecimal data1 = new BigDecimal(a);
        BigDecimal data2 = new BigDecimal(b);
        System.out.println(data1.compareTo(data2));
    }

}
