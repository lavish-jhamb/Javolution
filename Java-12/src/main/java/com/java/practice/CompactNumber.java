package com.java.practice;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumber {

    public static void main(String[] args) {

        NumberFormat format = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        format.setMaximumFractionDigits(1);
        System.out.println(format.format(1000)); // 1k
        System.out.println(format.format(1000000)); // 1M

    }

}
