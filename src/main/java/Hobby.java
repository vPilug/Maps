import java.util.Collections;
import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
    List<Address> addresses;

    public Hobby(String name, int frequency, List<Address> addresses) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = Collections.unmodifiableList(addresses);
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", addresses=" + addresses +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Address> getAddress() {
        return addresses;
    }

}
