package day4_27_07_23.dao;

import java.util.List;

import day4_27_07_23.entities.Pizza;

public interface PizzaDao {

	public void save(Pizza pizza);

	public void findByIdAndUpdate(int id, Pizza pizza);

	public void findByIdAndDelete(int id);

	public Pizza findById(int id);
	
	public Pizza findByName(String nome);

	public List<Pizza> findAll();
	
}
