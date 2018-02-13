package com.xyzcorp;

import java.util.List;

public class Generics {
    // Extends can get
    public void getFromList(List<? extends American> americanList) {
        American american = americanList.get(0);
        System.out.println("Murica!" + american);
    }

    // Super can put
    public void addToList(List<? super American> americanOrHigherList) {
        americanOrHigherList.set(0, new American());
        americanOrHigherList.set(1, new NewMexican());
        americanOrHigherList.set(2, new Floridian());

//        American american = americanOrHigherList.get(2);
    }

}
