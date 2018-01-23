package com.huntmoon.spring.async;

/**
 * @author wangtao
 * @since 2018/1/10
 */
public class Person {
    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    private String first;
    private String last;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
