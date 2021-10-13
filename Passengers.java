import java.util.SimpleTimeZone;

public class Passengers {
    private Address address;
    private Contact contact;
    private String user;
    private String password;
    private static int idCounter=1;
    private int id;
    public int getPassengerCount(){
        return idCounter;
    }
    public String getContact(){
        return "Name : "+contact.name+"\nPhone Number : "+contact.phoneNumber+"\nEmail : "+contact.email;
    }
    public void setContact(String name,String phoneNumber,String email){
        contact.name=name;
        contact.phoneNumber=phoneNumber;
        contact.email=email;
    }
    public String getAddress(){

        return "Street : "+address.street+"\nCity : "+address.city+"\nState : "+address.state;
    }
    public void setAddress(String street,String city, String state){
        address.state=state;
        address.street=street;
        address.city=city;
    }
    //Passengers Constructor
    Passengers(String user,String password,String street,String city,String state,String name,String email,String phoneNumber){
        this.user=user;
        this.password=password;
        id=idCounter++;
        address=new Address(street, city, state);
        contact=new Contact(name, phoneNumber, email);
    }
    private static class Contact{
        private String name;
        private String phoneNumber;
        private String email;
        Contact(String name,String phoneNumber,String email){
            this.name=name;
            this.phoneNumber=phoneNumber;
            this.email=email;
        }
    }
    private static class Address{
        private String street;
        private String city;
        private String state;
        Address(String street,String city,String state){
            this.street=street;
            this.city=city;
            this.state=state;
        }
    }
    public String getUser(){
        return user;
    }
    public String getPassword(){
        return password;
    }
}
/*Getters and Setters are provided for every Attribute*/