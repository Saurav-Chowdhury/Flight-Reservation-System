public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String[] touristLocation = new String[5];

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocation() {
        return touristLocation;
    }

    public void setTouristLocation(String[] touristLocation) {
        this.touristLocation = touristLocation;
    }

    public TouristTicket(int pnrNo, String departure, String destination, String dateAndTimeOfDep, String dateAndTimeOfArr, double price, Flight flight, Passengers passenger_Det) {
        super(pnrNo, departure, destination, dateAndTimeOfDep, dateAndTimeOfArr, price, flight, passenger_Det);
    }
}