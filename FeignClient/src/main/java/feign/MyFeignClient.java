package feign;

import my.api.TestController;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("client1")
public interface MyFeignClient extends TestController {
}
