package org.uchennaofodile.springcrudapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
@Entity
@Table(name="tutorials")
public class Tutorial {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@JsonProperty
Long id;

@Column(name="title")
@JsonProperty
String title;

@Column(name="description")
@JsonProperty
String description;

@Column(name="published")
@JsonProperty
Boolean published;


}
