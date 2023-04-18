import java.util.Objects;

public class Person implements Comparable<Person>{

    String name;
    int phone;
    String email;

    public Person(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", phone=" + phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return phone == person.phone
                && Objects.equals(name, person.name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }



    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

}
