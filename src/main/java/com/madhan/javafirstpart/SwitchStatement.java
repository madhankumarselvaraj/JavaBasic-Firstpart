/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.javafirstpart;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class SwitchStatement {

public static void main(String[] args) {

    int month = 7;
    String returnMonth = "";
    switch (month) {
    case 1:
        returnMonth = "January";
        break;
    case 2:
        returnMonth = "February";
        break;
    case 3:
        returnMonth = "March";
        break;
    case 4:
        returnMonth = "April";
        break;
    case 5:
        returnMonth = "May";
        break;
    case 6:
        returnMonth = "June";
        break;
    case 7:
        returnMonth = "July";
        break;
    case 8:
        returnMonth = "August";
        break;
    case 9:
        returnMonth = "September";
        break;
    case 10:
        returnMonth = "October";
        break;
    case 11:
        returnMonth = "November";
        break;
    case 12:
        returnMonth = "December";
        break;
    default:
        System.out.println("Invalid Month!");
    }
    System.out.println(returnMonth);
}

}
