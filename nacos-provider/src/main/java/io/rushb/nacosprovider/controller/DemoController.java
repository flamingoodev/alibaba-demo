package io.rushb.nacosprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo
 *
 * @author <a href="mailto:flamingodev@outlook.com">FLAMINGO</a>
 * @since 2020/4/14 00:48
 */
@RestController
public class DemoController {
    @GetMapping("/demo")
    public String demo(@RequestParam("name") String name) {
        return "hello " + name;
    }
}
