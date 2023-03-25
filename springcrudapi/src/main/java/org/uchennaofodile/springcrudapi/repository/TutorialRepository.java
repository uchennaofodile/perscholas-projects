package org.uchennaofodile.springcrudapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uchennaofodile.springcrudapi.model.Tutorial;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
//Tutorial -> Entity type and Long --> primary key
	
	
	//findByPublished is a custom method()
	List<Tutorial> findByPublished(boolean published);
}
