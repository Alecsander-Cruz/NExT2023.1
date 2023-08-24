package next.school.cesar.springaula03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicos")
public class HelloController {
    @GetMapping("/entrega")
    public String entrega(){
        return "Entrega realizada!";
    }

    @GetMapping("/devolucao")
    public String devolucao(){
        return "devolvendo";
    }
}
