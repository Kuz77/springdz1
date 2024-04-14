package org.example;

import com.google.gson.Gson;
import org.example.Person;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Илья", "Куз", 30);

        person.setFirstName("Илья");
        person.setLastName("Куз");
        person.setAge(30);


        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("Serialized JSON: " + json);


        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println("Deserialized Person: " + deserializedPerson);
    }
}

