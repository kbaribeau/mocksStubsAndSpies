package com.kbaribeau.mocktest;

import org.junit.Test;
import org.junit.Assert;


public class MockTest {

    @Test
    public void Foo_ShouldCallBar() {
        BMock bMock = new BMock();
        A a = new A(bMock);

        a.foo();

        Assert.assertTrue(bMock.wasCalled);
    }

    @Test
    public void Foo_ShouldCallBarWithParameter() {
        BMockWithParameter bMock = new BMockWithParameter("expected argument");
        A a = new A(bMock);

        a.foo();

        Assert.assertTrue(bMock.wasCalled);
    }

    public class BMock extends B {
        boolean wasCalled = false;

        @Override
        public int bar(String baz) {
            wasCalled = true;
            return -1;
        }
    }

    public class BMockWithParameter extends B {
        boolean wasCalled = false;
        String expectedBaz = null;

        public BMockWithParameter(String expectedBaz) {
            this.expectedBaz = expectedBaz;
        }

        @Override
        public int bar(String baz) {
            if (expectedBaz.equals(baz)) {
                wasCalled = true;
            }
            return -1;
        }
    }
}
