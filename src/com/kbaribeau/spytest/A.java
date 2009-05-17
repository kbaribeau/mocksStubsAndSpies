package com.kbaribeau.spytest;

public class A {
    private B b;

    public A(B b) {
        this.b = b;
    }

    public int foo(int i) {
        //SNIP: 100s of calls to Bs other methods
        return i + b.bar();
    }
}
