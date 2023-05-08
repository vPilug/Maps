import java.util.Objects;

public class Address {
    private String streetName;
    private String streetNumber;
    private String country;

    public Address(String streetName, String streetNumber, String country) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return country.equals(address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country);
    }
}

