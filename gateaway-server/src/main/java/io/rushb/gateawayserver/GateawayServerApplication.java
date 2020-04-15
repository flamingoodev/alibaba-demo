package io.rushb.gateawayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GateawayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateawayServerApplication.class, args);
    }

}
