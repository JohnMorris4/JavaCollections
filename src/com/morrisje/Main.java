package com.morrisje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Theatre theatre = new Theatre("Windsong", 8, 12);



        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay for seat D12");
            System.out.println();
        } else {
            System.out.println("Seat is already reserved");
        }

        if(theatre.reserveSeat("F06")){
            System.out.println("Please pay for seat F06");
        } else {
            System.out.println("Seat is already reserved");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("C00", 7.00));
        priceSeats.add(theatre.new Seat("A00", 4.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + "-$" + seat.getPrice());
        }
        System.out.println();
        System.out.println("==================");
    }


}

