package day4_27_07_23.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day4_27_07_23.entities.Pizza;

@Service
public class PizzaService implements PizzaDao{

	@Autowired
	private PizzaRepository pr;
	
	@Override
	public void save(Pizza pizza) {
		pr.save(pizza);
		System.out.println();
		System.out.println(pizza.getNomeProdotto() + " salvata\n");
	}

	@Override
	public void findByIdAndUpdate(int id, Pizza pizza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByIdAndDelete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pizza findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pizza findByName(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pizza> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
