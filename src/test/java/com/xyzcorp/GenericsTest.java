package com.xyzcorp;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GenericsTest {

    @Test
    public void testAssignment() {
        Generics generics = new Generics();
        generics.foo(new BucsFan());
    }

    @Test
    public void testAddToListWithBucsFans() {
        List<BucsFan> bucsFans = Arrays.asList(new BucsFan(), new BucsFan(), new BucsFan());

        Generics generics = new Generics();
        generics.getFromList(bucsFans);
    }

    @Test
    public void testAddToListWithNewMexican() {
        List<NewMexican> newMexicans = Arrays.asList(new NewMexican(), new NewMexican(), new NewMexican());

        Generics generics = new Generics();
        generics.getFromList(newMexicans);
    }

    @Test
    public void testAddToListWithFloridian() {
        List<Human> humans= Arrays.asList(
          new Human(),
          new Human()
        );
        Generics generics = new Generics();
        generics.addToList(humans);
    }
}
