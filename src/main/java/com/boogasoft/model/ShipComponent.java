package com.boogasoft.model;

class ShipComponent {
    private int currentValue;
    private int maximumValue;
    private String name;
    
    public ShipComponent(int maximumValue, String name) {
        this.maximumValue = maximumValue;
        this.name = name;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public int getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(int maximumValue) {
        this.maximumValue = maximumValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}