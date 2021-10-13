
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Creating Pasengers Objects

        Passengers p1 = new Passengers("Raju", "12345", "Andheri", "Mumbai", "MH", "A. Kumar", "ak@gmail.com", "8895277896");
        Passengers p2 = new Passengers("Babu", "12345", "Andheri", "Mumbai", "MH", "B. Rao", "br@gmail.com", "9748196996");
        Passengers p3 = new Passengers("Shyam", "12345", "Andheri", "Mumbai", "MH", "S. Singh", "ss@gmail.com", "9748196378");
        Passengers p4 = new Passengers("Kachra", "12345", "Andheri", "Mumbai", "MH", "K. Seth", "ks@gmail.com", "9748196787");
        Passengers p5 = new Passengers("Anuradha", "12345", "Andheri", "Mumbai", "MH", "A. Rao", "ar@gmail.com", "9748155689");

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\t.....Flight Reservation System.....\n");
        System.out.println("1. Login\n2. Exit\n");
        System.out.print("Enter Your Choice  ");
        int x = sc.nextInt();
        do {
            switch (x) {
                case 1:
                    System.out.print("Enter userId : ");
                    String user = sc.next();
                    System.out.print("Enter password : ");
                    String password = sc.next();
                    if (p1.getUser().equals(user) && p1.getPassword().equals(password)) {
                        userLogin(p1);
                    } else if (p2.getUser().equals(user) && p2.getPassword().equals(password)) {
                        userLogin(p2);
                    } else if (p3.getUser().equals(user) && p3.getPassword().equals(password)) {
                        userLogin(p3);
                    } else if (p4.getUser().equals(user) && p4.getPassword().equals(password)) {
                        userLogin(p4);
                    } else if (p5.getUser().equals(user) && p5.getPassword().equals(password)) {
                        userLogin(p5);
                    } else {
                        System.out.println("Invalid Credentials !!");
                        return;
                    }
                    break;
                case 2:
                    x=2;
                default:
                    System.out.println("Invalid Choice");
                    return;
            }
        } while (x != 2);
    }

    public static void userLogin(Passengers p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello " + p.getUser());
        int x;
        do {
            System.out.println("1. Check Flights \n2. View Contact Details \n3. View Address Details \n4. Logout");
            System.out.println("Enter ur choice ");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Id : f1  Airline : Lufthansa\nId : f2  Airline : Emirates\nId : f3  Airline : Air India\nId : f4  Airline : Qatar\nId : f5  Airline : Air Asia");
                    System.out.println("Enter the flight Name of ur choice  :");
                    String f = sc.next();
                    flight(f, p);
                    break;
                case 2:
                    System.out.println(p.getContact());
                    System.out.println("Want to Update Contact  y/n");
                    char a = sc.next().charAt(0);
                    if (a == 'y') {
                        System.out.println("Enter Name, Phone Number And Email");
                        String name = sc.next();
                        String phoneNumber = sc.next();
                        String email = sc.next();
                        p.setContact(name, phoneNumber, email);
                    }
                    break;
                case 3:
                    System.out.println(p.getAddress());
                    System.out.println("Want to Update Address   y/n");
                    char c = sc.next().charAt(0);
                    if (c == 'y') {
                        System.out.println("Enter Street, City And State");
                        String street = sc.next();
                        String city = sc.next();
                        String state = sc.next();
                        p.setAddress(street, city, state);
                    }
                    break;
                case 4:
                    x = 4;
                    break;
                default:
                    System.out.println("Invalid Choice !!!");
            }
        } while (x != 4);
    }

    public static void flight(String f, Passengers p) {
        //Creating Flight objects
        Scanner sc = new Scanner(System.in);
        Flight f1 = new Flight(236, "Lufthansa", 123);
        Flight f2 = new Flight(258, "Emirates", 312);
        Flight f3 = new Flight(379, "Air_India", 223);
        Flight f4 = new Flight(333, "Qatar", 300);
        Flight f5 = new Flight(856, "Air_Asia", 296);

        if (f1.getAirLine().equals(f)) {
            System.out.println(f1.flightDet());
            System.out.println("Book this Flight  y/n");
            char c = sc.next().charAt(0);
            if (c == 'y') {
                ticket(f1, p);
            }
        } else if (f2.getAirLine().equals(f)) {
            System.out.println(f2.flightDet());
            System.out.println("Book this Flight  y/n");
            char c = sc.next().charAt(0);
            if (c == 'y') {
                ticket(f2, p);
            }
        } else if (f3.getAirLine().equals(f)) {
            System.out.println(f3.flightDet());
            System.out.println("Book this Flight  y/n");
            char c = sc.next().charAt(0);
            if (c == 'y') {
                ticket(f3, p);
            }
        } else if (f4.getAirLine().equals(f)) {
            System.out.println(f4.flightDet());
            System.out.println("Book this Flight  y/n");
            char c = sc.next().charAt(0);
            if (c == 'y') {
                ticket(f4, p);
            }
        } else if (f5.getAirLine().equals(f)) {
            System.out.println(f5.flightDet());
            System.out.println("Book this Flight  y/n");
            char c = sc.next().charAt(0);
            if (c == 'y') {
                ticket(f5, p);
            }
        } else {
            System.out.println("Invalid Choice");
        }
    }

    public static void ticket(Flight f, Passengers p) {
        Scanner sc = new Scanner(System.in);
        int pnr = 100;

        RegularTicket rt1 = new RegularTicket(100, "Mumbai", "Kolkata", "12/09/21  14:30", "12/09/21  17:52", 2236.0, f, p);
        RegularTicket rt2 = new RegularTicket(101, "Chennai", "Kolkata", "16/09/21  14:30", "16/09/21  17:52", 4236.0, f, p);
        RegularTicket rt3 = new RegularTicket(123, "Delhi", "Chennai", "18/10/21  14:30", "18/10/21  17:52", 3236.0, f, p);
        RegularTicket rt4 = new RegularTicket(321, "Mumbai", "Delhi", "12/09/21  14:30", "12/09/21  17:52", 4436.0, f, p);
        RegularTicket rt5 = new RegularTicket(859, "Mumbai", "Hyderabad", "13/09/21  14:30", "13/09/21  17:52", 2236.0, f, p);

        TouristTicket tt1 = new TouristTicket(100, "Mumbai", "Kolkata", "13/09/21  12:30", "13/09/21  14:30", 3560.0, f, p);
        TouristTicket tt2 = new TouristTicket(101, "Delhi", "Kolkata", "13/09/21  12:30", "13/09/21  14:30", 5560.0, f, p);
        TouristTicket tt3 = new TouristTicket(123, "Mumbai", "Chennai", "13/09/21  12:30", "13/09/21  14:30", 4560.0, f, p);
        TouristTicket tt4 = new TouristTicket(321, "Kerela", "Kolkata", "13/09/21  12:30", "13/09/21  15:30", 6560.0, f, p);
        TouristTicket tt5 = new TouristTicket(859, "Mumbai", "J & K", "13/09/21  12:30", "13/09/21  19:30", 7560.0, f, p);
        int x;
        do {
            System.out.println("Which one to book  \n1. Regular Ticket\n2. Tourist Ticket \n3. Exit");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("1 . Departure : " + rt1.getDeparture() + " Destination : " + rt1.getDestination() + " Date and Time of Dep: " + rt1.getDateAndTimeOfDep() + " Date and Time of arrival :" + rt1.getDateAndTimeOfArr() + " Price : " + rt1.getPrice());
                    System.out.println("2 . Departure : " + rt2.getDeparture() + " Destination : " + rt2.getDestination() + " Date and Time of Dep: " + rt2.getDateAndTimeOfDep() + " Date and Time of arrival :" + rt2.getDateAndTimeOfArr() + " Price : " + rt2.getPrice());
                    System.out.println("3 . Departure : " + rt3.getDeparture() + " Destination : " + rt3.getDestination() + " Date and Time of Dep: " + rt3.getDateAndTimeOfDep() + " Date and Time of arrival :" + rt3.getDateAndTimeOfArr() + " Price : " + rt3.getPrice());
                    System.out.println("4 . Departure : " + rt4.getDeparture() + " Destination : " + rt4.getDestination() + " Date and Time of Dep: " + rt4.getDateAndTimeOfDep() + " Date and Time of arrival :" + rt4.getDateAndTimeOfArr() + " Price : " + rt4.getPrice());
                    System.out.println("5 . Departure : " + rt5.getDeparture() + " Destination : " + rt5.getDestination() + " Date and Time of Dep: " + rt5.getDateAndTimeOfDep() + " Date and Time of arrival :" + rt5.getDateAndTimeOfArr() + " Price : " + rt5.getPrice());
                    System.out.println();
                    System.out.println("Choose from the following  ");
                    int n = sc.nextInt();
                    switch (n) {
                        case 1:
                            bookTicket(f, p, rt1);
                            break;
                        case 2:
                            bookTicket(f, p, rt2);
                            break;
                        case 3:
                            bookTicket(f, p, rt3);
                            break;
                        case 4:
                            bookTicket(f, p, rt4);
                            break;
                        case 5:
                            bookTicket(f, p, rt5);
                            break;
                        default:
                            System.out.println("Invalid Choice   ");
                            break;
                    }
                case 2:
                    System.out.println("1 . Departure : " + tt1.getDeparture() + " Destination : " + tt1.getDestination() + " Date and Time of Dep: " + tt1.getDateAndTimeOfDep() + " Date and Time of arrival :" + tt1.getDateAndTimeOfArr() + " Price : " + tt1.getPrice());
                    System.out.println("2 . Departure : " + tt2.getDeparture() + " Destination : " + tt2.getDestination() + " Date and Time of Dep: " + tt2.getDateAndTimeOfDep() + " Date and Time of arrival :" + tt2.getDateAndTimeOfArr() + " Price : " + tt2.getPrice());
                    System.out.println("3 . Departure : " + tt3.getDeparture() + " Destination : " + tt3.getDestination() + " Date and Time of Dep: " + tt3.getDateAndTimeOfDep() + " Date and Time of arrival :" + tt3.getDateAndTimeOfArr() + " Price : " + tt3.getPrice());
                    System.out.println("4 . Departure : " + tt4.getDeparture() + " Destination : " + tt4.getDestination() + " Date and Time of Dep: " + tt4.getDateAndTimeOfDep() + " Date and Time of arrival :" + tt4.getDateAndTimeOfArr() + " Price : " + tt4.getPrice());
                    System.out.println("5 . Departure : " + tt5.getDeparture() + " Destination : " + tt5.getDestination() + " Date and Time of Dep: " + tt5.getDateAndTimeOfDep() + " Date and Time of arrival :" + tt5.getDateAndTimeOfArr() + " Price : " + tt5.getPrice());
                    System.out.println();
                    System.out.println("Choose from the following  ");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            bookTTicket(f, p, tt1);
                            break;
                        case 2:
                            bookTTicket(f, p, tt2);
                            break;
                        case 3:
                            bookTTicket(f, p, tt3);
                            break;
                        case 4:
                            bookTTicket(f, p, tt4);
                            break;
                        case 5:
                            bookTTicket(f, p, tt5);
                            break;
                        default:
                            System.out.println("Invalid Choice   ");
                            break;
                    }
                case 3: x=3;
                break;
                default:
                    System.out.println("Invalid");
            }
        } while (x != 3);
    }
    public static void bookTTicket(Flight f, Passengers p, TouristTicket tt) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Tourist Location (Max 5)");
        int n = sc.nextInt();
        String[] tl = new String[n];
        System.out.println("Enter Them  ");
        for (int i = 0; i < n; i++) {
            tl[i] = sc.next();
        }
        tt.setTouristLocation(tl);
        System.out.println("How many Seats  ");
        int seats = sc.nextInt();
        System.out.println("Enter hotel Address");
        String ha = sc.next();
        tt.setHotelAddress(ha);
        f.updateSeats(seats);
        tt.setStatus("Confirmed");
        System.out.println("Ticket Booked");
        int x=1;
        while (x!=5) {
            System.out.println("1. View Tourist Locations\n2. Update TouristLocation\n3. Cancel Flight\n4. Print Ticket Details\n5. Exit\n6. View Hotel Address\n7. Update Hotel Addresss");
            System.out.println("Enter ");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    tl = tt.getTouristLocation();
                    for (int i = 0; i < tl.length; i++) {
                        System.out.println(tl[i]);
                    }
                    break;
                case 2:
                    System.out.println("Enter the Tourist Location");
                    for (int i = 0; i < n; i++) {
                        tl[i] = sc.next();
                    }
                    tt.setTouristLocation(tl);
                    break;
                case 3: tt.setStatus("Cancelled");
                    System.out.println("Cancelled");
                    System.out.println(tt.getStatus());
                    break;
                case 4: ticketDet(tt);
                    break;
                case 5: x=5;
                    break;
                case 6:
                    System.out.println(tt.getHotelAddress());
                    break;
                case 7:
                    System.out.println("Enter the hotel Address");
                    ha= sc.next();
                    tt.setHotelAddress(ha);
                default:
                    System.out.println("Invalid");
            }
        }
    }


    public static void bookTicket(Flight f, Passengers p, RegularTicket rt) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Special Services(Water,Food And Snacks  ");
        int n = sc.nextInt();
        String[] sp = new String[n];
        System.out.println("Enter Them  ");
        for (int i = 0; i < n; i++) {
            sp[i] = sc.next();
        }
        rt.setSpecialServices(sp);
        System.out.println("How many Seats  ");
        int seats = sc.nextInt();
        f.updateSeats(seats);
        rt.setStatus("Confirmed");
        System.out.println("Ticket Booked");
        int x=1;
        while (x!=5) {
            System.out.println("1. View Special Services\n2. Update Special Services\n3. Cancel Flight\n4. Print Ticket Details\n5. Exit");
            System.out.println("Enter ");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    sp = rt.getSpecialServices();
                    for (int i = 0; i < sp.length; i++) {
                        System.out.println(sp[i]);
                    }
                    break;
                case 2:
                    System.out.println("Enter the special service");
                    for (int i = 0; i < n; i++) {
                        sp[i] = sc.next();
                    }
                    rt.setSpecialServices(sp);
                    break;
                case 3: rt.setStatus("Cancelled");
                    System.out.println("Cancelled");
                    System.out.println(rt.getStatus());
                        break;
                case 4: ticketDet(rt);
                        break;
                case 5: x=5;
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
    public static void ticketDet(Ticket rt){
        if(rt.getStatus().equals("Confirmed")){
            System.out.println("PNR"+rt.getPnrNo()+" Departure : " + rt.getDeparture() + " Destination : " + rt.getDestination() + " Date and Time of Dep: " + rt.getDateAndTimeOfDep() + " Date and Time of arrival :" + rt.getDateAndTimeOfArr() + " Price : " + rt.getPrice());
        }
        else {
            System.out.println("No Ticket");
        }
    }
}