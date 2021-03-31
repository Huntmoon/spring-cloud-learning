package com.huntmoon.mail;

import java.util.Arrays;

public class T {
    public static void main(String[] args) {
        Integer[] t = new Integer[]{1,2,3,4};
        Arrays.stream(t).reduce((integer, integer2) -> {
            System.out.println(integer+""+integer2);
            return integer+integer2;
        });
    }
}
