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

        Address address1 = new Address("Donath", "12", "Romania");
        Address address2 = new Address("Pierre Cardine", "42", "Franta");
        List<Address> addressesListWorkout = new ArrayList<>();
        addressesListWorkout.add(address1);
        addressesListWorkout.add(address2);

        Map<Person, List<Hobby>> hobbies = new HashMap<>();

        Hobby workout = new Hobby("workout", 3, addressesListWorkout);
        List<Hobby> hobbiesListVero = new ArrayList<>();
        hobbiesListVero.add(workout);
        hobbies.put(vero, hobbiesListVero);

        Address addressDancing1 = new Address("Sante", "1", "Spania");
        Address addressDancing2 = new Address("Mangus", "2A", "Portugalia");
        List<Address> addressListDancing = new ArrayList<>();
        addressListDancing.add(addressDancing1);
        addressListDancing.add(addressDancing2);

        Hobby dancing = new Hobby("dancing", 2, addressListDancing);
        hobbiesListVero.add(dancing);
        hobbies.put(vero, hobbiesListVero);

        Address addressRunning1 = new Address("Stevens Ave", "3", "USA");
        Address addressRunning2 = new Address("Provinciale", "9", "Italia");

        List<Address> addressListRunning = new ArrayList<>();
        addressListRunning.add(addressRunning1);
        addressListRunning.add(addressRunning2);

        Hobby running = new Hobby("running", 2, addressListRunning);
        List<Hobby> hobbiesListOana = new ArrayList<>();
        hobbiesListOana.add(running);
        hobbies.put(oana, hobbiesListOana);

        Address addressSwimming1 = new Address("Stevens Ave", "3", "USA");
        Address addressSwimming2 = new Address("Provinciale", "9", "Italia");
        List<Address> addressListSwimming = new ArrayList<>();
        addressListSwimming.add(addressSwimming1);
        addressListSwimming.add(addressSwimming2);

        Hobby swimming = new Hobby("swimming", 3, addressListSwimming);
        List<Hobby> hobbyListOana2 = new ArrayList<>();
        hobbyListOana2.add(swimming);
        hobbies.put(oana2, hobbyListOana2); // "oana2" will override "oana" key because both have the same name and age

        for(Map.Entry<Person, List<Hobby>> entry: hobbies.entrySet()) {
            List<Hobby> hobbyList = entry.getValue();
            System.out.println(entry.getKey().getName());
            for (Hobby hobby: hobbyList) {
                List<Address> addressList = hobby.getAddress();
                System.out.print("Hobby: " + hobby.getName() + " | Countries: ");
                for(Address address: addressList){
                    System.out.print(address.getCountry() + " ");
                }
                System.out.println("");
            }
            System.out.println("__________");
        }

    }
}
