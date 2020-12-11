package com.stockpiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockpiles.model.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
