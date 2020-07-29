package controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Person;
import service.PersonService;

@RestController // @Controller + @Responsebody
@RequestMapping("/persons")
//@RequestMapping("/api")
public class PersonController {
	
	@Autowired
	PersonService ps;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public Hashtable<String, Person> getAll(){
		return ps.getAll();
		
	}
	
	@RequestMapping("/{id}")
	public Person getPerson(@PathVariable("id") String id) {
		return ps.getPerson(id);
	}
	
	@RequestMapping("/greeting")
	public String getName(@RequestParam(value="name") String userName) {
		return "Hello there,"+userName;
	}

}
