package com.kbaribeau.stubtest;

import org.junit.Test;
import org.junit.Assert;

import java.util.Random;

public class StubTest {

    @Test
    public void Foo_ShouldUseBsReturnValue() {
        int expectedResult = new Random().nextInt();
        //inject the mock (BStub) into your production class (A)
        A a = new A(new BStub(expectedResult));

        //call A, it will call your stub
        int actualResult = a.foo();

        //use the return value to Assert that your stub was used
        Assert.assertEquals(expectedResult, actualResult);
    }

    private class BStub extends B {
        private int returnVal;

        public BStub(int returnVal) {
            this.returnVal = returnVal;
        }

        @Override
        public int bar() {
            return returnVal;
        }
    }
}
