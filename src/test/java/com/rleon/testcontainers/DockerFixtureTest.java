package com.rleon.testcontainers;

import org.jenkinsci.test.acceptance.docker.DockerRule;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class DockerFixtureTest {
    @Rule
    public DockerRule<SquidContainer> rule = new DockerRule<>(SquidContainer.class);
    private SquidContainer container;
    
    @Test
    public void dockerContainerTest() throws IOException, InterruptedException {
        container = rule.get();
        System.out.print("***** SQUID LOGS AT DOCKER FIXTURE *****");
        System.out.println(new String(Files.readAllBytes(container.getLogfile().toPath()), StandardCharsets.UTF_8));
        System.out.print("\n\n\n");
        System.out.print("***** SQUID ACCESS LOGS AT DOCKER FIXTURE *****");
        System.out.println(container.getAccessLog());
    }
}
