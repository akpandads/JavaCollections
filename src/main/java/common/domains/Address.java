package common.domains;

public class Address {
    private String city;
    private String houseNumber;
    private String street;
    private String pinCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder(500);
        builder.append("HouseNumber: "+houseNumber+"\t");
        builder.append("Street: "+street+"\t");
        builder.append("Pincode: "+pinCode+"\t");
        builder.append("City: "+city);
        return builder.toString();
    }
}
