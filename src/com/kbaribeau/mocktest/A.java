package com.kbaribeau.mocktest;

public class A {
    private B b;

    public A(B b) {
        this.b = b;
    }

    public void foo() {
        b.bar("expected argument");    
    }
}
