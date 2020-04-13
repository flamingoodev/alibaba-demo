package io.rushb.nacosconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * feign demo
 *
 * @author <a href="mailto:flamingodev@outlook.com">FLAMINGO</a>
 * @since 2020/4/14 01:21
 */
@FeignClient("nacos-provider")
public interface DemoFeignService {
    @GetMapping("demo")
    String demo(@RequestParam("name") String name);
}
