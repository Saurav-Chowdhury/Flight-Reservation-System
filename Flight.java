public class Flight {
    private int flightNumber;
    private String airLine;
    private int seats;
    Flight(int flightNumber,String airLine,int seats){
        this.flightNumber=flightNumber;
        this.airLine=airLine;
        this.seats=seats;
    }
    public String flightDet(){
        return "Flight Number : "+flightNumber+"\nAirline : "+airLine+"\nNo. of Seats : "+seats;
    }
    public int availabeSeats(){
        return seats;
    }
    public void updateSeats(int seat){
        this.seats=seats-seat;
    }
    public String getAirLine(){
        return airLine;
    }
}
