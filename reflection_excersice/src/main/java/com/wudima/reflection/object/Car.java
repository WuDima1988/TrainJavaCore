package com.wudima.reflection.object;

public class Car implements Motor{

    private boolean motorWork = false;
    private String model;
    private int speedNumber;
    private int year;
    private String color = "white";

    public Car() {
    }

    public Car(String model, Integer year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public void on() {
        this.motorWork = true;
        speedNumber = 100;
    }

    @Override
    public void off() {
        this.motorWork = false;
    }

    @Override
    public Integer speed() {
        return speedNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
