package com.rleon.testcontainers;

import org.junit.Rule;
import org.junit.Test;
import org.testcontainers.containers.GenericContainer;

import static org.junit.Assert.*;

public class TestContainersTest {
    @Rule
    public GenericContainer container = new GenericContainer<>("alpine:latest");
    
    @Test
    public void testContainersTest() {
        assertNotNull(container.getHost());
        System.out.println("Alpine started in host: " + container.getHost());
    }
    
    @Test
    public void anotherTest() {
        System.out.println("Another test");
    }
}
