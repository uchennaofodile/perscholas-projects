package org.uchennaofodile.StudentRepo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uchennaofodile.StudentRepo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	Student findByAccountNo(Long accountNo);
	List<Student> findByNameContaining(String name);
}
