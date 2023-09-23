package my.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface TestController {

    @GetMapping
    String get();
}
