package model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Integer age;
    private List<Food> foods = new ArrayList<Food>();
     
    public Person(String name, Integer age, List<Food> foods) {
        this.name = name;
        this.age = age;
        this.foods = foods;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}
    
}
