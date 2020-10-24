package com.java.automation.lab.fall.antonyuk.core22.domain.rate;

import com.java.automation.lab.fall.antonyuk.core22.domain.building.Stall;

import java.util.Objects;

public class Rate {

    Subscription subscription;
    Stall stall;

    public Rate() {
    }

    public Rate(Subscription subscription, Stall stall) {
        this.subscription = subscription;
        this.stall = stall;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public Stall getStall() {
        return stall;
    }

    public void setStall(Stall stall) {
        this.stall = stall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rate rate = (Rate) o;
        return Objects.equals(subscription, rate.subscription) &&
                Objects.equals(stall, rate.stall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscription, stall);
    }

    @Override
    public String toString() {
        return "Rate{" +
                "subscription=" + subscription +
                ", stall=" + stall +
                '}';
    }
}
