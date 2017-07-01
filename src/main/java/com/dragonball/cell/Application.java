package com.dragonball.cell;

import com.dragonball.cell.model.Person;
import com.dragonball.frieza.HelloService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
@MapperScan(basePackages = "com.dragonball.cell.dao")
public class Application {

	@RequestMapping("/")
    public String index(Model model) {
        Person single = new Person("Allard", 20);
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            people.add(new Person("Jobs" + i, i + 30));
        }
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "index";
    }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
