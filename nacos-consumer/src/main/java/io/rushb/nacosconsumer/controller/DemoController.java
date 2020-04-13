package io.rushb.nacosconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * Demo
 *
 * @author <a href="mailto:flamingodev@outlook.com">FLAMINGO</a>
 * @since 2020/4/14 00:51
 */
@RestController
public class DemoController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /** restTemplate用法
     * @param name name
     * @return String name
     */
    @GetMapping("demo")
    public String demo(@RequestParam("name") String name) {
        URI uri = loadBalancerClient.choose("nacos-provider").getUri();
        return restTemplate.getForObject(uri + "/demo?name=" + name, String.class);
    }
}
