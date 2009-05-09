package com.kbaribeau.stubtest;

public class A {
    private B b;

    public A(B b) {
        this.b = b;
    }

    public int foo() {
        return b.bar();
    }
}
