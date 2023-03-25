package org.uchennaofodile.springcrudapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.uchennaofodile.springcrudapi.model.Tutorial;

@RepositoryRestResource(collectionResourceRel="tutorials", path="tutorials")
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
//Tutorial -> Entity type and Long --> primary key
	
	
	//findByPublished is a custom method()
	//http://localhost:8080/api/tutorials/search/findByPublished?published=true
	List<Tutorial> findByPublished(boolean published);
}
