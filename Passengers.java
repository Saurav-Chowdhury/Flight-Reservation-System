public class Passengers {
    private Address address;
    private Contact contact;
    private String user;
    private String password;
    private Boolean login=false;
    private static int idCounter=1;
    public int getPassengerCount(){
        return idCounter;
    }
    Passengers(int id,String user,String password,Address address,Contact contact){
        this.user=user;
        this.password=password;
        id=idCounter++;
        this.address=address;
        this.contact=contact;
    }
    private static class Contact{
        String name;
        int phoneNumber;
        String email;
        Contact(String name,int phoneNumber,String email){
            this.name=name;
            this.phoneNumber=phoneNumber;
            this.email=email;
        }
        public String getContact(){
            return "Name : "+name+"\nPhone Number : "+phoneNumber+"\n Email : "+email;
        }
        public void setContact(String name,int phoneNumber,String email){
            this.name=name;
            this.phoneNumber=phoneNumber;
            this.email=email;
        }
    }
    private static class Address{
        String street;
        String city;
        String state;
        Address(String street,String city,String state){
            this.street=street;
            this.city=city;
            this.state=state;
        }
        public String getAddress(){
            return "Street : "+street+"\nCity : "+city+"\nState : "+state;
        }
        public void setAddress(String street,String city, String state){
            this.state=state;
            this.street=street;
            this.city=city;
        }
    }
}
