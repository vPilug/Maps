import java.util.Objects;

public class Adresses {
    private String streetName;
    private String streetNumber;
    private String country;

    public Adresses(String streetName, String streetNumber, String country) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Adress{" +
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
        Adresses adress = (Adresses) o;
        return country.equals(adress.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country);
    }
}

