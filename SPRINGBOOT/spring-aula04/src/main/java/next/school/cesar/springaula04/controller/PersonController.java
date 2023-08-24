package next.school.cesar.springaula04.controller;

import next.school.cesar.springaula04.entity.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    ArrayList<Person> listPerson = new ArrayList<Person>();

    @GetMapping
    public ResponseEntity<List<Person>> getListPerson(){
        if(listPerson.size() <= 0){
            return new ResponseEntity<List<Person>>(this.listPerson, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Person>>(this.listPerson, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Person> create(@RequestBody Person p){
        this.listPerson.add(p);

        return new ResponseEntity<Person>(p, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> update(@RequestBody Person p, @PathVariable(value = "id") int id){
        for (Person person:
             listPerson) {
            if(person.getId() == id){
                person.setName(p.getName());
                person.setAge(p.getAge());
                return new ResponseEntity<Person>(person, HttpStatus.OK);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Person> delete(@PathVariable(value = "id") int id){
        for (Person person:
             listPerson) {
            if(person.getId() == id){
                listPerson.remove(person);
                return new ResponseEntity<>(HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
