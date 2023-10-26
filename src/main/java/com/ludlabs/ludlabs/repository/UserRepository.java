package com.ludlabs.ludlabs.repository;

import com.ludlabs.ludlabs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByNameAndPassword(String nome, String senha);
}
