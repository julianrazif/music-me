package julian.razif.figaro.music.me.artists_service.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public String index() {
        return "Hello World";
    }
}
