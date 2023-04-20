import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
    List<Adress> adress = new ArrayList<Adress>();

    public Hobby(String name, int frequency, List<Adress> adress) {
        this.name = name;
        this.frequency = frequency;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", adress=" + adress +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Adress> getAdress() {
        return adress;
    }

}
