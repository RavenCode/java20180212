package com.xyzcorp.externalFlowers;

import com.xyzcorp.Flower;
import com.xyzcorp.FlowerColor;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExternalFlowerTest {
    @Test
    public void testFlowerBuilder() {
        Flower f = Flower.builder().latinName("Narcissus").build();
        assertEquals("Narcissus", f.getLatinName());
        assertEquals(null, f.getFlowerColor());
    }

    @Test
    public void testFlowerBuilderFlowerColorAndLatinName() {
        Flower f = Flower.builder().latinName("Narcissus").flowerColor(FlowerColor.PURPLE).build();
        assertEquals("Narcissus", f.getLatinName());
        assertEquals(FlowerColor.PURPLE, f.getFlowerColor());
    }

    @Test
    public void testFlowerBuilderNumberOfPetalsAndLatinName() {
        Flower f = Flower.builder().latinName("Narcissus").petals(7).build();
        assertEquals("Narcissus", f.getLatinName());
        assertEquals(7, f.getPetalCount());
    }
}
