package service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import model.Person;

@Service
public class PersonService {
	Hashtable<String,Person> persons=new Hashtable<String,Person>();
	
public PersonService() {

	Person p=new Person();
	p.setId("1");
	p.setFirstName("Vidula");
	p.setLastName("Sawant");
	persons.put("1",p);
	
	p=new Person();
	p.setId("2");
	p.setFirstName("Aarvi");
	p.setLastName("Sawant");
	persons.put("2",p);
	
	p=new Person();
	p.setId("3");
	p.setFirstName("Rahul");
	p.setLastName("Sawant");
	persons.put("2",p);
	
	p=new Person();
	p.setId("4");
	p.setFirstName("Varsha");
	p.setLastName("Sawant");
	persons.put("2",p);
}

public Person getPerson(String id) {
	if(persons.containsKey(id))
		return persons.get(id);
	else
		return null;
}

public Hashtable<String, Person> getAll(){
	return persons;
	
}

}
