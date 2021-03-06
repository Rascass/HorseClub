package com.java.automation.lab.fall.antonyuk.core22.domain.ammunition;

import java.util.Objects;

public class Saddle {

    private double size;
    private SaddleType saddleType;
    private int number;

    public Saddle() {
    }

    public Saddle(double size, SaddleType saddleType, int number) {
        if (number <= 0) {
            throw new IllegalArgumentException();
        }
        this.size = size;
        this.saddleType = saddleType;
    }

    public void setNumber() {
        if (size <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public double getNumber() {
        return this.number;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size <= 0) {
            throw new IllegalArgumentException();
        }
        this.size = size;
    }

    public SaddleType getSaddleType() {
        return saddleType;
    }

    public void setSaddleType(SaddleType saddleType) {
        this.saddleType = saddleType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Saddle saddle = (Saddle) o;
        return Double.compare(saddle.size, size) == 0 &&
                saddleType == saddle.saddleType &&
                saddleType == saddle.saddleType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, saddleType, number);
    }

    @Override
    public String toString() {
        return "Saddle{" +
                "size=" + size +
                "number=" + number +
                ", saddleType=" + saddleType +
                '}';
    }
}
