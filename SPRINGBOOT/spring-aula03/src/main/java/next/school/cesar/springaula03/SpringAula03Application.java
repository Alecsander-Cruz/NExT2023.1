package next.school.cesar.springaula03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping("/produtos")
public class SpringAula03Application {

	public static void main(String[] args) {

		SpringApplication.run(SpringAula03Application.class, args);

	}

	@GetMapping
	public String hello(){
		return "hello";
	}

}
