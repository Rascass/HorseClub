package com.java.automation.lab.fall.antonyuk.core22.domain.horse;

public class GenerateHorse {
    private GenerateHorse() {}
    public static Horse createHorse(HorseInfo horseInfo, Gender gender) {
        if (gender == Gender.MARE) {
            return new Mare(horseInfo);
        }
        return new Stallion(horseInfo);
    }

    public static Horse createMare(HorseInfo horseInfo) {
        return new Mare(horseInfo);
    }

    public static Horse createGelding(HorseInfo horseInfo) {
        Stallion gelding = new Stallion(horseInfo);
        gelding.setGelding(true);
        return gelding;
    }

    public static Horse createStallion(HorseInfo horseInfo) {
        Stallion stallion = new Stallion(horseInfo);
        stallion.setGelding(false);
        return stallion;
    }
}
