package com.examples.mockito.mockitoexamples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;

public class SpyTest {
   // spy -> partial mock --> suggested use -> legacy projects
    // mock -> changeable
    // spy -> not changeable


    @Test
    void testV1() {
        // List<String> mockArrayList = mock(ArrayList.class);
        List<String> mockArrayList = spy(ArrayList.class);
        assertEquals(0, mockArrayList.size());

        // when(mockArrayList.size()).thenReturn(5);
        mockArrayList.add("Foo Bar");
        // assertEquals(5, mockArrayList.size());
        assertEquals(1, mockArrayList.size());
        mockArrayList.remove("Foo Bar");
        assertEquals(0, mockArrayList.size());
    }

    @Test
    void testV2() {
        List<String> mockArrayList = spy(ArrayList.class);
        assertEquals(0, mockArrayList.size());

        when(mockArrayList.size()).thenReturn(5);
        assertEquals(5, mockArrayList.size());
    }

    @Test
    void testV3() {
        List<String> mockArrayList = spy(ArrayList.class);
        mockArrayList.add("Foo Bar");

        verify(mockArrayList).add("Foo Bar");
        verify(mockArrayList, never()).remove(anyString());
        verify(mockArrayList, never()).clear();
    }
}
