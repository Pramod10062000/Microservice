package com.user.entities;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="UserEntity")
public class UserEntity {
	
	@Id
	public String Id;
	public String name;
	public String about;
	public String email;
	
	@Transient
	private List<Rating> rating=new ArrayList<>();

	public String getId() {
		return Id;
	}

	public void setId(String Id) {
		this.Id = Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Rating> getRating() {
		return rating;
	}

	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}

	public UserEntity(String Id, String name, String about, String email, List<Rating> rating) {
		super();
		this.Id = Id;
		this.name = name;
		this.about = about;
		this.email = email;
		this.rating = rating;
	}

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserEntity [Id=" + Id + ", name=" + name + ", about=" + about + ", email=" + email + ", rating="
				+ rating + "]";
	}
	
}

