package com.learn.chap1;

/**
 * @author zx
 * @date 2019/1/8 下午9:07
 */
public class Test1 {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("DDa");
        movie.setPriceCode(Movie.NEW_RELEASE);

        Rental rental = new Rental(movie, 3);
        Customer customer = new Customer();
        customer.setName("Jack");
        customer.addRental(rental);
        String statement = customer.statement();
        System.out.println(statement);
    }
}
