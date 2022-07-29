package com.simplilearn.models;

public class Subject {
	
	private int id;
	private String Subject_name;
	//private String shortcut;
	
	public Subject(int id, String Subject_name ) {
		super();
		this.id = id;
		this.Subject_name = Subject_name;
		//this.shortcut = shortcut;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//public String getShortcut() {
		//return shortcut;
	//}

	//public void setShortcut(String shortcut) {
		//this.shortcut = shortcut;
	//}

	public String getName() {
		return Subject_name;
	}

	public void setName(String Subject_name) {
		this.Subject_name =Subject_name;
	}

	@Override
	public String toString() {
		return "Subjects [id=" + id + ", Subject_name=" + Subject_name + "]";
	}
	
	
	

}

