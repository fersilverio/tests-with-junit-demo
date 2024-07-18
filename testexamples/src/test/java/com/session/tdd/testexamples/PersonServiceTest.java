package com.session.tdd.testexamples;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonServiceTest {

    @DisplayName("When Create a Person with Success should return a Person Object")
    @Test
    void testCreatePerson_WhenSuccess_ShouldReturnPersonObject(){
        // Given / arrange
        IPersonService service = new PersonService();
        // when / act
        
        // Then /  Assert
    }
}
