package com.pluralsight;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String name, double weight) {
        super(name, calculateMarketValue(weight));
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return calculateMarketValue(weight);
    }

    public static double calculateMarketValue(double weight){
        return weight * 4530;
    }
}
