package com.session.tdd.testexamples;

import com.session.tdd.testexamples.models.Person;

import java.util.concurrent.atomic.AtomicLong;

public class PersonService implements IPersonService {
    @Override
    public Person createPerson(Person person) {

        if (person.getEmail() == null || person.getEmail().isBlank())
            throw new IllegalArgumentException("The Person e-Mail is null or empty!");

        var id = new AtomicLong().incrementAndGet();
        person.setId(id);
        return person;
    }
}
