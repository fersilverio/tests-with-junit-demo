package com.session.tdd.testexamples;

import com.session.tdd.testexamples.models.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonServiceTest {

    @DisplayName("When Create a Person with Success should return a Person Object")
    @Test
    void testCreatePerson_WhenSuccess_ShouldReturnPersonObject(){
        // Given / arrange
        IPersonService service = new PersonService();

        Person person = new Person(
                "Keith",
                "Moon",
                "kmoon@test.com.br",
                "Wembley - UK",
                "Male"
        );
        // when / act
        Person actual = service.createPerson(person);
        // Then /  Assert

        assertNotNull(actual, () ->  "The createPerson() should not have returned null!");
    }
}
