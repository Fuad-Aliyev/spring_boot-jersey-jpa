package org.fuad.spring.springbootjerseyrestcrudjpa.repository;

import org.springframework.stereotype.Repository;
import org.fuad.spring.springbootjerseyrestcrudjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
