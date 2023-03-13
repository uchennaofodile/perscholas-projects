package com.perscholas.PostMappingDemo.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;


@NoArgsConstructor
@RequiredArgsConstructor
@FieldDefaults(level =AccessLevel.PRIVATE)
@Data
public class User {
	int id;
	String name;
	String email;
	
	public User(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
		}
	
	@Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
}
}
