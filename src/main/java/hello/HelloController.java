package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
        public String index() {
            return "Welcome to the world of Devops";
        }
    @RequestMapping("/hello")
        public String index2() {

            return "Created by Jino\n";
        }

}
