package models;

public class MenuItem implements Comparable<MenuItem> {
	
	private long id;
	private long menu_id;
	private String name, description, category;
	
	public MenuItem(long id, long menu_id, String name, String description, String category) {
		this.id = id;
		this.menu_id = menu_id;
		this.name = name;
		this.description = description;
		this.category = category;
	}
	
	public MenuItem() {}

	public int compareTo(MenuItem item) {
		return this.name.compareTo(item.name);
	}
}

