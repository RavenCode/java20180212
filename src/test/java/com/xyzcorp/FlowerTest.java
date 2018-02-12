package com.xyzcorp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlowerTest {
    @Test
    public void testFlowerBuilder() {
        Flower f = Flower.builder().latinName("Narcissus").build();
        assertEquals("Narcissus", f.getLatinName());
        assertEquals(null, f.getFlowerColor());
    }

    @Test
    public void testFlowerBuilderFlowerColor() {
        Flower f = Flower.builder().latinName("Narcissus").flowerColor(FlowerColor.PURPLE).build();
        assertEquals("Narcissus", f.getLatinName());
        assertEquals(FlowerColor.PURPLE, f.getFlowerColor());
    }

    @Test
    public void testFlowerBuilderNumberOfPetals() {
        Flower f = Flower.builder().latinName("Narcissus").flowerColor(FlowerColor.PURPLE).petals(7).build();
        assertEquals("Narcissus", f.getLatinName());
        assertEquals(7, f.getPetalCount());
        assertEquals(FlowerColor.PURPLE, f.getFlowerColor());
    }
}
