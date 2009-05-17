package com.kbaribeau.spytest;

import org.junit.Test;
import org.junit.Assert;

public class SpyTest {

    @Test
    public void A_ShouldCallBBarAndUseDataFromBBaz() {
        BSpy b = new BSpy();
        A a = new A(b);

        a.foo(1);

        Assert.assertTrue(b.wasCalled);

    }

    public class BSpy extends B {
        public boolean wasCalled;

        @Override
        public int bar() {
            wasCalled = true;
            return -1;
        }
    }

    /* UNUSED, but included for reference */
    public class BStub implements BInterface {

        public int bar() {
            return -1;
        }

        public int baz() {
            return -2;
        }
    }

    /* UNUSED, but included for reference */    
    public class BMock implements BInterface {
        public boolean barWasCalled = false;


        public int bar() {
            barWasCalled = true;
            return -1;
        }
    } 



}
