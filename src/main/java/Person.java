import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        if(this.name.compareToIgnoreCase(o.name) == 0) {
            return this.age.compareTo(o.age);
        }
        return this.name.compareToIgnoreCase(o.name);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && age.equals(person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
