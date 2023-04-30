package ru.netology;

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age;


    protected String address;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday(){
        if (this.hasAge()) {
            age += 1;
        }
    }
    public boolean hasAge(){
        if (age != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAddress(){
        if (address != null) {
            return true;
        } else {
            return false;
        }
    }

    public PersonBuilder newChildBuilder(){
        PersonBuilder personBuilder = new PersonBuilder();
        return personBuilder
                .surname(this.getSurname())
                .age(0)
                .address(this.hasAddress() ? this.getAddress(): null);
    }


    @Override
    public String toString(){
        return name + " " + surname + " " + (hasAge() ? age: "") + " " + (hasAddress() ? age: "");
    }

//    @Override
//    public int Hashcode{
//
//    }


}
