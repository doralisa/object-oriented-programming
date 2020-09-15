package override;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;

    public Person () {}

    public Person (String name) {
        this.name = name;
    }

    public Person (String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person { name=" + name
                + "lastname=" + lastName + "}";
    }

    @Override
    public int hashCode() {
        return -31 * Objects.hash(name, lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null || this.getClass() != obj.getClass()) return false;
        Person that = (Person) obj;
        return name.equals(that.name) &&
                lastName.equals(that.lastName);
    }

}
