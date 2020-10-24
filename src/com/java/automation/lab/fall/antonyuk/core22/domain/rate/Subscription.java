package com.java.automation.lab.fall.antonyuk.core22.domain.rate;

import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;

import java.util.Date;
import java.util.Objects;

public class Subscription {

    private Client member;
    private Date start;
    private Date finish;
    private double startPrice;
    private Discount discount;
    private double price;

    public Subscription() {
    }

    public Subscription(Client member, Date start, Date finish, double startPrice,
                        Discount discount) {
        this.member = member;
        this.start = start;
        this.finish = finish;
        this.setStartPrice(startPrice);
        this.discount = discount;
        setPrice();
    }

    public Client getMember() {
        return member;
    }

    public void setMember(Client member) {
        this.member = member;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(double startPrice) {
        if (!Validator.isValidNumber((int) startPrice)) {
            throw new IllegalArgumentException();
        }
        this.startPrice = startPrice;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = startPrice + startPrice * discount.percent;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "member=" + member +
                ", start=" + start +
                ", finish=" + finish +
                ", startPrice=" + startPrice +
                ", discount=" + discount +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Subscription that = (Subscription) o;
        return Double.compare(that.startPrice, startPrice) == 0 &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(member, that.member) &&
                Objects.equals(start, that.start) &&
                Objects.equals(finish, that.finish) &&
                Objects.equals(discount, that.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member, start, finish, startPrice, discount, price);
    }
}
