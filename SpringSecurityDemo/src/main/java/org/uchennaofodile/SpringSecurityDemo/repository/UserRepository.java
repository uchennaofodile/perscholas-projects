package org.uchennaofodile.SpringSecurityDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uchennaofodile.SpringSecurityDemo.entity.User;

@Repository //Not needed
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
