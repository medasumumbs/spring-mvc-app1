package ru.mvc.spring.dao;

import org.springframework.stereotype.Component;
import ru.mvc.spring.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    /// Блок инициализации
    {
        people = new ArrayList<Person>();
        people.add(new Person(++PEOPLE_COUNT,"Tom"));
        people.add(new Person(++PEOPLE_COUNT,"Jacob"));
        people.add(new Person(++PEOPLE_COUNT,"Kyle"));
        people.add(new Person(++PEOPLE_COUNT,"Stacy"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

}
