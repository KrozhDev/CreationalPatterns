package ru.netology;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Petr", "Makarov");
        person1.setAddress("Moskva");
        person1.getAddress();

        PersonBuilder personBuilder = new PersonBuilder();

        Person person2 = personBuilder
                .setName("Ivan")
                .setSurname("Petrov")
                .setAge(19)
                .setAddress("Moskva")
                .build();

        Person person2Child = person2.newChildBuilder().setName("Vasya").build();

        System.out.println(person2.toString());
        System.out.println(person2Child.toString());

        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);


        try {
            // Не хватает обязательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setName("Vova").setSurname("Kozlov").setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }





    }
}