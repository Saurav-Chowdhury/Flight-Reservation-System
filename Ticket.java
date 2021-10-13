public abstract class Ticket {
    private int pnrNo;
    private String departure;
    private String destination;
    private Flight flight;
    private String dateAndTimeOfDep;
    private String dateAndTimeOfArr;
    private String status="Confimed";
    private Passengers passenger_Det;
    private Boolean cancel=false;
    private double price;

    //Ticket Constructor


    public Ticket(int pnrNo,String departure,String destination,String dateAndTimeOfDep,String dateAndTimeOfArr,double price,Flight flight,Passengers passenger_Det){
        this.pnrNo=pnrNo;
        this.departure=departure;
        this.destination=destination;
        this.dateAndTimeOfArr=dateAndTimeOfArr;
        this.dateAndTimeOfDep=dateAndTimeOfDep;
        this.price=price;
        this.flight=flight;
        this.passenger_Det=passenger_Det;
    }

    public String getDeparture() {
        return departure;
    }

    public int getPnrNo() {
        return pnrNo;
    }

    public void setPnrNo(int pnrNo) {
        this.pnrNo = pnrNo;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getDateAndTimeOfDep() {
        return dateAndTimeOfDep;
    }

    public void setDateAndTimeOfDep(String dateAndTimeOfDep) {
        this.dateAndTimeOfDep = dateAndTimeOfDep;
    }

    public String getDateAndTimeOfArr() {
        return dateAndTimeOfArr;
    }

    public void setDateAndTimeOfArr(String dateAndTimeOfArr) {
        this.dateAndTimeOfArr = dateAndTimeOfArr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Passengers getPassenger_Det() {
        return passenger_Det;
    }

    public void setPassenger_Det(Passengers passenger_Det) {
        this.passenger_Det = passenger_Det;
    }

    public Boolean getCancel() {
        return cancel;
    }

    public void setCancel(Boolean cancel) {
        this.cancel = cancel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
/*Getters and Setters for everything provided*/