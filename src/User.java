public class User {
	public Integer id;
	public String name;
	public Integer age;

	public User(Integer id, String name, Integer age){
		this.id = id;
		this.name = name;
		this.age = age;

	}

	public Integer getId() {
		return id;
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

	public String toString() {
        return "(" + this.id + " " + this.name + " " + this.age + ")";
    }
}
