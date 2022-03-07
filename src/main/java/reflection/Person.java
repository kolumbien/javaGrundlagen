package reflection;

public class Person {
	
	private String name;
	public int age;
	protected String genre;

	private String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(final String genre) {
		this.genre = genre;
	}
}
