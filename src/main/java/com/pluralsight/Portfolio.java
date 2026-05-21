package com.pluralsight;

import java.util.ArrayList;

public class Portfolio implements Valuable{
    private String name;
    private String owner;
    private ArrayList<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Valuable asset){
        this.assets.add(asset);
    }
    public Valuable getMostValuable(){
        Valuable mostValuable = this.assets.get(0);
        for(Valuable asset : this.assets){
            if(asset.getValue() > mostValuable.getValue()){
                mostValuable = asset;
            }
        }
        return mostValuable;
    }
    public Valuable getLeastValuable(){
        Valuable leastValuable = this.assets.get(0);
        for(Valuable asset : this.assets){
            if(asset.getValue() < leastValuable.getValue()){
                leastValuable = asset;
            }
        }
        return leastValuable;
    }

    @Override
    public double getValue() {
        return this.assets.stream()
                .mapToDouble(Valuable::getValue)
                .sum();
    }
}
