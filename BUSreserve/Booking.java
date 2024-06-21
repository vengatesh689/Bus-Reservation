package BUSreserve;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
    String passenger_name;
    int busno;
    Date date;

    Booking(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the passenger name : ");
        passenger_name = scan.next();
        System.out.println("Enter bus no : ");
        busno = scan.nextInt();
        System.out.println("Enter date dd-MM-yyyy");
        String dateinput = scan.next();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyy");
        try {
            date = dateformat.parse(dateinput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isAvailable(ArrayList<Booking> booking, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses){
            if (bus.getbusno() == busno)
                capacity = bus.getCapacity();
        }
        int booked = 0;
        for (Booking b : booking){
            if (b.busno == busno && b.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity?true:false;
    }
}
