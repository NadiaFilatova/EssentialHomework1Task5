package homework;

public class Address {

    int index;
    String country;
    String city;
    String street;
    int house;
    int apartment;

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }


    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;

    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;

    }

    public void setHouse(int house) {
        this.house = house;
    }

    public Integer getHouse() {
        return house;

    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public Integer getApartment() {
        return apartment;
    }


    public String toString() {
        return "Index: " + getIndex() +
                "\nCountry: " + getCountry() +
                "\nCity: " + getCity() +
                " \nStreet: " + getStreet() +
                "\nHouse: " + getHouse() +
                "\nApartment :" + getApartment();
    }
}
