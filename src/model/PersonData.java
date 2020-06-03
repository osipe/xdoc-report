package model;

import java.util.ArrayList;
import java.util.List;

public class PersonData {
	private static List<Person> people = new ArrayList<Person>();
	static {
		List<Food> foods1 = new ArrayList<Food>();
		foods1.add(new Food("A1aaaaaaaaaaaaaa"));
		foods1.add(new Food("A232"));
		List<Food> foods2 = new ArrayList<Food>();
		foods2.add(new Food("B13131123"));
		foods2.add(new Food("B2"));
		people.add(new Person("Tom Riddle", 50, foods1));
		people.add(new Person("Harry Potter", 20, foods2));
	}

	public static List<Person> getPeople() {
		return people;
	}
}
