package com.xyzcorp;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class FlowerTest {
    @Test
    public void testFlowerBuilder() {
        Flower f = Flower.builder().latinName("Narcissus").build();
        assertEquals("Narcissus", f.getLatinName());
        assertEquals(null, f.getFlowerColor());

        assertThat(f.getLatinName()).isEqualTo("Narcissus");
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
