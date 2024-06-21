package BUSreserve;

import java.util.ArrayList;
import java.util.Scanner;

public class Busdemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> booking = new ArrayList<>();

        buses.add(new Bus(1,true,3));
        buses.add(new Bus(2,false,55));
        buses.add(new Bus(3,true,50));

        int useropt = 1;
        Scanner scan = new Scanner(System.in);
        for(Bus b:buses){
            b.displaybusinfo();
        }
        while(useropt == 1) {
            System.out.println("Enter 1 to Book or any to Exit");
            useropt = scan.nextInt();
            if (useropt == 1){
                Booking bookings = new Booking();
                if (bookings.isAvailable(booking,buses)){
                    booking.add(bookings);
                    System.out.println("Your booking is confirmed");
                }
                else {
                    System.out.println("Bus is full, Try another date or bus.");
                }
            }
        }
    }
}
