package next.school.cesar.springaula03.controller;

import next.school.cesar.springaula03.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @GetMapping("/")
    public Person getPerson(String name, String surname, int age){
        return new Person(name, surname, age);
    }

    @GetMapping("/")
    public Person getPerson(@RequestParam(value = "name", defaultValue = "Fulano")String name){
        return new Person(name, "Doe", 35);
    }
}
