package io.rushb.nacosconsumerfeign.controller;

import io.rushb.nacosconsumerfeign.service.DemoFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo
 *
 * @author <a href="mailto:flamingodev@outlook.com">FLAMINGO</a>
 * @since 2020/4/14 00:51
 */
@RestController
public class DemoController {
    @Autowired
    private DemoFeignService demoFeignService;

    /**
     * feign
     *
     * @param name name
     * @return String name
     */
    @GetMapping("demo")
    public String feignDemo(@RequestParam("name") String name) {
        return demoFeignService.demo(name);
    }
}
