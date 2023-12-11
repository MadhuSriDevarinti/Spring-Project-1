package com.example.animal.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.animal.dao.Animal;
import com.example.animal.dao.dao;

@Service
public class service {

	@Autowired
	private final dao DaoClass;
	public service (dao DaoClass) {
		this.DaoClass = DaoClass;
	}
	public Map<String,Object> getId(int id){
		return DaoClass.getId(id);
	}
	
	public List<Map<String,Object>> getAll(){
		return DaoClass.getAll();
	}
	
	public int Insert(Animal animal){
		return DaoClass.Insert(animal);
	}
	
	public int Update(Animal animal, int id){
		return DaoClass.Update(animal,id);
	}
	
	public int Delete(Animal animal){
		return DaoClass.Delete(animal);
	}
}
