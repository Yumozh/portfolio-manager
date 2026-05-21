package com.pluralsight;

public class Jewelry extends FixedAsset{
    private double karat;

    public Jewelry(String name, double karat) {
        super(name, calculateMarketValue(karat));
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }

    public static double calculateMarketValue(double karat){
        double marketValue = karat * 10000;
        return marketValue;
    }

    @Override
    public double getValue() {
        return calculateMarketValue(karat);
    }
}
