package com.learn.chap1.state;

import com.learn.chap1.Movie;

/**
 * @author zx
 * @date 2019/1/8 下午9:54
 */
public class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }
}
