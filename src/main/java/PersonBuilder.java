import validator.PersonValidator;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    private boolean isAgeKnown;
    protected String address;
    private boolean isAddressKnown;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        PersonValidator.validate(age);
        this.age = age;
        isAgeKnown = true;
        return this;
    }

    public PersonBuilder setAddress(String city) {
        address = city;
        isAddressKnown = true;
        return this;
    }

    public Person build() {
        PersonValidator.validate(name, surname);

        Person person;
        if (isAgeKnown) {
            person = new Person(name, surname, age);
        } else {
            person = new Person(name, surname);
        }

        if (isAddressKnown) {
            person.setAddress(address);
        }
        return person;
    }
}
