package com.example.animal.dao;

public class Animal {

	private int id;
	private String animal_kind;
	private String animal_name;
	private int animal_years;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnimal_kind() {
		return animal_kind;
	}
	public void setAnimal_kind(String animal_kind) {
		this.animal_kind = animal_kind;
	}
	public String getAnimal_name() {
		return animal_name;
	}
	public void setAnimal_name(String animal_name) {
		this.animal_name = animal_name;
	}
	public int getAnimal_years() {
		return animal_years;
	}
	public void setAnimal_years(int animal_years) {
		this.animal_years = animal_years;
	}
}
