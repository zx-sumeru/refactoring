package com.learn.chap1.state;

/**
 * @author zx
 * @date 2019/1/8 下午9:53
 */
public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);


    public int getFrequentRenterPoints(int daysRented) {
        return 1;
        //if (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1) {
        //    return 2;
        //} else {
        //    return 1;
        //}
    }
}
