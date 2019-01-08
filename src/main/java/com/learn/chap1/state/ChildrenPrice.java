package com.learn.chap1.state;

import com.learn.chap1.Movie;

/**
 * @author zx
 * @date 2019/1/8 下午9:53
 */
public class ChildrenPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDREN;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
}
