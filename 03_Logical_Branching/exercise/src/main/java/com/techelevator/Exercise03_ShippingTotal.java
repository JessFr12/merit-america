package com.techelevator;

public class Exercise03_ShippingTotal {

    /*
    Scamper Shipping Company specializes in small, local deliveries.
    The problems below ask you to implement the logic to calculate a shipping amount for a package.
     */

    // You can use these constants in your solutions.
    private final int MAX_WEIGHT_POUNDS = 40;
    private final double UP_TO_40_LB_RATE = 0.50;
    private final double OVER_40_LB_RATE = 0.75;

    /*
    Scamper Shipping Company charges $0.50 per pound up to 40 pounds. After that, it's $0.75 for each additional pound.
    Implement the logic needed to calculate the shipping rate when provided a weight in pounds.

    Examples:
    calculateShippingTotal(10) ➔ 5.0
    calculateShippingTotal(25) ➔ 12.5
    calculateShippingTotal(45) ➔ 23.75
     */
    public double calculateShippingTotal(int weightPounds) {
        double shippingTotal = 0;
        if (weightPounds <= MAX_WEIGHT_POUNDS) {
            shippingTotal = weightPounds * UP_TO_40_LB_RATE;
            return shippingTotal;
        } else if (weightPounds > MAX_WEIGHT_POUNDS) {
            shippingTotal = (MAX_WEIGHT_POUNDS * UP_TO_40_LB_RATE) + ((weightPounds - MAX_WEIGHT_POUNDS) * OVER_40_LB_RATE);
            return shippingTotal;
        }
        return shippingTotal;
    }

    /*
    Scamper Shipping Company now allows customers to provide a discount code to give them 10% off of their order.
    Implement the logic to calculate the correct shipping rate when provided a weight in pounds and a boolean value for hasDiscount.

    Examples:
    calculateShippingTotal(10, false) ➔ 5.0
    calculateShippingTotal(10, true) ➔ 4.5
    calculateShippingTotal(25, false) ➔ 12.5
    calculateShippingTotal(25, true) ➔ 11.25
    calculateShippingTotal(45, false) ➔ 23.75
    calculateShippingTotal(45, true) ➔ 21.375
     */
    public double calculateShippingTotal(int weightPounds, boolean hasDiscount) {
        double totalWithOptionalDiscount = 0;
        double totalBeforeDiscount;
        double discountEffect;
        if (weightPounds <= MAX_WEIGHT_POUNDS && hasDiscount == true) {
            totalBeforeDiscount = weightPounds * UP_TO_40_LB_RATE;
            discountEffect = totalBeforeDiscount * 0.10;
            totalWithOptionalDiscount = totalBeforeDiscount - discountEffect;
            return totalWithOptionalDiscount;
        } else if (weightPounds > MAX_WEIGHT_POUNDS && hasDiscount == true) {
            totalBeforeDiscount = (MAX_WEIGHT_POUNDS * UP_TO_40_LB_RATE) + ((weightPounds - MAX_WEIGHT_POUNDS) * OVER_40_LB_RATE);
            discountEffect = totalBeforeDiscount * 0.10;
            totalWithOptionalDiscount = totalBeforeDiscount - discountEffect;
        } else if (weightPounds <= MAX_WEIGHT_POUNDS && hasDiscount == false) {
            totalWithOptionalDiscount = weightPounds * UP_TO_40_LB_RATE;
            return totalWithOptionalDiscount;
        } else if (weightPounds > MAX_WEIGHT_POUNDS && hasDiscount == false) {
            totalWithOptionalDiscount = (MAX_WEIGHT_POUNDS * UP_TO_40_LB_RATE) + ((weightPounds - MAX_WEIGHT_POUNDS) * OVER_40_LB_RATE);
            return totalWithOptionalDiscount;
        }
        return totalWithOptionalDiscount;
    }

    /*
    As the business grows for Scamper Shipping Company, they now offer discounts in various amounts.
    Implement the logic to calculate the shipping rate when provided a weight in pounds
    and a discount percentage (for example, 0.1 = 10% off).

    Examples:
    calculateShippingTotal(10, 0) ➔ 5.0
    calculateShippingTotal(10, 0.1) ➔ 4.5
    calculateShippingTotal(25, 0.15) ➔ 10.625
    calculateShippingTotal(45, 0.2) ➔ 19.0
     */
    public double calculateShippingTotal(int weightPounds, double discountPercentage) {
        double shippingTotal = 0;
        double discountEffect;
        double beforeDiscount;
        if (weightPounds <= MAX_WEIGHT_POUNDS) {
            beforeDiscount = weightPounds * UP_TO_40_LB_RATE;
            discountEffect = beforeDiscount * discountPercentage;
            shippingTotal = beforeDiscount - discountEffect;
            return shippingTotal;
        } else if (weightPounds > MAX_WEIGHT_POUNDS) {
            beforeDiscount = (MAX_WEIGHT_POUNDS * UP_TO_40_LB_RATE) + ((weightPounds - MAX_WEIGHT_POUNDS) * OVER_40_LB_RATE);
            discountEffect = beforeDiscount * discountPercentage;
            shippingTotal = beforeDiscount - discountEffect;
            return shippingTotal;
        }
        return shippingTotal;
    }
}
