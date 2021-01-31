package week11_trees;

public class Person {
	private int personAge;
	private String name;
	
	public Person () {
		personAge = 0;
		name = "";
	}
	
	public Person(int p, String n) {
		personAge = p;
		name = n;
	}
	
	public void setpersonAge(int p) {
		personAge = p;
	}
	
	public void setname(String n) {
		name = n;
	}
	
	public int getpersonAge() {
		return personAge;
	}
	
	public String getname() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [personAge=" + personAge + ", name=" + name + "]";
	}

	
}
