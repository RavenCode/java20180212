package com.xyzcorp.awesome;

public class Artist {
    private void foo() {
        System.out.println("Hello");
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Artist)) return false;
        Artist artist = (Artist) obj;
        artist.foo();
        return true;
    }
}
