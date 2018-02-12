package com.xyzcorp;

public class Flower {

    private String latinName;
    private FlowerColor flowerColor;
    private int numberOfPetals;

    /**
     *
     */
    public static class FlowerBuilder {
        private String latinName;
        private FlowerColor flowerColor;
        private int numberOfPetals;

        public FlowerBuilder latinName(String latinName) {
            this.latinName = latinName;

            return this;
        }

        public FlowerBuilder flowerColor(FlowerColor color) {
            this.flowerColor = color;

            return this;
        }

        public FlowerBuilder petals(int numberOfPetals) {
            this.numberOfPetals = numberOfPetals;

            return this;
        }

        public Flower build() {
            return new Flower(this);
        }

        public String getLatinName() {
            return latinName;
        }

        public FlowerColor getFlowerColor() {
            return flowerColor;
        }

        public int getNumberOfPetals() {
            return numberOfPetals;
        }
    }

    public Flower(FlowerBuilder flower) {
        this.latinName = flower.getLatinName();
        this.flowerColor = flower.getFlowerColor();
        this.numberOfPetals = flower.getNumberOfPetals();
    }

    public String getLatinName() {
        return this.latinName;
    }

    public FlowerColor getFlowerColor() {
        return this.flowerColor;
    }
    
    public int getPetalCount() {
        return this.numberOfPetals;
    }

    public static FlowerBuilder builder() {
        return new FlowerBuilder();
    }
}
