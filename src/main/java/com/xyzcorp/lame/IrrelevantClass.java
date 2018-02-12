package com.xyzcorp.lame;

import com.xyzcorp.awesome.Artist;

public class IrrelevantClass {
    public IrrelevantClass(){}

    public void zoom() {
        Artist ar = new Artist();
//        ar.foo(); // can't do this because a protected method needs to be same package or subclass
    }
}
