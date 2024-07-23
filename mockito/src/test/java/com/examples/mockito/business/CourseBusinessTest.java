package com.examples.mockito.business;

import com.examples.mockito.services.CourseService;
import com.examples.mockito.services.stubs.CourseServiceStub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseBusinessTest {
    @Test
    void testCoursesRelatedToSpring_When_UsingAStub() {
        /// Given
        CourseService stubService = new CourseServiceStub();
        CourseBusiness business = new CourseBusiness(stubService);

        //When
        var filteredCourses = business.retrieveCoursesRelatedToSpring("Fernando");
        // Then / Assert
        assertEquals(4, filteredCourses.size());
    }

    @Test
    void testCoursesRelatedToSpring_When_UsingAFooBarStudent() {

        // Given / Arrange
        CourseService stubService = new CourseServiceStub();
        CourseBusiness business = new CourseBusiness(stubService);

        // When / Act
        var filteredCourses =
                business.retrieveCoursesRelatedToSpring("Foo Bar");

        // Then / Assert
        assertEquals(0, filteredCourses.size());
    }
}
