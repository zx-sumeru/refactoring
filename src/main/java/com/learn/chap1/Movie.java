package com.learn.chap1;

import com.learn.chap1.state.ChildrenPrice;
import com.learn.chap1.state.NewReleasePrice;
import com.learn.chap1.state.Price;
import com.learn.chap1.state.RegularPrice;
import lombok.Data;

/**
 * @author zx
 * @date 2019/1/8 下午8:49
 */
@Data
public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        //this.priceCode = priceCode;
        setPriceCode(priceCode);
    }

    private void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                price = new RegularPrice();
            case CHILDREN:
                price = new ChildrenPrice();
            case NEW_RELEASE:
                price = new NewReleasePrice();
            default:
                throw new IllegalArgumentException("incorrect priceCode");
        }
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }



    public double getCharge(int daysRented) {
        //double result = 0;
        //switch (this.getPriceCode()) {
        //    case REGULAR:
        //        result += 2;
        //        if (daysRented > 2) {
        //            result += (daysRented - 2) * 1.5;
        //        }
        //        break;
        //    case NEW_RELEASE:
        //        result += daysRented * 3;
        //        break;
        //    case CHILDREN:
        //        result += 1.5;
        //        if (daysRented > 3) {
        //            result += (daysRented - 3) * 1.5;
        //        }
        //        break;
        //    default:
        //        break;
        //}
        //return result;
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }
}
