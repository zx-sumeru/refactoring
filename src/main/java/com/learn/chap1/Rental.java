package com.learn.chap1;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zx
 * @date 2019/1/8 下午8:51
 */
@AllArgsConstructor
@Data
public class Rental {
    Movie movie;
    private int daysRented;

    public int getFrequentRenterPoints() {
        //int frequentRenterPoints = 0;
        //frequentRenterPoints++;
        //
        //if (getMovie().getPriceCode() == Movie.NEW_RELEASE && getDaysRented() > 1) {
        //    frequentRenterPoints++;
        //}
        //return frequentRenterPoints;

        return movie.getFrequentRenterPoints(daysRented);
    }

    public double getCharge() {
        return movie.getCharge(daysRented);
    }
}
