package com.kbaribeau.spytest;

public class B implements BInterface {

    //SNIP: 100 or so ugly methods that you can't justify refactoring to fix this one tiny little bug

    public int bar() {

        return -1;    
    }


    public int baz() {
        return 42;
    }


}
