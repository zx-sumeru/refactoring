package com.learn.chap1;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zx
 * @date 2019/1/8 下午8:52
 */
@Data
public class Customer {
    private String name;
    private List<Rental> rentals;

    public void addRental(Rental rental) {
        if (rentals == null) {
            rentals = new ArrayList<Rental>();
        }
        rentals.add(rental);
    }

    public String statement() {
        //double totalAmount = 0;
        //int frequentRenterPoints = 0;
        Iterator<Rental> iterator = rentals.iterator();
        StringBuilder stringBuilder = new StringBuilder("Rental record for " + getName() + "\n");
        while (iterator.hasNext()) {
            Rental aRental = iterator.next();

            //frequentRenterPoints += aRental.getFrequentRenterPoints();

            stringBuilder.append("\t")
                    .append(aRental.getMovie().getTitle())
                    .append("\t")
                    .append(aRental.getCharge())
                    .append("\n");

            //totalAmount += aRental.getCharge();
        }

        stringBuilder.append("Amount owed is ")
                .append(getTotalAmount())
                .append("\n");
        stringBuilder.append("You earned ")
                .append(getTotalFrequentRenterPoints())
                .append(" frequent renter points");

        return stringBuilder.toString();
    }

    public double getTotalAmount() {
        double result = 0;
        //rentals.forEach(rental->{
        //    result += rental.getCharge();
        //});
        for (Rental rental : rentals) {
            result += rental.getCharge();
        }
        return result;
    }

    public int getTotalFrequentRenterPoints() {
        int points = 0;
        for (Rental rental : rentals) {
            points += rental.getFrequentRenterPoints();
        }
        return points;
    }




}
