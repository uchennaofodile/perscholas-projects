package org.uchennaofodile.StudentMicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {
	@JsonProperty("id")
	int id;
	@JsonProperty("name")
	String name;
	@JsonProperty("className")
	String className;

	public Student(String name, String className) {
		super();
		this.name = name;
		this.className = className;
	}

}
