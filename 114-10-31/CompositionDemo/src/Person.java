public class Person {

    private String name;
    private ID;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Birth Date: %s", name, birthDate);
    }
}