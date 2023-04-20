import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        Person vero = new Person("Vero", 24);
        persons.add(vero);
        Person oana = new Person("Oana", 31);
        persons.add(oana);
        Person laura = new Person("Laura", 27);
        persons.add(laura);
        Person diana = new Person("Diana", 33);
        persons.add(diana);
        Person vero2 = new Person("Vero", 4);
        persons.add(vero2);
        Person oana2 = new Person("Oana", 31);
        persons.add(oana2);

        for (Person personsList : persons) {
            System.out.println(personsList);
        }
        System.out.println("__________");

        Set<Person> personAge = new TreeSet<>(new AgeComparator());
        personAge.addAll(persons);
        personAge.add(new Person("Luana", 4));

        for (Person personsListAge : personAge) {
            System.out.println(personsListAge);
        }
        System.out.println("__________");

        Adress adress1 = new Adress("Donath", "12", "Romania");
        Adress adress2 = new Adress("Pierre Cardine", "42", "Franta");
        List<Adress> adressesListWorkout = new ArrayList<>();
        adressesListWorkout.add(adress1);
        adressesListWorkout.add(adress2);

        Map<Person, List<Hobby>> hobbies = new HashMap<>();

        Hobby workout = new Hobby("workout", 3, adressesListWorkout);
        List<Hobby> hobbiesListVero = new ArrayList<>();
        hobbiesListVero.add(workout);
        hobbies.put(vero, hobbiesListVero);

        Adress adressDancing1 = new Adress("Sante", "1", "Spania");
        Adress adressDancing2 = new Adress("Mangus", "2A", "Portugalia");
        List<Adress> adressListDancing = new ArrayList<>();
        adressListDancing.add(adressDancing1);
        adressListDancing.add(adressDancing2);

        Hobby dancing = new Hobby("dancing", 2, adressListDancing);
        hobbiesListVero.add(dancing);
        hobbies.put(vero, hobbiesListVero);

        Adress adressRunning1 = new Adress("Stevens Ave", "3", "USA");
        Adress adressRunning2 = new Adress("Provinciale", "9", "Italia");

        List<Adress> adressListRunning = new ArrayList<>();
        adressListRunning.add(adressRunning1);
        adressListRunning.add(adressRunning2);

        Hobby running = new Hobby("running", 2, adressListRunning);
        List<Hobby> hobbiesListOana = new ArrayList<>();
        hobbiesListOana.add(running);
        hobbies.put(oana, hobbiesListOana);

        Adress adressSwimming1 = new Adress("Stevens Ave", "3", "USA");
        Adress adressSwimming2 = new Adress("Provinciale", "9", "Italia");
        List<Adress> adressListSwimming = new ArrayList<>();
        adressListSwimming.add(adressSwimming1);
        adressListSwimming.add(adressSwimming2);

        Hobby swimming = new Hobby("swimming", 3, adressListSwimming);
        List<Hobby> hobbyListOana2 = new ArrayList<>();
        hobbyListOana2.add(swimming);
        hobbies.put(oana2, hobbyListOana2); // "oana2" will override "oana" key because both have the same name and age

        for(Map.Entry<Person, List<Hobby>> entry: hobbies.entrySet()) {
            List<Hobby> hobbyList = entry.getValue();
            System.out.println(entry.getKey().getName());
            for (Hobby hobby: hobbyList) {
                List<Adress> adressList = hobby.getAdress();
                System.out.print("Hobby: " + hobby.getName() + " | Countries: ");
                for(Adress adress: adressList){
                    System.out.print(adress.getCountry() + " ");
                }
                System.out.println("");
            }
            System.out.println("__________");
        }

    }
}
