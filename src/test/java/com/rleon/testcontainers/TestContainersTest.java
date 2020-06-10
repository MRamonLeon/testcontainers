package com.rleon.testcontainers;

import org.junit.Rule;
import org.junit.Test;
import org.testcontainers.containers.GenericContainer;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class TestContainersTest {
    private final Logger log = Logger.getLogger(TestContainersTest.class.getName());
    
    @Rule
    public GenericContainer container = new GenericContainer<>("alpine:latest")
           .withFileSystemBind("/var/lib/docker", "/var/lib/docker")
           .withFileSystemBind("/var/run/docker.sock", "/var/run/docker.sock")
           .withPrivilegedMode(true);
    
     //-v $PWD:$PWD -w $PWD -v /var/run/docker.sock:/var/run/docker.sock
    @Test
    public void testContainersTest() {
        assertNotNull(container.getHost());
        log.info("Alpine started in host: " + container.getHost());
        log.info("Logs of squid: \n" + container.getLogs());
    }
    
//    @Test
//    public void anotherTest() {
//        System.out.println("Another test");
//    }
}
