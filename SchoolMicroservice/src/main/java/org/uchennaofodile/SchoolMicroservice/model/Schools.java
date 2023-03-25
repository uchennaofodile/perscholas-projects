package org.uchennaofodile.SchoolMicroservice.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Schools {
	@JsonProperty
	UUID id;
	@JsonProperty
	String Schoolname;
	@JsonProperty
	String address;
	
	
	
}
