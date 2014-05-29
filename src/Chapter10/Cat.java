package Chapter10;

public class Cat {
	// Field name
	private String name;
	// Field color
	private String color;

	// Default constructor
	public Cat() {
		this.setName("Unnamed");
		this.setColor("gray");
	}
	public void sayMiau() {
		System.out.printf("Cat %s said: Miauuuuuu!%n", name);
		}

	// Constructor with parameters
	public Cat(String name, String color) {
		this.setName(name);
		this.setColor(color);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
