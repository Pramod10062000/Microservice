package com.user.entities;

public class Hotels {

	
	private String Id;
	private String name;
	private String Location;
	private String about;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	@Override
	public String toString() {
		return "Hotels [Id=" + Id + ", name=" + name + ", Location=" + Location + ", about=" + about + "]";
	}
	public Hotels(String id, String name, String location, String about) {
		super();
		Id = id;
		this.name = name;
		Location = location;
		this.about = about;
	}
	public Hotels() {
		super();
		// TODO Auto-generated constructor stub
	}
}
