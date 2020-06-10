package com.rleon.testcontainers;

import org.jenkinsci.test.acceptance.docker.Docker;
import org.jenkinsci.test.acceptance.docker.DockerContainer;
import org.jenkinsci.test.acceptance.docker.DockerFixture;
import org.jenkinsci.utils.process.CommandBuilder;

import java.io.IOException;

//@DockerFixture(id = "squid", ports = 3128)
public class SquidContainer extends DockerContainer {
    
    public String getAccessLog() throws IOException, InterruptedException {
        //docker exec squid tail -1000 /var/log/squid/access.log
        CommandBuilder cb = Docker.cmd("exec", this.getCid(), "tail", "-1000", "/var/log/squid/access.log");
        return cb.popen().asText();
    }
}
