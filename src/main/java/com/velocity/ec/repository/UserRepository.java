package com.velocity.ec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.velocity.ec.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value ="FROM User where email=?1")

	public User findUserByEmailAndPassword(String email);

	User findByEmail(String email);

}
