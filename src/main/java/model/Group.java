package model;

public class Group {
	
	private String name;
	private String viewURL;
	
	public Group(String name, String URL) {
		viewURL = URL;
		this.name = name;
	}
	
	public String getURL() {
		return viewURL;
	}
	
	public String getName() {
		return name;
	}
	
}
