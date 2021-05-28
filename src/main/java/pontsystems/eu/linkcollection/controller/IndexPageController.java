package pontsystems.eu.linkcollection.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {

    @GetMapping(value = {"/","/index"})
    public String loadIndex() {
        return "index";
    }

}
