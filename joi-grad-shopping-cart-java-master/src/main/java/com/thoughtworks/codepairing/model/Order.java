package com.thoughtworks.codepairing.model;

public class Order {
    //总金额
    private double totalPrice;
    //积分
    private int loyaltyPoints;

    public Order(double totalPrice, int loyaltyPointsEarned) {
        this.totalPrice = totalPrice;
        this.loyaltyPoints = loyaltyPointsEarned;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    @Override
    public String toString() {
        return "Total price: " + totalPrice + "\n" + "Will receive " + loyaltyPoints + " loyalty points";
    }
}
