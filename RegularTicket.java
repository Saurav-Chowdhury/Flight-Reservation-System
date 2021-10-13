public class RegularTicket extends Ticket {
    private String[] specialServices = new String[3];

    public RegularTicket(int pnrNo, String departure, String destination, String dateAndTimeOfDep, String dateAndTimeOfArr, double price, Flight flight, Passengers passenger_Det) {
        super(pnrNo, departure, destination, dateAndTimeOfDep, dateAndTimeOfArr, price, flight, passenger_Det);
    }

    public String[] getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String[] specialServices) {
        this.specialServices = specialServices;
    }
}
