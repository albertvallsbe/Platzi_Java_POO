
package model;

public abstract class User {

    //Atributs
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El numero...");
        }else if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
        
    }

    @Override
    public String toString() {
        return "User: " + name + ", Email: " +email + "\n Address: " + address + ". Phone: " + phoneNumber;
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public abstract void showDataUser();
    
    
}