package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
abstract class Price {

    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

   int getFrequentRenterPoints(int daysRented) {
       return 1;
   }
}
