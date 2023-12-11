package com.example.animal.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.animal.dao.Animal;
import com.example.animal.service.service;

@RestController  // controller class automatically serializes return objects into HttpResponse 
public class controller {

	@Autowired
	private final service ServiceClass;
	public controller(service ServiceClass) {
		this.ServiceClass = ServiceClass;
	}
	
	@GetMapping("/getId/{id}")  // used for mapping http get req 
	public Map<String,Object> getId(@PathVariable(value="id") int id) {
		return ServiceClass.getId(id);
	}
	
	@GetMapping("/getAll")
	public List<Map<String,Object>> getAll() {
		return ServiceClass.getAll();
	}
	
	@GetMapping("/Insert")
	public void Insert(Animal animal) {
		ServiceClass.Insert(animal);
	}
	
	@PostMapping("/Insert") // allows you to receive and process data submitted through post req
	public int insertanimal(@RequestBody Animal a) {
		 return ServiceClass.Insert(a);
	} 
	
	
	@PutMapping("/Update/{id}")
	public int Update1(@RequestBody Animal a, @PathVariable int id) {
		return ServiceClass.Update(a, id);
		
	}
	
	@GetMapping("/Delete/{id}")
	public int Delete(Animal animal) {
		return ServiceClass.Delete(animal);
	}
	
	@DeleteMapping("/Delete/{id}")  // map http delete req onto specific handler methods
	public int Delete1(Animal animal) {
		return ServiceClass.Delete(animal);
	}
	
	
	
}
