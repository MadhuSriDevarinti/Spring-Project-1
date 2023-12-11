package com.example.animal.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class dao {
	
	@Autowired
	
	private final JdbcTemplate jdbcTemplate;
	public dao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Map<String,Object> getId(int id){
		String query = "select * from animal where id=?";
		return jdbcTemplate.queryForMap(query,id);
	}
	
	public List<Map<String,Object>> getAll(){
		String query = "select * from animal";
		return jdbcTemplate.queryForList(query);
	}
	
	public int Insert(Animal animal) {
		String query = "insert into animal values(?,?,?,?)";
		return jdbcTemplate.update(query,animal.getId(),animal.getAnimal_kind(),animal.getAnimal_name(),animal.getAnimal_years());
	}
	public int Update(Animal animal,int id) {
		String query = "update animal set animal_name=? where id =?";
		return jdbcTemplate.update(query,animal.getAnimal_name(),id);
	}
	
	public int Delete(Animal animal) {
		String query = "delete from animal where id=?";
		return jdbcTemplate.update(query,animal.getId());
	}
}
