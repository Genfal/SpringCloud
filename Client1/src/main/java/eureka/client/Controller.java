package eureka.client;

import my.api.TestController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller implements TestController {

    @Override
    public String get() {
        return "Hui";
    }
}
