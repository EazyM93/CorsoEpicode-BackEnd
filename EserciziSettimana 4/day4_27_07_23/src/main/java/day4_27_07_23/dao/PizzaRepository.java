package day4_27_07_23.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import day4_27_07_23.entities.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Integer>{
	
}
