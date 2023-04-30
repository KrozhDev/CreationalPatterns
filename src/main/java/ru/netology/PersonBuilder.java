package ru.netology;

public class PersonBuilder {

    protected String name;
    protected String surname;
    protected Integer age;
    protected String address;

    public String getName() {
        return name;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder age(Integer age) {
        this.age = age;
        return this;
    }
    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.name == null | this.surname == null) {
            throw new IllegalStateException("Нужно обязательно ввести имя и фамилию человека" );
        }
        if (this.age < 0) {
            throw new IllegalStateException("Нужно ввести корректный возраст");
        }
        return new Person(name, surname, age);
    }

}
