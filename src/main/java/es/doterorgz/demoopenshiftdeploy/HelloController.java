package es.doterorgz.demoopenshiftdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/hello/{name}")
    public String sayHelloy(@PathVariable String name) {
        return "Hello my friend" + name + "!!!";
    }

}
